package com.example.gajdaj.farmtest.model.interactor.base;

import io.reactivex.Maybe;

@SuppressWarnings("SpellCheckingInspection")
public abstract class BaseNoArgsMaybeInteractor<Result> {

    protected BaseNoArgsMaybeInteractor() {
    }

    protected abstract Maybe<Result> buildMaybe();

    public Maybe<Result> getMaybe() {
        return buildMaybe();
    }
}
