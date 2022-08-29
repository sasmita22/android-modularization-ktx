package com.example.spiderman_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ironman_bridge_module.IronmanNavigation
import com.example.spiderman_module.databinding.ActivitySpidermanBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SpidermanActivity : AppCompatActivity() {
    @Inject
    lateinit var ironmanNavigation: IronmanNavigation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySpidermanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btNavigation.setOnClickListener {
            ironmanNavigation.navigateToIronman(this)
            finish()
        }
    }
}