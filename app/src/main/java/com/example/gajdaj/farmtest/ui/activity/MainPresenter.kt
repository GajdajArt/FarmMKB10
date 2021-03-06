package com.example.gajdaj.farmtest.ui.activity

import com.example.gajdaj.farmtest.ui.base.BasePresenter
import javax.inject.Inject

/**
 * Created by pc on 17.01.2019.
 */

class MainPresenter
@Inject constructor(private val mainRouter: MainRouter):
        BasePresenter<MainContract.View>(),
        MainContract.Presenter {

    override fun onBind() {
        super.onBind()

        mainRouter.openLogin()
    }
}
