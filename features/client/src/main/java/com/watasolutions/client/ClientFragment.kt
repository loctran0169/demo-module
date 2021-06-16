package com.watasolutions.client

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.watasolutions.client.databinding.FragmentClientBinding
import com.watasolutions.demomodule.MainActivity
import kotlinx.android.synthetic.main.fragment_client.*

class ClientFragment : Fragment(), ClientAdapter.ClientAdapterListener {

    private val clientAdapter: ClientAdapter by lazy {
        ClientAdapter(requireContext(), mutableListOf(), this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentClientBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rcvClient.adapter = clientAdapter

        clientAdapter.updateDate(create1000Client())
    }

    private fun create1000Client(): List<Client> {
        val list = mutableListOf<Client>()
        repeat(1000) {
            list.add(
                Client(
                    id = it,
                    name = it.toString()
                )
            )
        }
        return list
    }

    override fun onClientItemClicked(client: Client) {
        setFragmentResult("client_id_pick", bundleOf("client_select" to client.id.toString()))
        (requireActivity() as? MainActivity)?.appPrefs?.put("client_select", client)
        findNavController().navigateUp()
    }
}