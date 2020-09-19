import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {


    public static void main (String[] arg) {
        final byte percent = 100;
        final byte months_In_A_Year = 12;
        System.out.print("Principal: ");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat();
        float monthlyInterest = interest / percent / months_In_A_Year;

        System.out.print("Years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * months_In_A_Year;

        double mortgage = principal * (monthlyInterest *Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) * 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ mortgageFormatted);
    }
}
