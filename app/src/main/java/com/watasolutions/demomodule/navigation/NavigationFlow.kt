package com.watasolutions.demomodule.navigation

sealed class NavigationFlow {
    object ClientFlow : NavigationFlow()
    object EstimateFlow : NavigationFlow()
    object ServicesFlow : NavigationFlow()
    object ServicePartFlow : NavigationFlow()
    object SchedulingFlow : NavigationFlow()
}
