package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String name;
        String reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.print("enter word you want : ");
        name = input.next();
        int length = name.length();
        for (int i = length; i > 0 ; i--) {
            reverse = reverse + name.charAt(i-1);
        }
//        System.out.print(reverse + " " + name);
        if (name.equals(reverse)){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }
    }
}
