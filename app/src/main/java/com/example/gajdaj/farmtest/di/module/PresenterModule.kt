package com.example.gajdaj.farmtest.di.module

import com.example.gajdaj.farmtest.ui.activity.MainContract
import com.example.gajdaj.farmtest.ui.activity.MainPresenter
import com.example.gajdaj.farmtest.ui.fragment.catalog.CatalogContract
import com.example.gajdaj.farmtest.ui.fragment.catalog.CatalogPresenter
import com.example.gajdaj.farmtest.ui.fragment.login.LoginContract
import com.example.gajdaj.farmtest.ui.fragment.login.LoginPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class PresenterModule {

    @Binds
    abstract fun mainPresenter(mainPresenter: MainPresenter): MainContract.Presenter

    @Binds
    abstract fun lodinPresenter(loginPresenter: LoginPresenter): LoginContract.Presenter

    @Binds
    abstract fun catalogPresenter(catalogPresenter: CatalogPresenter): CatalogContract.Presenter
}
