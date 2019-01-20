package com.example.gajdaj.farmtest.implementation

import com.example.gajdaj.farmtest.ui.fragment.login.LoginFragment
import com.example.gajdaj.farmtest.ui.fragment.login.LoginRouter
import com.example.gajdaj.farmtest.ui.router.BaseRouter
import com.example.gajdaj.farmtest.ui.router.Screens
import javax.inject.Inject

class LoginRouterImpl @Inject constructor(private val baseRouter: BaseRouter): LoginRouter {

    override fun openCatalog() {
        baseRouter.replaceScreen(Screens.CATALOG_FRAGMENT_KAY)
    }
}
