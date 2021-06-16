package com.watasolutions.services.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.watasolutions.services.fragment.module.ComPricingFragment
import com.watasolutions.services.fragment.module.PhotoFragment
import com.watasolutions.services.fragment.module.ServicesAllFragment
import com.watasolutions.services.fragment.module.VehicleFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> VehicleFragment()
            1 -> PhotoFragment()
            2 -> ComPricingFragment()
            else -> ServicesAllFragment()
        }
    }

    override fun getCount(): Int {
        return 4
    }
}