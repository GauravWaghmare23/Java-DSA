import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int number1 = input.nextInt();
        System.out.print("Enter the number 2 : ");
        int number2 = input.nextInt();
        System.out.print("Enter the number 3 : ");
        int number3 = input.nextInt();

        int max = number1;

        if (max <= number2) {
            max = number2;
        }
        if (max <= number3) {
            max = number3;
        }

        System.out.println("The largest of " + number1 + " & " + number2 + " & " + number3 + " is " + max);

    }

}