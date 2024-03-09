package Car;

public class HybridCar extends Car {
    public HybridCar() {
        super();
        this.setBrakeBehaviour(new SmoothBrake());
        this.setPullBehaviour(new ElectricPull());
        this.setHonkBehaviour(new Honk());
    }
}
