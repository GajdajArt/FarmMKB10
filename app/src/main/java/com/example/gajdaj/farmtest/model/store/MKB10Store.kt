package com.example.gajdaj.farmtest.model.store

import com.example.gajdaj.farmtest.model.entity.Section

interface MKB10Store {

    fun getMKBList(): List<Section>
}