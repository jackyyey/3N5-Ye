package org.ye.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.ye.databinding.LongItemBinding

class LongAdapter : ListAdapter<Long, LongAdapter.LongItemViewHolder>(LongItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout mon_item.xml
    inner class LongItemViewHolder(private val binding: LongItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Long) {
            binding.txLong.text = item.toString() // On affiche l'élément dans le TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LongItemViewHolder {
        val binding: LongItemBinding = LongItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LongItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LongItemViewHolder, position: Int) {
        val item: Long = getItem(position)
        holder.bind(item)
    }

}

object LongItemDiffCallback : DiffUtil.ItemCallback<Long>() {
    override fun areItemsTheSame(oldItem: Long, newItem: Long): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Long, newItem: Long): Boolean {
        return oldItem == newItem
    }
}