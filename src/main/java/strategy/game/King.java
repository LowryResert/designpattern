package strategy.game;

import strategy.game.behavior.WeaponBehavior;
import strategy.game.behavior.impl.KnifeBehavior;

public class King extends Character {
    public King() {
        this(new KnifeBehavior());
    }

    public King(WeaponBehavior weapon) {
        super.weapon = weapon;
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
