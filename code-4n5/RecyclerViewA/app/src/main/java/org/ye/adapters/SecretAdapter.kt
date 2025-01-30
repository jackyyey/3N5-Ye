package org.ye.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.ye.databinding.SecretItemBinding
import org.ye.model.Secret

class SecretAdapter: ListAdapter<Secret, SecretAdapter.SecretItemViewHolder>(SecretItemDiffCallback) {
    inner class SecretItemViewHolder(private val binding: SecretItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(secret: Secret){
            binding.txNom.text = secret.nom.toString()
            binding.txDate.text = secret.date.toString()
            binding.txNb.text = secret.nbGrand.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecretItemViewHolder {
        val binding: SecretItemBinding = SecretItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SecretItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SecretItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object SecretItemDiffCallback : DiffUtil.ItemCallback<Secret>() {
    override fun areItemsTheSame(oldItem: Secret, newItem: Secret): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Secret, newItem: Secret): Boolean {
        return oldItem.nom == newItem.nom &&
                oldItem.date == newItem.date &&
                oldItem.nbGrand == newItem.nbGrand
    }
}

