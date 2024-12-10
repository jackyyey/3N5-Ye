package org.ye.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.ye.DetailsActivity
import org.ye.databinding.AndroiditemBinding
import org.ye.models.AndroidItems

class AndroidItemAdapter: ListAdapter<AndroidItems, AndroidItemAdapter.AndroidItemViewHolder>(AndroidItemDiffCallback) {
    inner class AndroidItemViewHolder(private val binding: AndroiditemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(androiditem : AndroidItems){
            binding.txVersionAndroid.text = "Android ${androiditem.AndroidVersion}"
            binding.txItem.text = androiditem.ItemName
            binding.llInfoContainer.setOnClickListener {
                var intent = Intent(binding.root.context, DetailsActivity::class.java)
                intent.putExtra("Item",androiditem.ItemName)
                binding.root.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidItemViewHolder {
        val binding: AndroiditemBinding = AndroiditemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AndroidItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AndroidItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object AndroidItemDiffCallback: DiffUtil.ItemCallback<AndroidItems>(){
    override fun areItemsTheSame(oldItem: AndroidItems, newItem: AndroidItems): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: AndroidItems, newItem: AndroidItems): Boolean {
        return oldItem.ItemName == newItem.ItemName &&
                oldItem.AndroidVersion == newItem.AndroidVersion
    }
}