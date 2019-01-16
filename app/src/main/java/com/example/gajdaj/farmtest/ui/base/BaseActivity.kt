package com.example.gajdaj.farmtest.ui.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity : DaggerAppCompatActivity(), BaseContract.View {

    @get:LayoutRes
    protected abstract val layoutRes: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val resId = layoutRes
        if (resId != 0) {
            setContentView(layoutRes)
        }
    }

    override fun showProgressDialog() {

    }

    override fun hideProgressDialog() {

    }

    override fun showUnknownError() {

    }

    override fun showMessage(message: String) {

    }
}
