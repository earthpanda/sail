package com.dangbei.lerad.presenter;

import com.dangbei.lerad.viewer.Viewer;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个viewer可能会有多个presenter
 * Created by yl on 2018/4/4.
 */
public class LeradPresenterDelegate implements Presenter {

    protected List<LeradPresenter> presenterList;


    public void add(LeradPresenter presenter) {
        if (null == presenterList) {
            presenterList = new ArrayList<>();
            presenterList.add(presenter);
        } else {
            if (!presenterList.contains(presenter)) {
                presenterList.add(presenter);
            }
        }
    }


    @Override
    public final void bind(Viewer viewer) {
        //ignore
        //do nothing here
    }

    @Override
    public void onViewCreated() {
        for (LeradPresenter p : presenterList) {
            p.onViewCreated();
        }
    }

    @Override
    public void onViewDestroyed() {
        for (LeradPresenter p : presenterList) {
            p.onViewDestroyed();
        }
    }
}
