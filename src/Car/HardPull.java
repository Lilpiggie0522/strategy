package Car;

public class HardPull implements PullBehaviour {
    @Override
    public void pull() {
        System.out.println("pulls hard");
    }
}
