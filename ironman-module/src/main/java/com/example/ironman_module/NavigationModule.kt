package com.example.ironman_module

import com.example.ironman_bridge_module.IronmanNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class NavigationModule {
    @Binds
    abstract fun bindsNavigation(nav: IronmanNavigationImpl): IronmanNavigation
}