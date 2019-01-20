package com.example.gajdaj.farmtest.model.interactor.base;

import io.reactivex.Single;

@SuppressWarnings("SpellCheckingInspection")
public interface BaseNoArgsSingleInteractor<Result> {

    Single<Result> getSingle();
}