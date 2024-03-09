package Ducks;

public class DuckTest {
    public static void main(String[] args) {
        FlyingRubberDuck flyingRubberDuck = new FlyingRubberDuck();
        flyingRubberDuck.quack();
        flyingRubberDuck.fly();

        MutantDuck mutantDuck = new MutantDuck();
        mutantDuck.quack();
        mutantDuck.fly();
    }
}
