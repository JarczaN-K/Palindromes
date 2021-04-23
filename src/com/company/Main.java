package com.company;

import java.util.Scanner;

public class Main {

    public static boolean palindromeCheck(String palindrome) {
        int first = 0;
        int last = palindrome.length() - 1;
        while (first < last) {
            if (palindrome.charAt(first) != palindrome.charAt(last)) {
                return false;
            } else {
                first++;
                last--;
            }
        }
        return true;
    }

    static int createPalindrome(String palindromeToCreate) {
        StringBuilder builder = new StringBuilder(palindromeToCreate);
        int first = 0;
        int last = builder.length() - 1;
        while (first < last) {
            if (builder.charAt(first) == builder.charAt(last)) {
                first++;
                last--;
            } else if (builder.charAt(first + 1) == builder.charAt(last)) {
                builder.deleteCharAt(first);
                palindromeCheck(builder.toString());
                return 1;
            } else if (builder.charAt(first) == builder.charAt(last - 1)) {
                builder.deleteCharAt(last);
                palindromeCheck(builder.toString());
                return 2;
            } else if (!palindromeCheck(builder.toString())) {
                return 3;
            }
        }
        return 0;
    }

    static void answer(String question) {
        switch (createPalindrome(question)) {
            case 0 -> {
                System.out.println("Palindrome");

            }
            case 1 -> {
                System.out.println("Created left palindrome");

            }
            case 2 -> {
                System.out.println("Created right palindrome");

            }
            case 3 -> {
                System.out.println("Not a palindrome");

            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        answer(scan);
    }
}
