package com.dangbei.lerad.sample.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.dangbei.lerad.base.LeradActivity;
import com.dangbei.lerad.sample.test.reflect.Dog;
import com.dangbei.lerad.viewer.Viewer;

import java.lang.reflect.Method;

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
//        test();
    }

    private void test() {
        try {
            Class<Dog> clazz = (Class<Dog>) Class.forName("com.dangbei.lerad.sample.test.reflect.Dog");
            Method method[] = clazz.getMethods();
            Method declearedMethod[] = clazz.getDeclaredMethods();

            for (Method m : method) {
                Log.d("yl", getClass().getName() + "-----------------" + "method: " + m.getName());
            }

            for (Method m : declearedMethod) {
                Log.d("yl", getClass().getName() + "-----------------" + "declearedMethod: " + m.getName());
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    @Override
    public void onRequestTest(String s) {
        Log.d("yl", getClass().getName() + "--------------------" + s);
    }
}
