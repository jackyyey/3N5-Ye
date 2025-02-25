package org.ye.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.ye.Nombre
import org.ye.databinding.ObjetcomplexItemBinding

class NombreAdapter : ListAdapter<Nombre, NombreAdapter.NombreItemViewHolder>(PersonneItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout personne_item.xml
    inner class NombreItemViewHolder(private val binding: ObjetcomplexItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(personne: Nombre) {
            binding.txChiffre.text = personne.nombre.toString()
            binding.txNom.text = personne.description
            binding.txListeLength.text = personne.representation

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NombreItemViewHolder {
        val binding: ObjetcomplexItemBinding = ObjetcomplexItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NombreItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NombreItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object PersonneItemDiffCallback : DiffUtil.ItemCallback<Nombre>() {
    override fun areItemsTheSame(oldItem: Nombre, newItem: Nombre): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Nombre, newItem: Nombre): Boolean {
        return oldItem.nombre == newItem.nombre &&
                oldItem.representation == newItem.representation &&
                oldItem.description == oldItem.description
    }
}