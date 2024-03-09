package Ducks;
public abstract class Duck {
    private QuackBehaviour quackBehaviour;
    private FlyingBehaviour flyBehaviour;

    public Duck(QuackBehaviour qb, FlyingBehaviour fb) {
        this.quackBehaviour = qb;
        this.flyBehaviour = fb;
    }

    public void swim() {
        System.out.println("swimming meticulously");
    }

    public void quack() {
        this.quackBehaviour.quack();
    }

    public void fly() {
        this.flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyingBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
