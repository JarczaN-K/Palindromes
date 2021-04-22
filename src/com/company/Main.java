package com.company;

public class Main {

    public static boolean palindromeCheck(String palindrome) {
        int length = palindrome.length();
        int first = 0;
        int last = length - 1;
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

    public static void main(String[] args) {
        if (palindromeCheck("kajak")){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
