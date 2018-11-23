package com.moonlit.myspring;

/**
 * Created by Administrator on 2018/11/22.
 */
public class ChinaPoem implements Poem {
    private static String[] LINES = {
            "门前大桥下",
            "游过一群鸭",
            "快来快来数一数",
            "二四六七八",

    };
    @Override
    public void recite() {
        for(String string : LINES)
        {
            System.out.println(string);
        }
    }
}
