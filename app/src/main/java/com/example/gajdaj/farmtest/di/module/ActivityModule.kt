package com.example.gajdaj.farmtest.di.module

import com.example.gajdaj.farmtest.ui.activity.MainActivity
import com.example.gajdaj.farmtest.di.scope.ActivityScope

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = arrayOf(FragmentModule::class))
    @ActivityScope
    abstract fun mainActivity(): MainActivity
}
