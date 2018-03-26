package week5;

import week4.domain.Car;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car cl = new Car(123);
        Car c2 = new Car (124);
        Map m = new HashMap();
                m.put("123", cl);
                m.put("123", c2);
        Set set = m.keySet();for (Object key: set){
            Object o = m.get(key);
            System.out.println(o);
        }
        System.out.println("Now with entry ");


//
//
//    List l = new ArrayList();
//    l.add(cl);
//    l.add(c2);
//
//    for (Object o : l){
//        System.out.println(o);
//    }
//
//
//    Set s = new HashSet();
//        s.add(cl);
//        s.add(c2);
//        for (Object o : s) {
//            System.out.println(o);
//        }

       // System.out.println("hash case");
       // Set s = new HashSet();
       // s.add(cl);
       // s.add(c2);
        // ...

}
}
