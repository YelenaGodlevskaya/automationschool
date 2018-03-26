package homework3;

public class Hyper extends Aircraft {
    Hyper(String type, double speed) {
        super(type, speed);
    }

    void hyper() {
        System.out.println("can fly hypersonic");
    }
}
