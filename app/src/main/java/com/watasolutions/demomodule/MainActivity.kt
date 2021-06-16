package com.watasolutions.demomodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.watasolutions.demomodule.data.AppPrefs
import com.watasolutions.demomodule.navigation.NavManager
import com.watasolutions.demomodule.navigation.NavigationFlow
import com.watasolutions.demomodule.navigation.ToFlowNavigatable

class MainActivity : AppCompatActivity(), ToFlowNavigatable {

    private val navController get() = Navigation.findNavController(this, R.id.navHostFragment)

    private val navManager: NavManager = NavManager()

    val appPrefs : AppPrefs by lazy {
        AppPrefs(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navManager.navController = navController
    }

    override fun navigateToFlow(flow: NavigationFlow) {
        navManager.navigateToFlow(flow)
    }
}