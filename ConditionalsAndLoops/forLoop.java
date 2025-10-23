import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many times you want to print hello World : ");
        int n = input.nextInt();
        for (int num = 1; num <= n; num += 1) {
            System.out.println(num + " : Hello, World!");
        }
        input.close();
    }
}
