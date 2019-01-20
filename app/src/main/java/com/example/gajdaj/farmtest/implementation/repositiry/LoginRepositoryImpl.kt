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

    private lateinit var resulrSorce: Single<User>

    override fun sineOut(): Completable {
        return Completable.fromCallable {
            firebaseAuth.signOut()
        }
    }

    override fun loginAccount(account: Account): Single<User> {
        return Single.fromCallable { signIn(account) }
                .flatMap { resulrSorce }
    }

    private fun signIn(account: Account) {
        firebaseAuth.signInWithEmailAndPassword(account.login, account.password)
                .addOnCompleteListener {
                    resulrSorce = if (it.isSuccessful) {
                        Single.fromCallable { User(firebaseAuth.currentUser?.uid!!) }
                    } else {
                        Single.error(Throwable())
                    }
                }
    }
}


