package com.dangbei.lerad.base;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.dangbei.lerad.presenter.LeradRxPresenterDelegate;
import com.dangbei.lerad.viewer.Viewer;

/**
 * Created by yl on 2018/4/8.
 */
public abstract class LeradFragment extends Fragment implements Viewer {

    private LeradRxPresenterDelegate delegate;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        delegate = new LeradRxPresenterDelegate();
    }

    @Override
    public void onDetach() {
        super.onDetach();
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
