package homework3;

public class Glide extends Aircraft {
    public Glide(String type, double speed) {
        super(type, speed);
    }

    public void glide() {
        System.out.println("can glide");
    }
}
