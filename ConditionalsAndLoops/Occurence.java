import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number in which in you have to find no. of occurrence : ");
        int number = input.nextInt();
        int numbersAre = number;

        System.out.print("Enter the number you want to find occurrence of : ");
        int check = input.nextInt();

        int count = 0;
        while (number != 0) {
            int lastNumber = number % 10;
            if (lastNumber == check) {
                count = count + 1;
            }
            number = number / 10;
        }

        System.out.println("The number of occurence of " + check + " in " + numbersAre + " is : " + count);
        input.close();
    }
}
