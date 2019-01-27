package com.example.gajdaj.farmtest.model.interactor.base;

import io.reactivex.Completable;
import io.reactivex.Single;

public interface Base2ArgsCompletableInteractor<Param1, Param2> {

    Completable getCompletable(Param1 params, Param2 param2);
}
