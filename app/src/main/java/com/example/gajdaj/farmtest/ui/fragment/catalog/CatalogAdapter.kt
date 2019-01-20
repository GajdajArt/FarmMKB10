package com.example.gajdaj.farmtest.ui.fragment.catalog

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.gajdaj.farmtest.R
import com.example.gajdaj.farmtest.model.entity.Section

class CatalogAdapter() : RecyclerView.Adapter<CatalogListItemHolder>() {

    lateinit var list: List<Section>

    lateinit var listener: CatalogListItemHolder.OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CatalogListItemHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.view_calalog_list_item, parent, false)
        return CatalogListItemHolder(view, listener)
    }

    override fun getItemCount() =  list.size

    override fun onBindViewHolder(holder: CatalogListItemHolder, pos: Int) {
        holder.bind(list[pos])
    }
}