import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any word to check the type case : ");
        char ch = input.nextLine().trim().charAt(0);
         if (ch >= 'a' && 'z' >= ch) {
            System.out.println("The word is in lower case.");
        } else {
            System.out.println("The word is in Upper case.");
        }
         input.close();
    }
}
