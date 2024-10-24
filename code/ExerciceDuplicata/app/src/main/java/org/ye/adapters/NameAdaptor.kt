package org.ye.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import org.ye.databinding.AlbumBinding
import org.ye.databinding.NameBinding
import org.ye.models.Album
import java.util.jar.Attributes.Name

class NameAdaptor: androidx.recyclerview.widget.ListAdapter<String, NameAdaptor.NomViewHolder>(NomDiffCallback) {

    inner class NomViewHolder(private val binding: NameBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.Nombre.text = item
            binding.btnDupliquer.setOnClickListener{
                val liste = currentList.toMutableList()
                if (adapterPosition > 0)
                liste.add(adapterPosition+1, item)
                submitList(liste)
            }
        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NomViewHolder {
    val binding = NameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return NomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NomViewHolder, position: Int) {
    val albumTitle = getItem(position)
    holder.bind(albumTitle)
    }

}
    object NomDiffCallback: DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }