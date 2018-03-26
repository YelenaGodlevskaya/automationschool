package week1;

public class FirstLesson {
    public static void main(String[] args) {
//        String a = "Hello,";
//        String b = "World!";
//        String c1 = a + " Java " + b;
//        String c2 = String.format("%s Java %s", a, b);
//        System.out.println(c2);
//        String c3 = String.join(" ", a, "Java", b);
//        System.out.println(c3);

//        int a = 200;
//        int b = 50;
//        int c = a + b;
//
//        System.out.println("c variable =" + c);
//
//        int d = c / 4 * 2;
//        System.out.println("d variable =" + d);
//
//        int e = 1000 - c * 2;
//        System.out.println("e variable =" + e);
//
//        int f = (1000 - c) * 2;
//        System.out.println("f variable =" + f);

//        double a = 200.0;
//        double b = 50.0;
//        double c = a + b;
//
//        double d = c / 4.0 * 2.0;
//
//        double e = 1000.0 - c * 2.0;
//
//        double f = (1000.0 - c) * 2.0;
//
//        System.out.println("f variable =" + f);

//        boolean a = 10>3;
//                boolean b = a && 20 < 4;
//        System.out.println(b);
//        boolean c = 10>3;
//        boolean c = a & b;
//        boolean a = 10>3;
//        if (a){
//            System.out.println("a is true");
//        }
//            else{
//            System.out.println("a is false");

//        for (int i = 1; i <=10; i++) {
//            System.out.println("count is: );

//         int i = 1;
//         while (i <= 100) {
//             if (i>10){break;}
//             System.out.println(i);
//             i++;

/*        int i = 1;
        while (i <= 100) {
            if (i == 5){continue;}
            System.out.println(i);
            i++;
        }
        }*/
//import java.util.Scanner;
//
//        class Main {
//            public static void main(String[] args) {
//                Scanner number = new Scanner(System.in);
//                System.out.println("enter integer number");
//                int a = number.nextInt();
//                double x = Math.pow(a, 1.0/3.0);
//                System.out.println(1.0/3.0);
//                System.out.println(x);
//                System.out.println("result of cube root= " + x);
//                if (Math.round(x)== 0) //not clear how it should be checked
//                    System.out.println("entered number "+ a + " is cubic ");
//                else
//                    System.out.println("entered number "+ number + " is not cubic ");

//            }
//        }
    }
    class Main {
        public void main(String[] args) {
            System.out.println("Hello world!");
        }

        public void getNewNumber(int d) // extends RuntimeException extends Exception
        {
            if (d < 0) {
                throw new IllegalArgumentException("Negative numbers are restricted!");
            }

            new NegativeNumberException("Negative numbers are restricted!");
            // how to print exception and do not stop program: DKA

        }

        class NegativeNumberException extends Exception {
            public NegativeNumberException(){};

            public NegativeNumberException(String message) {
                super(message);
            }
        }
    }

    public static void getNewNumber(int d) throws week2.FirstLesson.NegativeNumberException
    {
        if (d < 0) {
            throw new week2.FirstLesson.NegativeNumberException("Negative numbers are restricted!");
        }
// esli statuchnij a daljse ispoljzuem ne statichnij to nado sozdatj object/exeplar classa

      /*  class FirstLesson {

            private int myVar = 100;

            public static void main(String[] args) {
                FirstLesson lesson = new FirstLesson();
                FirstLesson lesson2 = new FirstLesson();
                FirstLesson lesson3 = new FirstLesson();

                lesson.setMyVar(99);
                lesson2.setMyVar(88);

                lesson.printMyVar();
                lesson2.printMyVar();
                lesson3.printMyVar();
            }

            private void setMyVar(int i) {
                myVar = i;
            }

            private void printMyVar() {
                System.out.println(myVar);
            }

            public void getNewNumber(int d) throws NegativeNumberException {
                if (d < 0) {
                    throw new NegativeNumberException("Negative numbers are restricted!");
                }
            }

            public class NegativeNumberException extends Exception {
                public NegativeNumberException(){};

                public NegativeNumberException(String message) {
                    super(message);
                }
            }

        }
*/
    }
}