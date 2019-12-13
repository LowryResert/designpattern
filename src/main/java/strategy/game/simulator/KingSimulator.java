package strategy.game.simulator;

import strategy.game.King;
import strategy.game.behavior.impl.SwordBehavior;

public class KingSimulator {
    public static void main(String[] args) {
        King king = new King();
        king.fight();
        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}
