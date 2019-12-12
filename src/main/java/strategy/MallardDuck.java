package strategy;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;
import strategy.behavior.impl.FlyWithWings;
import strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this(new FlyWithWings(), new Quack());
    }

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("mallard duck display");
    }
}
