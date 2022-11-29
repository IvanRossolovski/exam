package com.example.MyHomework4

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.MyHomework4.databinding.FragmentRootBinding

class RootFragment : Fragment(R.layout.fragment_root) {

    private lateinit var binding: FragmentRootBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRootBinding.bind(view)
              binding.secondFragmentButton.setOnClickListener {
            openBox(Color.rgb(150, 300, 450))
        }



    }

    private fun openBox(color: Int) {

        // launch BoxFragment with arguments and additional options

        findNavController().navigate(
            R.id.action_rootFragment_to_SecondFragment, // nav action to be executed
            bundleOf(SecondFragment.ARG_COLOR to color), // arguments for the destination
            // optional additional options, example of simple animation:
            navOptions {
                anim {
                    enter = R.anim.enter
                    exit = R.anim.exit
                    popEnter = R.anim.pop_enter
                    popExit = R.anim.pop_exit
                }
            }
        )
    }

}