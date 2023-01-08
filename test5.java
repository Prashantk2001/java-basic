package javabasics;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

            Scanner input =new Scanner(System.in);
            System.out.println("Enter any char value");
            char x = input.nextLine().charAt(0);

            System.out.println("you have entered x = " +x);
            input.close();
    }
}
