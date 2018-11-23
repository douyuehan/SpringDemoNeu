package com.moonlit.myspring;

/**
 * Created by Administrator on 2018/11/23.
 */
public class Dog implements Perform {
    private int count = 0;
    @Override
    public void perform() {
        System.out.println("接飞盘" + count);
    }
}
