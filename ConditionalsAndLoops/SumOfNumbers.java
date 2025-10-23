// Write a program to find the sum of all integers from 1 to N. 

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        int sum = 0;
        int index = 1;
        while (index <= number) {
            sum = sum + index;
            index++;
        }
        System.out.println("The sum of all the numbers is : " + sum);
        input.close();
    }
}
