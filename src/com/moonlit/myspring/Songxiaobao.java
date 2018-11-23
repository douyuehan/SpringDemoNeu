package com.moonlit.myspring;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/11/22.
 */
@Component
public class Songxiaobao implements Perform {
    @Override
    public void perform() {
        System.out.println("海燕啊，长点心吧");
    }
}
