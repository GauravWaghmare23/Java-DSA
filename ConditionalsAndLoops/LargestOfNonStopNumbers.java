// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestOfNonStopNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The program is running........");
        System.out.println("Enter the numbers continuosly and if you want to stop press '0'");
        System.out.println();
        System.out.print("Enter the number  : ");
        int number = input.nextInt();
        int max = number;
        while (number != 0) {
            if (max <= number) {
                max = number;
            }
            System.out.print("Enter the number  : ");
            number = input.nextInt();
        }
        System.out.println("The largest of all the number is : " + max);
        System.out.println("The program is executed...........");
        input.close();
    }
}
