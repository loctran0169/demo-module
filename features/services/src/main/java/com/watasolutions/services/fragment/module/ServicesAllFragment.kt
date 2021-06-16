package com.watasolutions.services.fragment.module

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.watasolutions.services.databinding.FragmentSevicesAllBinding

class ServicesAllFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentSevicesAllBinding.inflate(inflater, container, false)
        return binding.root
    }
}