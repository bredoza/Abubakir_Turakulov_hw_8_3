package com.example.abubakir_turakulov_hw_8_3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.abubakir_turakulov_hw_8_3.databinding.FragmentCharacterDetailBinding
import com.example.abubakir_turakulov_hw_8_3.model.Character

class CharacterDetailFragment : Fragment() {

    private lateinit var binding: FragmentCharacterDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = arguments?.getSerializable("KEY") as Character
        with(binding) {
            tvName.text = data.name
            tvStatus.text = data.status
            Glide.with(ivPhoto).load(data.photoUrl).into(ivPhoto)
        }
    }
}