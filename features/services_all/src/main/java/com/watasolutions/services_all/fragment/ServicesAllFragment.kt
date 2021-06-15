package com.watasolutions.services_all.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.watasolutions.services_all.R
import com.watasolutions.services_all.databinding.FragmentServicesAllBinding
import kotlinx.android.synthetic.main.fragment_services_all.*

class ServicesAllFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentServicesAllBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvPdr.setOnClickListener {
            findNavController().navigate(R.id.action_global_pdr_flow)
        }
    }
}