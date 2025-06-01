import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your full name :: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your roll number :: ");
        int rollno = scanner.nextInt();


        System.out.println("Your name is " + name);
        System.out.println("Your roll no. is " + rollno);
        
        scanner.close();
    };
};
