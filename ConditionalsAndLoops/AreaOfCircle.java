import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        float radius = input.nextFloat();

        float pi = 3.14159f;
        float area = 0f;

        area = radius * (pi * pi);
        System.out.println("The area of the circle is : " + area);

        input.close();
    }
}