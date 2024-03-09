package Ducks;
public class FlyNoWay implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("can't fly, no way");
    }
}
