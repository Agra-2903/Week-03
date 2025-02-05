package org.example.stringbuilder;

import java.util.Scanner;

public class ReverseString {

    public String reverse(String s){
        if(s == null){
            return null;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReverseString a = new ReverseString();

        System.out.println("Enter the string");
        String str = input.nextLine();
        String result = a.reverse(str);
        System.out.println("Reversed String is: " + result);

        input.close();
    }
}
