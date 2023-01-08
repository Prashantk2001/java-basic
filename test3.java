package javabasics;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter any int value");
        int x = input.nextInt();
        System.out.println("you have entered x = " +x);
        input.close();
    }
}
