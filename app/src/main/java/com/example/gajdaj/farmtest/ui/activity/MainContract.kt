package com.example.gajdaj.farmtest.ui.activity

import com.example.gajdaj.farmtest.ui.base.BaseContract

interface MainContract: BaseContract {

    interface View: BaseContract.View

    interface Presenter<T> : BaseContract.Presenter<View>
}
