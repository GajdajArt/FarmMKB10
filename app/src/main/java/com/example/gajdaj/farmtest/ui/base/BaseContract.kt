package com.example.gajdaj.farmtest.ui.base

interface BaseContract {
    interface View {

        fun showProgressDialog()

        fun hideProgressDialog()

        fun showUnknownError()

        fun showMessage(message: String)
    }

    interface Presenter<V : View> {

        fun bind(view: V)

        fun unbind()
    }
}
