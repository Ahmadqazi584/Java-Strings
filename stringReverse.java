package com.company;

public class stringReverse {
    public static void main(String[] args) {
        String [] arr = {"Ahmed", "zaid", "qazi", "edcba"};

//        String name = "ahmed";
        for (int i = 0; i < arr.length; i++) {
            int l = arr[i].length();
            for (int j = l; j > 0; j--) {
                System.out.print(arr[i].charAt(j - 1) + " ");
            }
            System.out.println();
        }
    }
}
