package com.example.gajdaj.farmtest.ui.base

import android.annotation.SuppressLint
import android.util.Log
import com.example.gajdaj.farmtest.ui.activity.MainContract
import io.reactivex.disposables.Disposable
import java.net.ConnectException
import java.util.HashMap

open class BasePresenter<V: BaseContract.View>: BaseContract.Presenter<V> {

    protected var view: V? = null

    private val disposables = HashMap<Int, Disposable>()

    override fun bind(view: V) {
        this.view = view
        onBind()
    }

    override fun unbind() {
        view = null
        disposeAll()
        onUnBind()
    }

    open fun onBind() {}

    open fun onUnBind() {}

    protected fun processError(throwable: Throwable) {

        if (throwable is ConnectException) {
            //connection error
        } else {
            view?.showUnknownError()
        }
    }

    protected fun subscribe(key: Int, disposable: Disposable) {
        val currentDisposable = disposables[key]
        if (currentDisposable != null && !currentDisposable.isDisposed) {
            currentDisposable.dispose()
        }
        disposables[key] = disposable
    }

    protected fun unsubscribe(key: Int) {
        val currentDisposable = disposables[key]
        if (currentDisposable != null && !currentDisposable.isDisposed) {
            currentDisposable.dispose()
        }
    }

    protected fun disposeAll() {
        for (key in disposables.keys) {
            val currentDisposable = disposables[key]
            if (currentDisposable != null && !currentDisposable.isDisposed) {
                currentDisposable.dispose()
            }
        }
    }
}
