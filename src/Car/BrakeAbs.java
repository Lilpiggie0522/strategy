package Car;

public class BrakeAbs implements BrakeBehaviour {
    @Override
    public void brake() {
        System.out.println("ABS brake!");
    }
}
