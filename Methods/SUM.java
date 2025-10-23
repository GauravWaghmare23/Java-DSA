package Methods;

import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int num1 = in.nextInt();

        System.out.print("Enter the number 2 : ");
        int num2 = in.nextInt();

        int answer = sum(num1,num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is equals : " + answer);
        in.close();
    }
    static int sum(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }
}