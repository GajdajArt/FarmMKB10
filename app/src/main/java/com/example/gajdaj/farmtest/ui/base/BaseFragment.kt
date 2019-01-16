package com.example.gajdaj.farmtest.ui.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import dagger.android.support.DaggerFragment

abstract class BaseFragment : DaggerFragment(), BaseContract.View {

    @get:LayoutRes
    protected abstract val layoutRes: Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layoutRes, container, false)
        return view
    }

    override fun showProgressDialog() {
    }

    override fun hideProgressDialog() {
    }

    override fun showUnknownError() {
    }

    override fun showMessage(message: String) {
    }

    protected fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}
