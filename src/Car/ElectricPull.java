package Car;

public class ElectricPull implements PullBehaviour {
    @Override
    public void pull() {
        System.out.println("electric acceleration, sommoth and fast!");
    }
}
