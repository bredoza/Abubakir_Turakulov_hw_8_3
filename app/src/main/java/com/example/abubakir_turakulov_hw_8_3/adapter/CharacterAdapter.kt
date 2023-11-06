package com.example.abubakir_turakulov_hw_8_3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.abubakir_turakulov_hw_8_3.databinding.ItemCharacterBinding
import com.example.abubakir_turakulov_hw_8_3.model.Character

class CharacterAdapter(
    private val characterList: List<Character>, private val onItemClick: (position: Int) -> Unit
) : RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = characterList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(characterList[position])
    }

    inner class ViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(character: Character) {
            with(binding) {
                tvName.text = character.name
                tvStatus.text = character.status
                Glide.with(ivPhoto).load(character.photoUrl).into(ivPhoto)

                root.setOnClickListener {
                    onItemClick(adapterPosition)
                }
            }
        }
    }
}