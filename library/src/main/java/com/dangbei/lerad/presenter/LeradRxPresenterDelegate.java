package com.dangbei.lerad.presenter;

import io.reactivex.disposables.Disposable;

/**
 *
 * Created by yl on 2018/4/8.
 */
public class LeradRxPresenterDelegate extends LeradPresenterDelegate implements RxPresenter {

    @Override
    public final void attachDisposable(Disposable disposable) {
        //ignore
    }

    @Override
    public void detachDisposable() {
        if (null != presenterList) {
            for (LeradPresenter p : presenterList) {
                if (p instanceof LeradRxPresenter) {
                    ((LeradRxPresenter) p).detachDisposable();
                }
            }
        }
    }
}
