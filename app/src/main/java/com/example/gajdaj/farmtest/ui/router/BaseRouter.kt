package com.example.gajdaj.farmtest.ui.router

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.example.gajdaj.farmtest.R
import com.example.gajdaj.farmtest.ui.activity.MainActivity
import com.example.gajdaj.farmtest.ui.fragment.account.AccountFragment
import com.example.gajdaj.farmtest.ui.fragment.catalog.CatalogFragment
import com.example.gajdaj.farmtest.ui.fragment.login.LoginFragment
import javax.inject.Inject


class BaseRouter(activity: MainActivity) {

    private val fragmentManager: FragmentManager = activity.supportFragmentManager

    private val screenMap = HashMap<String, Fragment>()

    init {
        screenMap[Screens.LOGIN_FRAGMENT_KAY] = LoginFragment()
        screenMap[Screens.CATALOG_FRAGMENT_KAY] = CatalogFragment()
        screenMap[Screens.ACCOUNT_FRAGMENT_KAY] = AccountFragment()
    }

    fun addNewScreen(screenKay: String) {
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, screenMap[screenKay]!!)
                .addToBackStack(null)
                .commit()
    }

    fun openScreen(screenKay: String) {
        fragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, screenMap[screenKay]!!)
                .commit()
    }

    fun replaceScreen(screenKay: String) {
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, screenMap[screenKay]!!)
                .commit()
    }
}
