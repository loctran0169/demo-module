package com.watasolutions.service_pdr.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.watasolutions.service_pdr.databinding.FragmentPdrBinding

class PdrFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentPdrBinding.inflate(inflater, container, false)
        return binding.root
    }
}