package com.example.gajdaj.farmtest.ui.fragment.login

import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.ui.base.BaseContract

interface LoginContract: BaseContract {

    interface View: BaseContract.View {

        fun hideActionBar()

        fun showActionBar()
    }

    interface Presenter: BaseContract.Presenter<View> {

        fun onLoginClick(account: Account)
    }
}
