package org.ye.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import org.ye.databinding.BingoBinding
import org.ye.models.Bingo
import org.ye.adapters.BingoAdapter.BingoViewHolder

class BingoAdapter: androidx.recyclerview.widget.ListAdapter<Bingo,BingoViewHolder>(AlbumDiffCallback) {

    inner class BingoViewHolder(private val binding: BingoBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Bingo) {
            binding.Tirage.text = item.name
            binding.numero.text = "Numéro Tiré: ${item.numeroTire}"
            binding.LettreBingo.text = when(item.numeroTire) {
                in 1..15 -> "B"
                in 16..30 -> "I"
                in 31..45 -> "N"
                in 46..60 -> "G"
                else -> "O"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BingoViewHolder {
    val binding = BingoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return BingoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BingoViewHolder, position: Int) {
    val albumTitle = getItem(position)
    holder.bind(albumTitle)
    }

}
    object AlbumDiffCallback: DiffUtil.ItemCallback<Bingo>() {
        override fun areItemsTheSame(oldItem: Bingo, newItem: Bingo): Boolean {
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: Bingo, newItem: Bingo): Boolean {
            return oldItem.name == newItem.name && oldItem.numeroTire == newItem.numeroTire
        }
    }