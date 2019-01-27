package com.example.gajdaj.farmtest.ui.fragment.account

import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.model.entity.User
import com.example.gajdaj.farmtest.ui.base.BaseContract
import com.example.gajdaj.farmtest.ui.base.BasePresenter

interface AccountContract {

    interface View: BaseContract.View {

        fun showData(user: User)
    }

    interface Presenter: BaseContract.Presenter<View>
}