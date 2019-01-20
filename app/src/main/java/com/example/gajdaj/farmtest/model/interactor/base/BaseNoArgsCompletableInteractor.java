package com.example.gajdaj.farmtest.model.interactor.base;

import io.reactivex.Completable;

@SuppressWarnings("SpellCheckingInspection")
public abstract class BaseNoArgsCompletableInteractor {

    protected BaseNoArgsCompletableInteractor() {
    }

    protected abstract Completable buildCompletable();

    public Completable getCompletable() {
        return buildCompletable();
    }
}
