package com.example.gajdaj.farmtest.model.repository

import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.model.entity.User
import io.reactivex.Completable
import io.reactivex.Single

interface LoginRepository {

    fun loginAccount(account: Account): Single<User>

    fun sineOut(): Completable
}