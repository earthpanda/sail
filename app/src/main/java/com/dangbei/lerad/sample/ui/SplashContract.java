package com.dangbei.lerad.sample.ui;

import com.dangbei.lerad.presenter.Presenter;
import com.dangbei.lerad.viewer.Viewer;

/**
 * Created by yl on 2018/4/4.
 */
public class SplashContract {

    interface ISplashViewer extends Viewer {
        void onRequestTest(String s);
    }

    interface ISplashPresenter extends Presenter {
        void requestTest();
    }


}
