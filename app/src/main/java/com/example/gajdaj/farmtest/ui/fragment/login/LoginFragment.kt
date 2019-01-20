package com.example.gajdaj.farmtest.ui.fragment.login

import android.os.Bundle
import android.view.View
import com.example.gajdaj.farmtest.R
import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.ui.activity.MainActivity
import com.example.gajdaj.farmtest.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*
import javax.inject.Inject


class LoginFragment : BaseFragment(), LoginContract.View {

    @Inject
    lateinit var presenter: LoginContract.Presenter

    lateinit var activity: MainActivity

    override val layoutRes: Int
        get() = R.layout.fragment_login

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity = getActivity() as MainActivity
        initButton()
    }

    private fun initButton() {
        loginButton.setOnClickListener {
            presenter.onLoginClick(buildAccount())
        }
    }

    private fun buildAccount(): Account {
        return Account(loginET.text.toString(), passwordET.text.toString())
    }

    override fun onStart() {
        super.onStart()
        presenter.bind(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.unbind()
    }

    override fun hideActionBar() {
        activity.getMainSupportActionBar()?.hide()
    }

    override fun showActionBar() {
        activity.getMainSupportActionBar()?.show()
    }
}
