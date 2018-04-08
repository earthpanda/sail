package com.dangbei.lerad.presenter;

import com.dangbei.lerad.viewer.Viewer;

import java.lang.ref.WeakReference;

/**
 * 这里用RxJava进行资源的销毁处理
 * 基类的presenter 类
 * Created by yl on 2018/4/4.
 */
public abstract class LeradPresenter<T extends Viewer> implements Presenter {

    protected WeakReference<T> viewer;

    @Override
    public void bind(Viewer viewer) {
        LeradPresenterDelegate delegate = viewer.getLeradDelegate();
        if (null == delegate) {
            throw new RuntimeException("the leradPresenterDelegate is null");
        } else {
            this.viewer = (WeakReference<T>) new WeakReference<>(viewer);
        }
    }

    @Override
    public void onViewCreated() {
        //ignore
    }

    @Override
    public void onViewDestroyed() {
        //ignore
    }

}
