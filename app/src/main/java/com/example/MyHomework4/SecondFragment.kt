package com.example.MyHomework4

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.MyHomework4.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second){

    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

                val color = requireArguments().getInt(ARG_COLOR)

        binding.root.setBackgroundColor(color)

        binding.returnToFirstFragmentButton.setOnClickListener {
                    findNavController().popBackStack()
        }
        binding.thirdFragmentButton.setOnClickListener {
                   findNavController().navigate(R.id.action_SecondFragment_to_ThirdFragment)
        }

    }

    companion object {
        const val ARG_COLOR = "color"

    }
}