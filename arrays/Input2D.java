import java.util.Scanner;

public class Input2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Matrix:");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
