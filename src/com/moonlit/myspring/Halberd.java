package com.moonlit.myspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/11/23.
 */
@Component
@Qualifier("lvbudecai")
public class Halberd implements Weapon{
    @Override
    public void attack() {
        System.out.println("Halberd is attacking!");
    }
}
