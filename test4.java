package javabasics;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {

            Scanner input =new Scanner(System.in);
            System.out.println("Enter any string value");
            String x = input.nextLine();
            System.out.println("you have entered x = " +x);
            input.close();
    }
}
