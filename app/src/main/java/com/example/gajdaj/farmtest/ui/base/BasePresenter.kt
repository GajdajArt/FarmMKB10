package com.example.gajdaj.farmtest.ui.base

class BasePresenter<V: BaseContract.View>: BaseContract.Presenter<V> {

    lateinit var view: V

    override fun bind(view: V) {
        this.view = view
    }

    override fun unbind() {
    }
}
