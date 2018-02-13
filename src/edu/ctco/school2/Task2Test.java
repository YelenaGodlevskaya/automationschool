package edu.ctco.school2;
import java.util.Scanner;

public class Task2Test {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter integer number");
        int x = number.nextInt();
        if (x%2==0)

            System.out.println("number " + x + " is even");
        else
            System.out.println("number " + x + " is odd");
    }
}
