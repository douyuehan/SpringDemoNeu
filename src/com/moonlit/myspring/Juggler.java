package com.moonlit.myspring;

/**
 * Created by Administrator on 2018/11/22.
 */
//杂技演员
public class Juggler implements Perform{
    private int bags = 3;//袋子（小球）的个数

    public Juggler(int bags)
    {
        this.bags = bags;
    }
//    public Juggler()
//    {
//
//    }
    @Override
    public void perform() {
        System.out.println("在表演抛" + bags + "个小球");
    }
}
