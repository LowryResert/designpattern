package strategy.duck.behavior.impl;

import strategy.duck.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("quack");
    }
}
