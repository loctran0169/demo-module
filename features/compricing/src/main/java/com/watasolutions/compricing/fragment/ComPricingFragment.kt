package com.watasolutions.compricing.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.watasolutions.compricing.databinding.FragmentComPricingBinding

class ComPricingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentComPricingBinding.inflate(inflater, container, false)
        return binding.root
    }
}