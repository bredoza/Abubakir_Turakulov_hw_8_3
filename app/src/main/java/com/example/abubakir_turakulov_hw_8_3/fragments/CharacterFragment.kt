package com.example.abubakir_turakulov_hw_8_3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.abubakir_turakulov_hw_8_3.databinding.FragmentMainBinding

import androidx.lifecycle.ViewModelProvider
import com.example.abubakir_turakulov_hw_8_3.R
import com.example.abubakir_turakulov_hw_8_3.adapter.CharacterAdapter
import com.example.abubakir_turakulov_hw_8_3.model.CharacterModel

class CharacterFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel: CharacterModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(CharacterModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = CharacterAdapter(viewModel.characters) { position ->
            val bundle = Bundle().apply {
                putSerializable("KEY", viewModel.characters[position])
            }
            findNavController().navigate(R.id.characterDetailFragment, bundle)
        }

        binding.rvCharacter.adapter = adapter
    }
}