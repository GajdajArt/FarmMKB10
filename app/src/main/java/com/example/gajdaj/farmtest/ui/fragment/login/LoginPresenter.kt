package com.example.gajdaj.farmtest.ui.fragment.login

import com.example.gajdaj.farmtest.di.Schedulers
import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.model.entity.User
import com.example.gajdaj.farmtest.model.interactor.LoginInteractor
import com.example.gajdaj.farmtest.ui.base.BasePresenter
import io.reactivex.Scheduler
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by pc on 17.01.2019.
 */

class LoginPresenter
@Inject constructor(private val loginRouter: LoginRouter,
                    private val loginInteractor: LoginInteractor,
                    @Named(Schedulers.IO_SCHEDULER) private val ioScheduler: Scheduler,
                    @Named(Schedulers.UI_SCHEDULER) private val uiScheduler: Scheduler):
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
        loginAccount(account)
    }

    private fun loginAccount(account: Account) {
        subscribe(LOGIN_DISPOSABLE_KAY, loginInteractor.getSingle(account)!!
                .subscribeOn(ioScheduler)
                .observeOn(uiScheduler)
                .subscribe({ onLogin(it) },  { processError(it) }))
    }

    private fun onLogin(user: User) {
        view?.showMessage(user.uid)
        loginRouter.openCatalog()
    }
}
