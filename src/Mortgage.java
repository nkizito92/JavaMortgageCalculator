import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {

    public static void main (String[] arg) {
        final byte percent = 100;
        final byte months_In_A_Year = 12;
        byte years = 0;
        int principal = 0;
        float interest = 0;

        Scanner scanner = new Scanner(System.in);
        while(true) {
              System.out.print("Principal: $");
              principal = scanner.nextInt();
            if(principal > 1000) break;
        }
           while(true)  {
               System.out.print("Annual Interest Rate: ");
               interest = scanner.nextFloat();
               if(interest > 0 && interest < 30) break;
           }
            float monthlyInterest = interest / percent / months_In_A_Year;

        while(true) {
            System.out.print("Years: ");
            years = scanner.nextByte();
            if(years > 0) break;
            System.out.println("Most be at least a year");
        }
        int numberOfPayments = years * months_In_A_Year;
        double mortgage = principal * (monthlyInterest *Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) * 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ mortgageFormatted);
    }
}
