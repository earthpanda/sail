package com.dangbei.lerad.base;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.dangbei.lerad.presenter.LeradRxPresenterDelegate;
import com.dangbei.lerad.viewer.Viewer;

/**
 * Created by yl on 2018/4/8.
 */
public abstract class LeradDialog extends Dialog implements Viewer {

    private LeradRxPresenterDelegate delegate;

    public LeradDialog(@NonNull Context context) {
        super(context);
    }

    public LeradDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected LeradDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        delegate = new LeradRxPresenterDelegate();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        delegate.onViewDestroyed();
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
