package javabasics;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        System.out.println("Taking inputs from the users");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        System.out.println("Enter number 3");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println(sum);
    }
}
