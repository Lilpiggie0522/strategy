package Ducks;

public class MutantDuck extends Duck {
    public MutantDuck() {
        super(new SpitFire(), new Fly());
    }
}
