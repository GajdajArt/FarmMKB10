package com.example.gajdaj.farmtest.ui.fragment.login

import com.example.gajdaj.farmtest.di.Schedulers
import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.model.entity.User
import com.example.gajdaj.farmtest.model.interactor.LoginInteractor
import com.example.gajdaj.farmtest.model.repository.LoginRepository
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
        view?.showProgressDialog()
        loginAccount(account)
    }

    private fun loginAccount(account: Account) {
        //run callback if login successful
        subscribe(LOGIN_DISPOSABLE_KAY, loginInteractor.getCompletable(account,
                callBack = object : LoginRepository.LoginCallBack {
            override fun onLogin(user: User) {
                onLoginSuccessful(user)
            }
        })!!.subscribe({},  { processError(it) }))
    }

    private fun onLoginSuccessful(user: User) {
        view?.hideProgressDialog()
        view?.showMessage(user.uid)
        loginRouter.openCatalog()
    }
}
