package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 * Use the [TitleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitleFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentTitleBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        addPlayButtonClickListener()

        return  binding.root
    }

    private fun addPlayButtonClickListener() {
        binding.apply {
            playButton.setOnClickListener(
                    Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
            )

            playButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment))

            /*playButton.setOnClickListener {
                //Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_gameFragment2)
                //it.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
                Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
            }*/
        }

    }

}