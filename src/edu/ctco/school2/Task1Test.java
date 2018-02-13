package edu.ctco.school2;
import java.util.Scanner;

public class Task1Test {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("enter cm");
        int cm = number.nextInt();
        int mm =cm*10;

            System.out.println("entered " + cm + " cm" + " is " + mm + " mm");
    }
}
