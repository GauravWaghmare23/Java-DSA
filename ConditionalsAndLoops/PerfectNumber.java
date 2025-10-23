// Perfect Number In Java: Check if a given positive integer is a perfect number. A perfect number is a positive integer that is equal to the sum of its proper positive divisors (divisors excluding the number itself). (e.g., 6 is a perfect number because its divisors are 1, 2, 3, and 1+2+3=6).

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int tempNumber = number;
        int index = 1;
        int store = 0;
        while (tempNumber > index) {
            if (tempNumber % index == 0) {
                store = store + index;
            }
            index++;
        }
        if (store == number) {
            System.out.println("Its a perfect number.");
        } else {
            System.out.println("Its not a perfect number.");
        }
        input.close();
    }
}