package com.example.gajdaj.farmtest.model.store

import com.example.gajdaj.farmtest.model.entity.Account
import javax.inject.Inject

interface AccountStore {

    fun storeAccount(account: Account)

    fun getAccount(): Account?

    fun clearAccount()
}