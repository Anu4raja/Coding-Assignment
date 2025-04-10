package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.next();
        System.out.print("Enter second string: ");
        String s1 = sc.next();

       
        s = s.toLowerCase();
        s1 = s1.toLowerCase();

        if (s.length() != s1.length()) {
            System.out.println("Not an anagram");
        } else {
            char[] c = s.toCharArray();
            char[] c1 = s1.toCharArray();

            Arrays.sort(c);
            Arrays.sort(c1);

            if (Arrays.equals(c, c1)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an anagram");
            }
        }
      
    }
}
