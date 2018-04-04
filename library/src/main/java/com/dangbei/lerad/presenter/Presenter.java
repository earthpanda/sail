package com.dangbei.lerad.presenter;

import com.dangbei.lerad.viewer.Viewer;

/**
 * presenter 类型的接口
 * Created by yl on 2018/4/3.
 */
public interface Presenter {

    void bind(Viewer viewer);

    void onViewCreated();

    void onViewDestroyed();

}
