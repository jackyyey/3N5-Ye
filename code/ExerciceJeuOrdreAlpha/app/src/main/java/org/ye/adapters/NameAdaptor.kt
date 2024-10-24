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
            binding.Nom.text = item
            binding.btnMonter.setOnClickListener{
                val liste = currentList.toMutableList()
                if (adapterPosition > 0)
                {
                    var indexCourant = liste[adapterPosition]
                    liste[adapterPosition] = liste[adapterPosition-1]
                    liste[adapterPosition-1] = indexCourant
                    submitList(liste)
                    checkifwin(liste)
                }
            }
            binding.btnDescendre.setOnClickListener{
                val liste = currentList.toMutableList()
                if (adapterPosition < liste.size-1)
                {
                    var indexCourant = liste[adapterPosition]
                    liste[adapterPosition] = liste[adapterPosition+1]
                    liste[adapterPosition+1] = indexCourant
                    submitList(liste)
                    checkifwin(liste)
                }
            }
        }
        fun checkifwin(list: List<String>){
            var sortedList = list.sorted()
            val s = list == sortedList
            if (list == sortedList)
            {
                val builder = AlertDialog.Builder(binding.root.context)
                builder.setTitle("p")
                builder.setMessage("j")
                builder.setPositiveButton("yes"){
                    dialog, _ -> dialog.dismiss()
                }
                builder.create()
                builder.show()
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