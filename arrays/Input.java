import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];

        System.out.print("Enter 10 integers : ");
        for (int idx = 0; idx < array.length; idx++) {
            array[idx] = in.nextInt();
        }

        System.out.println("You entered:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        in.close();
    }
}
