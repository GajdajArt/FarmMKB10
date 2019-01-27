package com.example.gajdaj.farmtest.implementation.router

import com.example.gajdaj.farmtest.ui.fragment.catalog.CatalogRouter
import com.example.gajdaj.farmtest.ui.router.BaseRouter
import com.example.gajdaj.farmtest.ui.router.Screens
import javax.inject.Inject

class CatalogRouterImpl
@Inject constructor(private val baseRouter: BaseRouter): CatalogRouter {

    override fun openAccount() {
        baseRouter.addNewScreen(Screens.ACCOUNT_FRAGMENT_KAY)
    }
}