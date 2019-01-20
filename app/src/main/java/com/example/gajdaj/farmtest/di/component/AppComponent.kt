package com.example.gajdaj.farmtest.di.component

import android.content.Context

import com.example.gajdaj.farmtest.application.FarmApplication
import com.example.gajdaj.farmtest.di.module.ActivityModule
import com.example.gajdaj.farmtest.di.module.FragmentModule
import com.example.gajdaj.farmtest.di.module.PresenterModule
import com.example.gajdaj.farmtest.di.module.RouterModule

import javax.inject.Singleton

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Singleton
@Component(modules = [
    ActivityModule::class,
    PresenterModule::class,
    AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<FarmApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<FarmApplication>() {

        @BindsInstance
        abstract fun withContext(context: Context): Builder
    }
}
