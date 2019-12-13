package strategy.game.behavior.impl;

import strategy.game.behavior.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use sword as weapon");
    }
}
