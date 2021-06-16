package com.watasolutions.scheduling

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.watasolutions.scheduling.databinding.FragmentSchedulingBinding

class SchedulingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentSchedulingBinding.inflate(inflater, container, false)
        return binding.root
    }
}