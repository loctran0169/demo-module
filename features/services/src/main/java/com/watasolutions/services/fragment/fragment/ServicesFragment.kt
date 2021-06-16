package com.watasolutions.services.fragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.watasolutions.services.R
import com.watasolutions.services.adapter.ViewPagerAdapter
import com.watasolutions.services.databinding.FragmentServicesBinding
import kotlinx.android.synthetic.main.fragment_services.*

class ServicesFragment : Fragment() {

//    private val navController get() = Navigation.findNavController(requireActivity(), R.id.navHostServicesFragment)

    private lateinit var viewPagerAdapter: ViewPagerAdapter

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.featureVehicleNavGraph -> {
                viewPager.currentItem = 0
                return@OnNavigationItemSelectedListener true
            }
            R.id.featurePhotoNavGraph -> {
                viewPager.currentItem = 1
                return@OnNavigationItemSelectedListener true
            }
            R.id.featureComPricingNavGraph -> {
                viewPager.currentItem = 2
                return@OnNavigationItemSelectedListener true
            }
            R.id.featureServicesAllNavGraph -> {
                viewPager.currentItem = 3
                return@OnNavigationItemSelectedListener true
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
//        val navHostFragment = childFragmentManager.findFragmentById(
//            R.id.navHostServicesFragment
//        ) as NavHostFragment
//        navController = navHostFragment.navController
//        val navGraphIds = listOf(
//            R.navigation.vehicle_nav,
//            R.navigation.photo_graph,
//            R.navigation.com_pricing_nav,
//            R.navigation.services_all_nav
//        )
//
//        val controller = bnvServices.setupWithNavController(
//            navGraphIds = navGraphIds,
//            fragmentManager = childFragmentManager,
//            containerId = R.id.navHostServicesFragment,
//            intent = requireActivity().intent
//        )
//        bnvServices.setupWithNavController(navHostFragment.navController)
//        bnvServices.setOnNavigationItemReselectedListener { }

        viewPagerAdapter = ViewPagerAdapter(childFragmentManager)
        viewPager.adapter = viewPagerAdapter
        bnvServices.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}