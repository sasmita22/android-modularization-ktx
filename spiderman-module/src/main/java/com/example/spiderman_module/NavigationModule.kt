package com.example.spiderman_module

import com.example.spiderman_bridge_module.SpidermanNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class NavigationModule {
    @Binds
    abstract fun bindsNavigation(nav: SpidermanNavigationImpl): SpidermanNavigation
}