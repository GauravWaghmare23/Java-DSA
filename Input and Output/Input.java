import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("What is Your name : ");
        Scanner in = new Scanner(System.in);
        System.out.println("The name is " + in.next());
        in.close();
    }
}
