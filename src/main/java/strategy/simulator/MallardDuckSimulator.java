package strategy.simulator;

import strategy.Duck;
import strategy.MallardDuck;

public class MallardDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.setFlyBehavior(() -> System.out.println("test1"));
        mallard.setQuackBehavior(() -> System.out.println("test2"));
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.swim();
    }
}
