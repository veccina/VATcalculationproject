import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double amount, VATrate, VATamount, tAmount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fee amount : ");

        amount = input.nextDouble();
        VATrate = (amount > 0 && amount <1000 ) ? 0.20 : 0.08;
        VATamount = amount * VATrate;
        tAmount = amount + VATamount;

        System.out.println("Amount without VAT : " + amount + "Dollar(s)");
        System.out.println("VAT Rate : " + "%" + VATrate);
        System.out.println("VAT Amount : " + VATamount + "Dollar(s)" );
        System.out.println("Amount with VAT : " + tAmount + "Dollar(s)");
    }
}