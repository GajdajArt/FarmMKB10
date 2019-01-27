package com.example.gajdaj.farmtest.model.interactor

import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.model.entity.User
import com.example.gajdaj.farmtest.model.interactor.base.Base2ArgsCompletableInteractor
import com.example.gajdaj.farmtest.model.interactor.base.Base2ArgsSingleInteractor
import com.example.gajdaj.farmtest.model.interactor.base.BaseCompletableInteractor
import com.example.gajdaj.farmtest.model.interactor.base.BaseSingleInteractor
import com.example.gajdaj.farmtest.model.repository.LoginRepository
import io.reactivex.Single
import javax.inject.Inject

class LoginInteractor
@Inject constructor(private val loginRepository: LoginRepository): Base2ArgsCompletableInteractor<Account, LoginRepository.LoginCallBack> {

    override fun getCompletable(params: Account?, callBack: LoginRepository.LoginCallBack) = params?.let {
        loginRepository.loginAccount(it, callBack)
    }
}
