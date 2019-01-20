package com.example.gajdaj.farmtest.ui.fragment.login

import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.model.interactor.LoginInteractor
import com.example.gajdaj.farmtest.ui.base.BasePresenter
import javax.inject.Inject

/**
 * Created by pc on 17.01.2019.
 */

class LoginPresenter
@Inject constructor(private val loginRouter: LoginRouter,
                    private val loginInteractor: LoginInteractor):
        BasePresenter<LoginContract.View>(),
        LoginContract.Presenter {

    private val LOGIN_DISPOSABLE_KAY = 1

    override fun onBind() {
        super.onBind()

        view?.hideActionBar()
    }

    override fun onUnBind() {
        super.onUnBind()

        view?.showActionBar()
    }

    override fun onLoginClick(account: Account) {
        loginRouter.openCatalog()
    }

    private fun loginAccount(account: Account) {
        subscribe(LOGIN_DISPOSABLE_KAY, loginInteractor.getSingle(account)!!.subscribe())
    }
}
