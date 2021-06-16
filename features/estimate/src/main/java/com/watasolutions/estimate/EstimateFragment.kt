package com.watasolutions.estimate

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.lifecycle.ViewModelProviders
import com.watasolutions.client.Client
import com.watasolutions.demomodule.data.AppPrefs
import com.watasolutions.demomodule.navigation.NavigationFlow
import com.watasolutions.demomodule.navigation.ToFlowNavigatable
import com.watasolutions.estimate.databinding.FragmentEstimateBinding
import kotlinx.android.synthetic.main.fragment_estimate.*

class EstimateFragment : Fragment() {

    private val viewModel: EstimateViewModel by lazy {
        ViewModelProviders.of(this)
            .get(EstimateViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = FragmentEstimateBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.client?.let {
            tvClient.text = "Get from AppPrefs: id(${it.id}) name(${it.name})"
        }

        setFragmentResultListener("client_id_pick") { key, bundle ->
            bundle.getString("client_select")?.let {
                val client = AppPrefs(requireContext()).get("client_select", Client::class.java, Client(0, "0"))
                tvClient.text = "Get from AppPrefs: id(${client?.id}) name(${client?.name})"
                client?.let {
                    viewModel.client = it
                }
            }
        }

        btnSelectClient.setOnClickListener {
            (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.ClientFlow)
        }

        btnToService.setOnClickListener {
            (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.ServicesFlow)
        }
    }
}