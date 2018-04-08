package com.dangbei.support.rxjava;

import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by yl on 2018/4/8.
 */
public final class RxCompat {

    private RxCompat() {

    }

    public static <T> ObservableTransformer<T, T> subscripOnNet() {
        return upstream -> upstream.subscribeOn(Schedulers.io());
    }

    public static <T> ObservableTransformer<T, T> subscripOnDB() {
        return upstream -> upstream.subscribeOn(Schedulers.computation());
    }

    public static <T> ObservableTransformer<T, T> subscripOnMain() {
        return upstream -> upstream.subscribeOn(AndroidSchedulers.mainThread());
    }

    public static <T> ObservableTransformer<T, T> observeOnNet() {
        return upstream -> upstream.observeOn(Schedulers.io());
    }

    public static <T> ObservableTransformer<T, T> observeOnDB() {
        return upstream -> upstream.observeOn(Schedulers.computation());
    }

    public static <T> ObservableTransformer<T, T> observeOnMain() {
        return upstream -> upstream.observeOn(AndroidSchedulers.mainThread());
    }


}
