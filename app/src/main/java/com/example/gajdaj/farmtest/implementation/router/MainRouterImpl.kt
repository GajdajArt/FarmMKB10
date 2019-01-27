package com.example.gajdaj.farmtest.implementation.router

import com.example.gajdaj.farmtest.ui.activity.MainRouter
import com.example.gajdaj.farmtest.ui.router.BaseRouter
import com.example.gajdaj.farmtest.ui.router.Screens
import javax.inject.Inject

/**
 * Created by pc on 17.01.2019.
 */

class MainRouterImpl @Inject constructor(private val router: BaseRouter): MainRouter {

    override fun openAccount() {
        router.replaceScreen(Screens.ACCOUNT_FRAGMENT_KAY)
    }

    override fun openCatalog() {
        router.replaceScreen(Screens.CATALOG_FRAGMENT_KAY)
    }

    override fun openLogin() {
        router.replaceScreen(Screens.LOGIN_FRAGMENT_KAY)
    }
}
