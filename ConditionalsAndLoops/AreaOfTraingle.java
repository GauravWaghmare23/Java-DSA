import java.util.Scanner;

public class AreaOfTraingle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height and base of the triangle : ");
        float height = input.nextFloat();
        float base = input.nextFloat();

        float area = 0;

        area = 0.5f* height * base;
        System.out.println("The area of triangle is : "+ area);
    }
}
