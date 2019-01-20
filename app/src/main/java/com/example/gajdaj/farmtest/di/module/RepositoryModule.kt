package com.example.gajdaj.farmtest.di.module

import com.example.gajdaj.farmtest.implementation.repositiry.LoginRepositoryImpl
import com.example.gajdaj.farmtest.model.repository.LoginRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun provideLoginRepository(loginRepositoryImpl: LoginRepositoryImpl): LoginRepository
}