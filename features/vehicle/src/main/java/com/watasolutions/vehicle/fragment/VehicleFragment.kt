package com.watasolutions.vehicle.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.watasolutions.vehicle.databinding.FragmentVehicleBinding

class VehicleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentVehicleBinding.inflate(inflater, container, false)
        return binding.root
    }
}