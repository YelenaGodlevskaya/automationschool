package zHomeworkTest;

public class Main{
    public static void main(String[] args) {
        RegularGlider rg = new RegularGlider();
        rg.fly();
        rg.glid();
        //System.out.println(rg.type + " has speed " + rg.speed);
        PropellerDriven pd = new PropellerDriven();
        pd.fly();
        pd.glid();
        //System.out.println(pd.type + " has speed " + pd.speed);

    }
}
