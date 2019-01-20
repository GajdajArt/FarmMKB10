package com.example.gajdaj.farmtest.model.interactor

import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.model.entity.User
import com.example.gajdaj.farmtest.model.interactor.base.BaseSingleInteractor
import com.example.gajdaj.farmtest.model.repository.LoginRepository
import io.reactivex.Single
import javax.inject.Inject

class LoginInteractor
@Inject constructor(private val loginRepository: LoginRepository): BaseSingleInteractor<User, Account> {

    override fun getSingle(params: Account?) = params?.let {
        loginRepository.loginAccount(it)
    }
}
