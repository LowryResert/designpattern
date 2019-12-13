package strategy.duck;

import strategy.duck.behavior.FlyBehavior;
import strategy.duck.behavior.QuackBehavior;
import strategy.duck.behavior.impl.FlyWithWings;
import strategy.duck.behavior.impl.Quack;

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
