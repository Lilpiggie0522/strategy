package Car;

public class SmoothBrake implements BrakeBehaviour {
    @Override
    public void brake() {
        System.out.println("brakes smoothly!");
    }
}
