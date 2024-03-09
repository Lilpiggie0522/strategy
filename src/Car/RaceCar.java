package Car;

public class RaceCar extends Car {
    public RaceCar() {
        super();
        this.setBrakeBehaviour(new BrakeAbs());
        this.setPullBehaviour(new HardPull());
        this.setHonkBehaviour(new HonkLikeCrazy());
    }
}
