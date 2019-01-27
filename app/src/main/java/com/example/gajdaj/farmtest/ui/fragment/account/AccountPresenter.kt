package com.example.gajdaj.farmtest.ui.fragment.account

import com.example.gajdaj.farmtest.model.entity.User
import com.example.gajdaj.farmtest.ui.base.BasePresenter
import javax.inject.Inject

class AccountPresenter
@Inject constructor(private val accountRouter: AccountRouter): BasePresenter<AccountContract.View>(), AccountContract.Presenter {

    override fun onBind() {
        super.onBind()
    }
}