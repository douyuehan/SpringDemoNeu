package com.moonlit.myspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/11/23.
 */
//让spring容器初始化一个Falchion的对象
@Component
@Qualifier("guanyudecai")
public class Falchion implements Weapon {
    @Override
    public void attack() {
        System.out.println("falcon is attacking!");
    }
}
