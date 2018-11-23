package com.moonlit.myspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/11/23.
 */
@Component("guanyu")
public class GuanYu implements Hero {

    @Autowired
    @Qualifier("guanyudecai")
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
