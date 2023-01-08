package javabasics;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any float value");
        float x= input.nextFloat();
        System.out.println("you have entered x="+x);
        input.close();
    }
}