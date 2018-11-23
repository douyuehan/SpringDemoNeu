package com.moonlit.myspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/11/23.
 */
@Component("guanyu")
public class GuanYu implements Hero {
    @Autowired
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void perform() {
        System.out.println("关羽捡起了武器");
        weapon.attack();
    }
}
