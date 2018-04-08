package com.dangbei.lerad.presenter;

import io.reactivex.disposables.Disposable;

/**
 * Created by yl on 2018/4/8.
 */
public interface RxPresenter extends Presenter {

    void attachDisposable(Disposable disposable);

    void detachDisposable();

}
