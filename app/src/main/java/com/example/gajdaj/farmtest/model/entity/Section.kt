package com.example.gajdaj.farmtest.model.entity

import org.jetbrains.annotations.Nullable

class Section(val code: String,
              val description: String,
              @Nullable
              val list: List<Section>) {
}