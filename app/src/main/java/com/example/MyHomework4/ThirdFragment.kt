package com.example.MyHomework4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.MyHomework4.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {

    private lateinit var binding: FragmentThirdBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.callButton.setOnClickListener {
            val intentCallToSupport = Intent(Intent.ACTION_CALL)
            intentCallToSupport.data = Uri.parse("tel: +79000000000")
            startActivity(intentCallToSupport)
    }


        binding = FragmentThirdBinding.bind(view)
        binding.returnToFirstFragmentButton.setOnClickListener {

            findNavController().popBackStack(R.id.rootFragment, false)
        }
        binding.returnTosecondFragmentButton.setOnClickListener {

            findNavController().popBackStack()
        }


    }


}