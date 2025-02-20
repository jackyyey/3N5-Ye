package org.ye.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.ye.Personne
import org.ye.databinding.ObjetcomplexItemBinding

class PersonneAdapter : ListAdapter<Personne, PersonneAdapter.PersonneItemViewHolder>(PersonneItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout personne_item.xml
    inner class PersonneItemViewHolder(private val binding: ObjetcomplexItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(personne: Personne) {
            binding.txChiffre.text = personne.a.toString()
            binding.txNom.text = personne.b
            binding.txListeLength.text = "Table length = " + personne.c?.size.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonneItemViewHolder {
        val binding: ObjetcomplexItemBinding = ObjetcomplexItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonneItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonneItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object PersonneItemDiffCallback : DiffUtil.ItemCallback<Personne>() {
    override fun areItemsTheSame(oldItem: Personne, newItem: Personne): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Personne, newItem: Personne): Boolean {
        return oldItem.a == newItem.a &&
                oldItem.b == newItem.b &&
                oldItem.c.contentEquals(newItem.c)
    }
}