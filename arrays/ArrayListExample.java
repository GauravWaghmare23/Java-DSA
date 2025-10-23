import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int input = in.nextInt();
        while (9999 != input) {
            list.add(input);
            input = in.nextInt();
        }
        System.out.print(list);
        in.close();
    }
}