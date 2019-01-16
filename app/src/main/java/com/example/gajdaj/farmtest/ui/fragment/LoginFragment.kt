package com.example.gajdaj.farmtest.ui.fragment

import com.example.gajdaj.farmtest.R
import com.example.gajdaj.farmtest.ui.base.BaseContract
import com.example.gajdaj.farmtest.ui.base.BaseFragment
import com.example.gajdaj.farmtest.ui.fragment.login.LoginContract
import javax.inject.Inject


class LoginFragment : BaseFragment(), LoginContract.View {

    @Inject
    lateinit var presenter: LoginContract.Presenter

    override val layoutRes: Int
        get() = R.layout.fragment_login

    override fun onStart() {
        super.onStart()
        presenter.bind(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.unbind()
    }
}
