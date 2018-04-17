package com.dangbei.lerad.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.dangbei.lerad.presenter.LeradRxPresenterDelegate;
import com.dangbei.lerad.viewer.Viewer;

/**
 * leradActivity 以后的
 * Created by yl on 2018/4/3.
 */
public abstract class LeradActivity extends AppCompatActivity implements Viewer {


    private LeradRxPresenterDelegate delegate;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        delegate = new LeradRxPresenterDelegate();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        delegate.onViewDestroyed();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public LeradRxPresenterDelegate getLeradDelegate() {
        return delegate;
    }

    @Override
    public final void onViewerDestroyed() {
        //ignore
        //there is nothing to do here
    }
}
