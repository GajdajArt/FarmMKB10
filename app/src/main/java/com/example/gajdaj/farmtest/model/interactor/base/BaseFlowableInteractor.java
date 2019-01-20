package com.example.gajdaj.farmtest.model.interactor.base;

import io.reactivex.Flowable;

public abstract class BaseFlowableInteractor<T> {

    protected abstract Flowable<T> buildFlowable();

    public Flowable<T> getFlowable(){
        return buildFlowable();
    }
}
