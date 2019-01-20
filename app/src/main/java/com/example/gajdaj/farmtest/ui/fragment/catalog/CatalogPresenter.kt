package com.example.gajdaj.farmtest.ui.fragment.catalog

import com.example.gajdaj.farmtest.model.entity.Section
import com.example.gajdaj.farmtest.ui.base.BasePresenter
import javax.inject.Inject

class CatalogPresenter
@Inject constructor():
        BasePresenter<CatalogContract.View>(),
        CatalogContract.Presenter {

    override fun onBind() {
        super.onBind()

        val list = ArrayList<Section>()
        list.add(Section("l;k", "lkl;", ArrayList()))
        view.showList(list)
    }

    override fun onItemClick(section: Section) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}