package com.dangbei.lerad.sample.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.dangbei.lerad.base.LeradActivity;
import com.dangbei.lerad.viewer.Viewer;

/**
 * Created by yl on 2018/3/29.
 */
public class SplashActivity extends LeradActivity implements Viewer, SplashContract.ISplashViewer {


    SplashPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        presenter = new SplashPresenter();
        presenter.bind(this);
        presenter.requestTest();

    }


    @Override
    public void onRequestTest(String s) {
        Log.d("yl", getClass().getName() + "--------------------" + s);
    }
}
