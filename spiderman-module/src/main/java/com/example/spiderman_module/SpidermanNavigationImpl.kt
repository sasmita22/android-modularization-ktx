package com.example.spiderman_module

import android.content.Context
import android.content.Intent
import com.example.spiderman_bridge_module.SpidermanNavigation
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SpidermanNavigationImpl @Inject constructor(): SpidermanNavigation {
    override fun navigateToSpiderman(context: Context) {
        Intent(context, SpidermanActivity::class.java).run {
            context.startActivity(this)
        }
    }
}