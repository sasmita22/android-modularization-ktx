package com.example.ironman_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ironman_module.databinding.ActivityIronmanBinding
import com.example.spiderman_bridge_module.SpidermanNavigation
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class IronmanActivity : AppCompatActivity() {
    @Inject
    lateinit var spidermanNavigation: SpidermanNavigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityIronmanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btNavigation.setOnClickListener {
            spidermanNavigation.navigateToSpiderman(this)
            finish()
        }
    }
}