package ru.spbstu.telematics.java;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number or text: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The input \"" + input + "\" is a palindrome!");
        } else {
            System.out.println("The input \"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        String normalized = input.toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }
}
