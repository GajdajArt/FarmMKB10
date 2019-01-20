package com.example.gajdaj.farmtest.ui.fragment.catalog

import com.example.gajdaj.farmtest.model.entity.Section
import com.example.gajdaj.farmtest.ui.base.BaseContract

interface CatalogContract {

    interface View: BaseContract.View {

        fun showList(list: List<Section>)
    }

    interface Presenter: BaseContract.Presenter<View> {

        fun onItemClick(section: Section)
    }
}