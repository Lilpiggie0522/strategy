package Car;

public class FamilyCar extends Car{
    public FamilyCar() {
        super();
        this.setBrakeBehaviour(new SmoothBrake());
        this.setPullBehaviour(new SlowPull());
        this.setHonkBehaviour(null);
    }
}
