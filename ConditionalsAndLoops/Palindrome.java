// Find if a number is palindrome or not: Check if a number reads the same forwards and backwards.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = input.nextInt();
        int tempNumber = number;

        int reverseNumber = 0;

        while (tempNumber != 0) {
            int lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }
        if (number == reverseNumber) {
            System.out.println("Its a palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }
        input.close();
    }
}
