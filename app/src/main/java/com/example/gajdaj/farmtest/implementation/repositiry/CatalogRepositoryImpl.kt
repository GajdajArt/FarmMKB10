package com.example.gajdaj.farmtest.implementation.repositiry

import com.example.gajdaj.farmtest.model.entity.Section
import com.example.gajdaj.farmtest.ui.fragment.catalog.CatalogRepository
import io.reactivex.Single
import javax.inject.Inject

class CatalogRepositoryImpl
@Inject constructor(): CatalogRepository {



    override fun getSections(): Single<Section> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}