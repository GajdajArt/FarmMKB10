package com.example.gajdaj.farmtest.ui.base

import com.example.gajdaj.farmtest.ui.activity.MainContract

open class BasePresenter<V: BaseContract.View>: BaseContract.Presenter<V> {

    lateinit var view: V

    override fun bind(view: V) {
        this.view = view
        onBind()
    }

    override fun unbind() {
        onUnBind()
    }

    open fun onBind() {}

    open fun onUnBind() {}
}
