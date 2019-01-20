package com.example.gajdaj.farmtest.ui.fragment.login

import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.ui.base.BasePresenter
import javax.inject.Inject

/**
 * Created by pc on 17.01.2019.
 */

class LoginPresenter
@Inject constructor(val loginRouter: LoginRouter):
        BasePresenter<LoginContract.View>(),
        LoginContract.Presenter {

    override fun onBind() {
        super.onBind()

        view.hideActionBar()
    }

    override fun onUnBind() {
        super.onUnBind()

        view.showActionBar()
    }

    override fun onLoginClick(account: Account) {
        loginRouter.openCatalog()
    }
}
