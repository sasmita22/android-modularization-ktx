package com.example.ironman_module

import android.content.Context
import android.content.Intent
import com.example.ironman_bridge_module.IronmanNavigation
import javax.inject.Inject

class IronmanNavigationImpl @Inject constructor(): IronmanNavigation {
    override fun navigateToIronman(context: Context) {
        Intent(context, IronmanActivity::class.java).run {
            context.startActivity(this)
        }
    }
}