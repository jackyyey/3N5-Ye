package org.ye.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import org.ye.databinding.AlbumBinding
import org.ye.models.Album

class AlbumAdapter: androidx.recyclerview.widget.ListAdapter<Album, AlbumAdapter.AlbumViewHolder>(AlbumDiffCallback) {

    inner class AlbumViewHolder(private val binding: AlbumBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Album) {
            binding.titreAlbum.text = item.name
            binding.nomArtiste.text = item.artistName
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
    object AlbumDiffCallback: DiffUtil.ItemCallback<Album>() {
        override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
            return oldItem.name == newItem.name && oldItem.artistName == newItem.artistName
        }
    }