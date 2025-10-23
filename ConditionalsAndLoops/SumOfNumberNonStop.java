// Take integer inputs till the user enters 0 and print the sum of all numbers
//(HINT: while loop)

import java.util.Scanner;

public class SumOfNumberNonStop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("The program is running........");
        System.out.println("Enter the number you want to add continuosly and if you want to stop press '0'");
        System.out.println();
        System.out.print("Enter the number  : ");
        int number = input.nextInt();
        int sum = 0;
        while (number != 0) {
            sum = sum + number;
            System.out.print("Enter the number  : ");
            number = input.nextInt();
        }
        System.out.println("The addition of all the number is : " + sum);
        System.out.println("The program is executed...........");
        input.close();
    }
}
