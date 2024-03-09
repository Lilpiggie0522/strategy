package Ducks;

public class FlyingRubberDuck extends Duck {
    public FlyingRubberDuck() {
        super(new Squeak(), new FlyNoWay());
    }
}
