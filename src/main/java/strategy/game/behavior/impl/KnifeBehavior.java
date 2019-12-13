package strategy.game.behavior.impl;

import strategy.game.behavior.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use knife as weapon");
    }
}
