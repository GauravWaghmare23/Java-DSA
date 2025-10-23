// Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number you want factors of : ");
        int number = input.nextInt();

        int index = 1;
        int factors = 0;

        System.out.println("The factorial of "+number+" is 👇");
        while (index <= number) {
            if (number % index == 0) {
                factors = index;
                System.out.println(factors);
            }
            index++;
        }

        input.close();
    }
}
