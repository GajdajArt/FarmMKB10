package com.example.gajdaj.farmtest.di.module

import com.example.gajdaj.farmtest.di.scope.FragmentScope
import com.example.gajdaj.farmtest.ui.fragment.catalog.CatalogFragment
import com.example.gajdaj.farmtest.ui.fragment.login.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    @FragmentScope
    abstract fun loginFragment(): LoginFragment

    @ContributesAndroidInjector
    @FragmentScope
    abstract fun catalogFragment(): CatalogFragment
}
