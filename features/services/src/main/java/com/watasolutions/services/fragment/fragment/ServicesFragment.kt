package com.watasolutions.services.fragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.watasolutions.services.R
import com.watasolutions.services.databinding.FragmentServicesBinding
import kotlinx.android.synthetic.main.fragment_services.*

class ServicesFragment : Fragment() {

//    private val navController get() = Navigation.findNavController(requireActivity(), R.id.navHostServicesFragment)

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.featureVehicleNavGraph -> {
//                main_view_pager.currentItem = 0
                return@OnNavigationItemSelectedListener true
            }
            R.id.featurePhotoNavGraph -> {
//                main_view_pager.currentItem = 1
                return@OnNavigationItemSelectedListener true
            }
            R.id.featureComPricingNavGraph -> {

            }
        }
        false
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentServicesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navHostFragment = childFragmentManager.findFragmentById(
            R.id.navHostServicesFragment
        ) as NavHostFragment
//        navController = navHostFragment.navController
        bnvServices.setupWithNavController(navHostFragment.navController)
//        bnvServices.setOnNavigationItemReselectedListener { }
    }
}