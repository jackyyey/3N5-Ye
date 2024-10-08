package org.ye.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import org.ye.databinding.AlbumBinding

class AlbumAdapter: androidx.recyclerview.widget.ListAdapter<String, AlbumAdapter.AlbumViewHolder>(AlbumDiffCallback) {

    inner class AlbumViewHolder(private val binding: AlbumBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.titreAlbum.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
    val binding = AlbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return AlbumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
    val albumTitle = getItem(position)
    holder.bind(albumTitle)
    }

}
    object AlbumDiffCallback: DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }