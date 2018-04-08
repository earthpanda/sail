package com.dangbei.lerad.viewer;

import com.dangbei.lerad.presenter.LeradRxPresenterDelegate;

/**
 * 因为presenter总是在delegate后进行bind，因而对于presenter来说，它拿不到onCreate的回调，因而我们只需要关心onDestroyed的
 * 情况就可以了
 * Created by yl on 2018/4/3.
 */
public interface Viewer {

    void onViewerDestroyed();

    LeradRxPresenterDelegate getLeradDelegate();

}
