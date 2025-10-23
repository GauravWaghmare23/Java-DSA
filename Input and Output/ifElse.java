import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name :: ");
        String name = input.nextLine();

        if (name.equalsIgnoreCase("Gaurav Waghmare")) {
            System.out.println("You are " + name);
        }
        else {
            System.out.println("You are not Gaurav Waghmare");
        }

        input.close();
    }
}

