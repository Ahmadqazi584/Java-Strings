package com.company;

public class Stringpractice4 {
    public static void main(String[] args) {
        String str4 = "ahmer";
        String str5 = "ahmed";
        char ch4 [] = str4.toCharArray();
        char ch5 [] = str5.toCharArray();
        for (int i = 0; i < str4.length(); i++) {
            if (ch4[i] < ch5[i]) {
                System.out.println(str4 + " is greater than " + str5);
                break;
            }else if (ch4[i] == ch5[i]){
                continue;
            }else {
                System.out.println(str5 + " is greater than " + str4);
                break;
            }
        }
    }
}
