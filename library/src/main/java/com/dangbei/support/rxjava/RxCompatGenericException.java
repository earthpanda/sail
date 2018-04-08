package com.dangbei.support.rxjava;

/**
 * Created by yl on 2018/4/8.
 */
public class RxCompatGenericException<T extends RxCompatException> {

    private T t;

    public T getRxCompatException() {
        return t;
    }

}
