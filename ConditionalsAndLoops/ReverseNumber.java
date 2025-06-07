import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number in which you have wanted to reverse : ");
        int number = input.nextInt();
        int numbersAre = number;

        int newNumber = 0;
        while (number != 0) {
            int lastNumber = number % 10;
            newNumber = (newNumber * 10) + lastNumber;
            number = number / 10;
        }

        System.out.println("The reverse number of  " + numbersAre + " is : " + newNumber);

    }
}
