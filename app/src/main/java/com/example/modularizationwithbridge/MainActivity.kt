package com.example.modularizationwithbridge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spiderman_bridge_module.SpidermanNavigation
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var spidermanNavigation: SpidermanNavigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spidermanNavigation.navigateToSpiderman(this)
        finish()
    }
}