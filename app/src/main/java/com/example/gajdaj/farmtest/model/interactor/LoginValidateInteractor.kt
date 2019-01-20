package com.example.gajdaj.farmtest.model.interactor

import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.model.interactor.base.BaseCompletableInteractor
import io.reactivex.Completable
import javax.inject.Inject

class LoginValidateInteractor @Inject constructor(): BaseCompletableInteractor<Account>() {

    override fun buildCompletable(params: Account?): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
