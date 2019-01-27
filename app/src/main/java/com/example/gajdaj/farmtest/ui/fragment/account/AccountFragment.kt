package com.example.gajdaj.farmtest.ui.fragment.account

import android.annotation.SuppressLint
import com.example.gajdaj.farmtest.R
import com.example.gajdaj.farmtest.model.entity.Account
import com.example.gajdaj.farmtest.model.entity.User
import com.example.gajdaj.farmtest.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_account.*
import javax.inject.Inject

class AccountFragment: BaseFragment(), AccountContract.View {

    @Inject
    lateinit var presenter: AccountContract.Presenter

    @SuppressLint("SetTextI18n")
    override fun showData(user: User) {
        nameTV.text = "${user.firstName} ${user.secondName}"
        pointsTV.text = user.point
    }

    override val layoutRes: Int
        get() = R.layout.fragment_account

    override fun onStart() {
        super.onStart()
        presenter.bind(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.unbind()
    }
}