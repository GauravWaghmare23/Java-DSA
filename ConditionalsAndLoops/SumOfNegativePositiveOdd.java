//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class SumOfNegativePositiveOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to find out the sum of negative, positive and odd numbers");
        System.out.println();
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int sumOfNegativeNumbers = 0;
        int sumOfPostiveNumbers = 0;
        int sumOfOddNumbers = 0;

        while (number != 0) {
            if (number > 0) {
                sumOfPostiveNumbers += number;
            }
            if (number < 0) {
                sumOfNegativeNumbers += number;
            }
            if (number % 2 != 0 && number > 0) {
                sumOfOddNumbers += number;
            }
            System.out.print("Enter the number : ");
            number = input.nextInt();
        }
        System.out.println("The sum of positive numbers is equals : " + sumOfPostiveNumbers);
        System.out.println("The sum of negative numbers is equals : " + sumOfNegativeNumbers);
        System.out.println("The sum of odd numbers is equals : " + sumOfOddNumbers);
        input.close();
    }
    
}