package com.example.gajdaj.farmtest.ui.fragment.catalog

import com.example.gajdaj.farmtest.model.entity.Section
import io.reactivex.Single

interface CatalogRepository {

    fun getSections(): Single<Section>
}
