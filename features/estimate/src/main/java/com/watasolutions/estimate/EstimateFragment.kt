package com.watasolutions.estimate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.watasolutions.demomodule.navigation.NavigationFlow
import com.watasolutions.demomodule.navigation.ToFlowNavigatable
import com.watasolutions.estimate.databinding.FragmentEstimateBinding
import kotlinx.android.synthetic.main.fragment_estimate.*

class EstimateFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = FragmentEstimateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSelectClient.setOnClickListener {
            Toast.makeText(requireContext(), "Clicked", Toast.LENGTH_LONG).show()
        }

        btnToService.setOnClickListener {
            (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.ServicesFlow)
        }
    }
}