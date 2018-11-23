package com.moonlit.myspring;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/11/23.
 */
@Component
public class Falchion implements Weapon {
    @Override
    public void attack() {
        System.out.println("falcon is attacking!");
    }
}
