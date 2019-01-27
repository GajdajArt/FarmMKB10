package com.example.gajdaj.farmtest.model.repository

import com.example.gajdaj.farmtest.model.entity.User
import io.reactivex.Single

interface UserRepository {

    fun getUser(): Single<User>
}