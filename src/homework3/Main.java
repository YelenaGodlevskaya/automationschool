package homework3;

public class Main {
    public static void main(String[] args) {
        RegularGlider rg = new RegularGlider();
        System.out.println(rg.type + " has maximum speed " + rg.speed);
        rg.glide();
        System.out.println(" ");

        PropellerDriven pd = new PropellerDriven();
        System.out.println(pd.type + " has maximum speed " + pd.speed);
        pd.glide();
        System.out.println(" ");

        TurbojetHyper th = new TurbojetHyper();
        System.out.println(th.type + " has maximum speed " + th.speed);
        th.hyper();
        System.out.println(" ");

        TurbojetNotHyper tnh = new TurbojetNotHyper();
        System.out.println(tnh.type + " has maximum speed " + tnh.speed);


    }
}
