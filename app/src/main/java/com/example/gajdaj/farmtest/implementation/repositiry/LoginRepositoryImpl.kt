package com.example.gajdaj.farmtest.implementation.repositiry

import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.model.entity.User
import com.example.gajdaj.farmtest.model.repository.LoginRepository
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import io.reactivex.Completable
import io.reactivex.Single
import io.reactivex.SingleSource
import java.io.StringBufferInputStream
import javax.inject.Inject

class LoginRepositoryImpl
@Inject
constructor(private val firebaseAuth: FirebaseAuth) : LoginRepository {

    private lateinit var callBack: LoginRepository.LoginCallBack

    override fun sineOut(): Completable {
        return Completable.fromCallable {
            firebaseAuth.signOut()
        }
    }

    override fun loginAccount(account: Account, callBack: LoginRepository.LoginCallBack): Completable {
        this.callBack = callBack
        return Completable.fromCallable { signIn(account) }
    }

    private fun signIn(account: Account) {
        firebaseAuth.signInWithEmailAndPassword(account.login, account.password)
                .addOnCompleteListener {

                    if (it.isSuccessful) {
                        callBack.onLogin(User(firebaseAuth.currentUser?.uid!!))
                    } else {
                        throw Throwable("Login Error")
                    }
                }
    }
}


