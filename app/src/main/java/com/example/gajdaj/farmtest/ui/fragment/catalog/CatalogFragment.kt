package com.example.gajdaj.farmtest.ui.fragment.catalog

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SimpleItemAnimator
import android.view.View
import com.example.gajdaj.farmtest.R
import com.example.gajdaj.farmtest.model.entity.Section
import com.example.gajdaj.farmtest.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_catalog.*
import javax.inject.Inject

class CatalogFragment: BaseFragment(), CatalogContract.View {
    @Inject
    lateinit var presenter: CatalogContract.Presenter

    private val adapter = CatalogAdapter()

    override val layoutRes: Int
        get() = R.layout.fragment_catalog

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        intRecyclerView()
    }

    override fun onStart() {
        super.onStart()
        presenter.bind(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.unbind()
    }

    override fun showList(list: List<Section>) {
        adapter.list = list
        adapter.listener = object : CatalogListItemHolder.OnItemClickListener {
            override fun onClick(section: Section) {
                presenter.onItemClick(section)
            }
        }
    }

    private fun intRecyclerView() {
        val layoutManager = LinearLayoutManager(activity)

        catalogListRV.layoutManager = layoutManager
        catalogListRV.adapter = adapter
    }
}