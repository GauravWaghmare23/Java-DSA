import java.util.Scanner;

public class ElectricityCharge {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter this month's, unit you consume : ");
        double unit = input.nextDouble();
        double charges = 0.0f;
        if (unit >= 0 && unit <= 100) {
            charges = unit * 5.88;
        }else if (unit > 100 && unit <= 200) {
            charges = ((unit - 100) * 7.0) + (100 * 5.88);
        }else if (unit > 200 && unit <= 400) {
            charges = ((unit - 200) * 8.50) + (100 * 7.0) + (100 * 5.88);
        }else if (unit > 400) {
            charges = ((unit - 400) * 9.60) + (100 * 8.50) + (100 * 7.0) + (100 * 5.88);
        }

        double fixedPriceForAll = 50.0;
        double subTotal = charges + fixedPriceForAll;
        double domesticConsumerTaxPercent = 16;
        double industrialConsumerTaxPercent = 21;
        double domesticTaxCharge = 0.00;
        double industrialTaxCharge = 0.00;
        double totalCharge = 0.00;

        System.out.print("Enter which consumer you are (domestic connsumer or industrial consumer) : ");
        String consumer = input.next();
        
        if (consumer.equals("Domestic") || consumer.equals("domestic") || consumer.equals("Domestic consumer")
                || consumer.equals("domestic consumer")) {
            domesticTaxCharge = (domesticConsumerTaxPercent / 100) * subTotal;
            totalCharge = subTotal + domesticTaxCharge;
        }else if (consumer.equals("Industrial") || consumer.equals("industrial")
                || consumer.equals("Industrial consumer")
                || consumer.equals("industrial consumer")) {
            industrialTaxCharge = (industrialConsumerTaxPercent / 100) * subTotal;
            totalCharge = subTotal + industrialTaxCharge;
        } else {
            System.out.println(
                    "Error : you entered the consumer that isn't exist. (Consumer has to be either domestic connsumer or industrial consumer)");
        }

        System.out.println("Your this month bill is : " + totalCharge);
        System.out.println("Your this month bill details : ⬇");
        System.out.println("Your this month unit consumed is : " + unit);
        System.out.println("Your this month charge for " +unit+ " : " + charges);
        System.out.println("Fixed price for Consumer : " + fixedPriceForAll);
        System.out.println("Domestic tax (16%) charge  is : " + domesticTaxCharge );
        System.out.println("Industrial tax (21%) charge is : " + industrialTaxCharge );
        System.out.println("                   _________________________________________");
        System.out.println("                                     "+totalCharge);

        

    }
}
