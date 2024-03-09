package Ducks;
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("cant quack, just squeak");
    }
}
