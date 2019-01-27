package com.example.gajdaj.farmtest.di.module

import android.content.Context
import com.example.gajdaj.farmtest.implementation.store.DiskAccountStoreImpl
import com.example.gajdaj.farmtest.implementation.store.MKB10csvStoreImpl
import com.example.gajdaj.farmtest.implementation.store.PreferenceManagerImpl
import com.example.gajdaj.farmtest.model.store.AccountStore
import com.example.gajdaj.farmtest.model.store.MKB10Store
import com.example.gajdaj.farmtest.model.store.PreferenceManager
import com.google.firebase.auth.FirebaseAuth
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton


@Module
abstract class ApplicationModule {

    @Module
    companion object {

        @Singleton
        @Provides
        @JvmStatic
        internal fun provideUploadFilePreferenceManager(context: Context): PreferenceManager {
            return PreferenceManagerImpl(context, PreferenceManager.APP_PREFERENCES_NAME)
        }

        @Singleton
        @Provides
        @JvmStatic
        internal fun providFiregaseAuth(): FirebaseAuth {
            return FirebaseAuth.getInstance()
        }
    }

    @Binds
    internal abstract fun provideAccountStore(accountStore: DiskAccountStoreImpl): AccountStore

    @Binds
    internal abstract fun provideMKB10Store(mcbMKB10csvStoreImpl: MKB10csvStoreImpl): MKB10Store
}
