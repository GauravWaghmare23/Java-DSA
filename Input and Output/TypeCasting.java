public class TypeCasting {
    public static void main(String[] args) {

        // byte -> short -> int -> Long -> float -> double (in ascending order form smaller to larger)

        int number = (int) (123.456f);
        System.out.println(number);

        float number2 = (float) (123234.234565);
        System.out.println(number2);

        int number3 = (int) (123456765423434L);
        System.out.println(number3); 
    }
}
