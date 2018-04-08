package com.dangbei.lerad.presenter;

import android.support.annotation.NonNull;

import com.dangbei.lerad.viewer.Viewer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import io.reactivex.disposables.Disposable;

/**
 * 一般使用rxPresenter
 * 一个presenter会有多个disposable
 * Created by yl on 2018/4/8.
 */
public class LeradRxPresenter<T extends Viewer> extends LeradPresenter<T> implements RxPresenter {

    private Set<Disposable> disposableSet;


    @Override
    public void onViewDestroyed() {
        super.onViewDestroyed();
        LeradRxPresenterDelegate delegate = viewer.get().getLeradDelegate();
        if (null != delegate) {
            delegate.detachDisposable();
        }
    }

    @Override
    public final void attachDisposable(@NonNull Disposable disposable) {
        synchronized (disposableSet) {
            if (null == disposableSet) {
                disposableSet = new HashSet<>();
                disposableSet.add(disposable);
            } else {
                disposableSet.add(disposable);
            }
        }
    }

    @Override
    public final void detachDisposable() {
        synchronized (disposableSet) {
            if (null != disposableSet) {
                Iterator<Disposable> it = disposableSet.iterator();
                while (it.hasNext()) {
                    Disposable d = it.next();
                    d.dispose();
                    it.remove();
                }
            }
            disposableSet = null;
        }
    }

}
