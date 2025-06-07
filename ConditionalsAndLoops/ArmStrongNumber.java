import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number through which you have to find arm strong number : ");
        int number = input.nextInt();

        
        
        
        int index = 1;
        System.out.println("the arm strong numbers are : ");
        while (index <= number) {
            int arm = index;
            int sum = 0;
            while (arm != 0) {
                int lastNumber = arm % 10;
                sum = sum + (lastNumber * lastNumber * lastNumber);
                arm = arm / 10;
            }
            if (sum == index) {
                System.out.println(index);
            }
            index++;
        }

    }
}
