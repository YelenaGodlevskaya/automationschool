package homework3;

public class Aircraft {
    String type;
    double speed;

    public Aircraft(String type, double speed) {
        this.type = type;
        this.speed = speed;
    }

    public void fly() {
        System.out.println(" can fly ");
    }
}
