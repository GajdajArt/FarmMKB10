package com.example.gajdaj.farmtest.di.module

import com.example.gajdaj.farmtest.implementation.router.AccountRouterImpl
import com.example.gajdaj.farmtest.implementation.router.CatalogRouterImpl
import com.example.gajdaj.farmtest.implementation.router.LoginRouterImpl
import com.example.gajdaj.farmtest.implementation.router.MainRouterImpl
import com.example.gajdaj.farmtest.ui.activity.MainActivity
import com.example.gajdaj.farmtest.ui.activity.MainRouter
import com.example.gajdaj.farmtest.ui.fragment.account.AccountRouter
import com.example.gajdaj.farmtest.ui.fragment.catalog.CatalogRouter
import com.example.gajdaj.farmtest.ui.fragment.login.LoginRouter
import com.example.gajdaj.farmtest.ui.router.BaseRouter
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class RouterModule {

    @Module
    companion object {
        @Provides
        @JvmStatic
        fun provideBaseRouter(baseActivity: MainActivity): BaseRouter {
            return BaseRouter(baseActivity)
        }
    }

    @Binds
    abstract fun provideMainRouter(MainRouterImpl: MainRouterImpl): MainRouter

    @Binds
    abstract fun provideLoginRouter(loginRouterImpl: LoginRouterImpl): LoginRouter

    @Binds
    abstract fun provideCatalogRouter(catalogRouterImpl: CatalogRouterImpl): CatalogRouter

    @Binds
    abstract fun provideAccountRouter(accountRouter: AccountRouterImpl): AccountRouter
}
