package org.example.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateChars {

    public String nonDuplicateChars(String s){
        if(s == null){
            return null;
        }

        StringBuilder sb = new StringBuilder();
        HashSet<Character> chars = new HashSet<>();

        for(char c: s.toCharArray()){
            if(!chars.contains(c)){
                sb.append(c);
                chars.add(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DuplicateChars dc = new DuplicateChars();

        System.out.print("Enter the string: ");
        String str = input.nextLine();

        String result = dc.nonDuplicateChars(str);
        System.out.println("String after removing duplicates: " + result);
    }
}
