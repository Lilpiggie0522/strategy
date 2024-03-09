package Car;

public class SlowPull implements PullBehaviour {
    @Override
    public void pull() {
        System.out.println("pulls slowly");
    }
}
