package com.example.gajdaj.farmtest.implementation.router

import com.example.gajdaj.farmtest.ui.activity.MainRouter
import com.example.gajdaj.farmtest.ui.router.BaseRouter
import com.example.gajdaj.farmtest.ui.router.Screens
import javax.inject.Inject

/**
 * Created by pc on 17.01.2019.
 */

class MainRouterImpl @Inject constructor(private val router: BaseRouter): MainRouter {

    override fun openLogin() {
        router.openScreen(Screens.LOGIN_FRAGMENT_KAY)
    }
}
