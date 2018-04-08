package com.dangbei.support.rxjava;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by yl on 2018/4/8.
 */
public abstract class RxCompatObserver<T> extends RxCompatBaseObserver implements Observer<T> {

    @Override
    public final void onSubscribe(Disposable d) {
        try {
            onRxCompatDisposable(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public final void onNext(T t) {
        try {
            onRxCompatNext(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public final void onError(Throwable t) {
        try {
            onRxCompatError(new RxCompatException(t));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onComplete() {

    }

    abstract void onRxCompatDisposable(Disposable d);

    abstract void onRxCompatNext(T t);

    abstract void onRxCompatError(RxCompatException e);

}
