package javabasics;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any long value");
        long x = input.nextLong();
        System.out.println("you have entered x="+x);
        input.close();
    }
}
