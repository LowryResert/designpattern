package strategy;

import strategy.behavior.QuackBehavior;

public class DuckCall {

    private QuackBehavior quackBehavior;

    public DuckCall(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
