package com.example.gajdaj.farmtest.ui.activity

import com.example.gajdaj.farmtest.ui.base.BaseContract

interface MainContract: BaseContract {

    interface View: BaseContract.View

    interface Presenter : BaseContract.Presenter<View> {

        fun onExitClick()

        fun onCatalogClick()

        fun onAccountClick()
    }
}
