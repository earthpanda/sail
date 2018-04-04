package com.dangbei.lerad.sample.ui;

import com.dangbei.lerad.presenter.LeradPresenter;

/**
 * Created by yl on 2018/4/4.
 */
public class SplashPresenter extends LeradPresenter<SplashActivity> implements SplashContract.ISplashPresenter {

    @Override
    public void requestTest() {
        viewer.get().onRequestTest("this is a test");
    }
}
