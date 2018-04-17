package com.dangbei.lerad.sample.test.reflect;

/**
 * Created by yl on 2018/4/16.
 */
public class Dog extends Animal {

    private String type;

    public int color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    private void checkColor() {

    }

    @Override
    public void setName(String name) {
//        super.setName(name);
    }
}
