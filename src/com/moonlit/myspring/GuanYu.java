package com.moonlit.myspring;

/**
 * Created by Administrator on 2018/11/23.
 */
public class GuanYu implements Hero {
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
