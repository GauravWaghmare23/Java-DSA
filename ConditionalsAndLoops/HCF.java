import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int number1 = input.nextInt();
        int tempNumber1 = number1;
        System.out.print("Enter the number 2 : ");
        int number2 = input.nextInt();
        int tempNumber2 = number2;

        while (tempNumber2 != 0) {
            int remainder = tempNumber1 % tempNumber2;
            tempNumber1 = tempNumber2;
            tempNumber2 = remainder;
        }

        System.out.println(
                "The Highest least common factor of " + number1 + " and " + number2 + " is equals : " + tempNumber1);
        input.close();
    }
}
