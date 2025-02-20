package org.ye.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.ye.Repo
import org.ye.databinding.RepoItemBinding

class RepoAdapter : ListAdapter<Repo, RepoAdapter.RepoItemViewHolder>(RepoItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout Repo_item.xml
    inner class RepoItemViewHolder(private val binding: RepoItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(repo: Repo) {
            binding.txDescription.text = repo.description
            binding.txNom.text = repo.name
            binding.btnLink.setOnClickListener(){
                val intent = Intent(Intent.ACTION_VIEW)
                var URL = Uri.parse(repo.html_url)
                intent.data = URL
                binding.root.context.startActivity(intent)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoItemViewHolder {
        val binding: RepoItemBinding = RepoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RepoItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepoItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object RepoItemDiffCallback : DiffUtil.ItemCallback<Repo>() {
    override fun areItemsTheSame(oldItem: Repo, newItem: Repo): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Repo, newItem: Repo): Boolean {
        return oldItem.name == newItem.name &&
                oldItem.description == newItem.description &&
                oldItem.html_url == newItem.html_url
    }
}