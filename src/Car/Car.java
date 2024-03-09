package Car;

public abstract class Car {
    private BrakeBehaviour brakeBehaviour;
    private PullBehaviour pullBehaviour;
    private HonkBehaviour honkBehaviour;

    public void drive() {
        System.out.println("driving on the road");
    }

    public void setBrakeBehaviour(BrakeBehaviour brakeBehaviour) {
        this.brakeBehaviour = brakeBehaviour;
    }

    public void setPullBehaviour(PullBehaviour pullBehaviour) {
        this.pullBehaviour = pullBehaviour;
    }
    
    public void brakeApply() {
        this.brakeBehaviour.brake();
    }

    public void pull() {
        this.pullBehaviour.pull();
    }

    public void setHonkBehaviour(HonkBehaviour honkBehaviour) {
        this.honkBehaviour = honkBehaviour;
    }

    public void honk() {
        this.honkBehaviour.honk();
    }
}
