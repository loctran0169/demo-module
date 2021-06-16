package com.watasolutions.demomodule.navigation

import androidx.navigation.NavController
import androidx.navigation.NavDirections
import com.watasolutions.demomodule.AppNavGraphDirections

class NavManager {
    private var navEventListener: ((navDirections: NavDirections) -> Unit)? = null

    lateinit var navController: NavController

    fun navigateToFlow(navigationFlow: NavigationFlow) = when (navigationFlow) {
        NavigationFlow.ClientFlow -> navController.navigate(AppNavGraphDirections.actionGlobalClientFlow())
        NavigationFlow.EstimateFlow -> navController.navigate(AppNavGraphDirections.actionGlobalEstimateFlow())
        NavigationFlow.ServicesFlow -> navController.navigate(AppNavGraphDirections.actionGlobalServicesFlow())
        NavigationFlow.ServicePartFlow -> navController.navigate(AppNavGraphDirections.actionGlobalServicePartFlow())
        NavigationFlow.SchedulingFlow -> navController.navigate(AppNavGraphDirections.actionGlobalSchedulingFlow())
    }

    fun navigate(navDirections: NavDirections) {
        navEventListener?.invoke(navDirections)
    }

    fun setOnNavEvent(navEventListener: (navDirections: NavDirections) -> Unit) {
        this.navEventListener = navEventListener
    }
}
