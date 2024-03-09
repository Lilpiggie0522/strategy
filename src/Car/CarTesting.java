package Car;

public class CarTesting {
    public static void main(String[] args) {
        RaceCar raceCar = new RaceCar();
        raceCar.brakeApply();
        raceCar.pull();

        FamilyCar familyCar = new FamilyCar();
        familyCar.brakeApply();
        familyCar.drive();
        familyCar.pull();
        familyCar.honk();
    }
}
