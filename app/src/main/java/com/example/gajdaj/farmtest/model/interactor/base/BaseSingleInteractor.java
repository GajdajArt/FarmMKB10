package com.example.gajdaj.farmtest.model.interactor.base;

import io.reactivex.Single;

@SuppressWarnings("SpellCheckingInspection")
public interface BaseSingleInteractor<Result, Params> {

    Single<Result> getSingle(Params params);
}