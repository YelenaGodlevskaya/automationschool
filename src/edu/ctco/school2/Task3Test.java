package edu.ctco.school2;
import java.util.Scanner;

public class Task3Test {
    public static void main(String[] args){
    Scanner number = new Scanner(System.in);
    System.out.println("enter integer number");
        int a = number.nextInt();
    double x = Math.pow(a, 1./3);

    System.out.println("result of cube root= " + x);
        if (x == 0) //not clear how it should be checked
        System.out.println("entered number"+ number + "is cubic ");
        else
        System.out.println("entered number"+ number + "is not cubic ");

}
}