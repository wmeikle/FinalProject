package Final;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Home extends LoanObject {
    private double apr;

    /** Construct default Home loan object*/
    public Home() {}

    public Home(int InitialAmount, int TimeInYears, int CreditScore) {
    }

    /** Return APR*/
    public double getApr () {
        // read from file to get creditScore and convert to APR, return apr
try{
        Scanner scanner = new Scanner(new File("data.txt"));
        int [] tall = new int [1];
        int i = 0;
        while(scanner.hasNextInt())
        {
            tall[i++] = scanner.nextInt();
        }
        int sum = 0;
        for( int num : tall) {
            sum = sum+num;
            return sum;
        }


    return switch ((630 <= sum && sum <= 689) ? 0 : (690 <= sum && sum <= 719) ? 1 : 2) {
        case 0 -> apr = .00289;
        case 1 -> apr = .00260;
        case 2 -> apr = .00250;
        default -> apr;
    };
}catch (IOException e) {
    e.printStackTrace();
    System.exit(1);
}return apr;

    }
    /** Construct a auto loan with specified APR*/
    public Home (double InitialAmount, int TimeInYears) {
        setInitialAmount(InitialAmount);
        setTimeInYears(TimeInYears);
    }

    /** Return monthly minimum payment*/
    public double Payment() {
        // Using previously inputted variables calculate minimum monthly payment
        int tim = getTimeInYears() * 12;
        double Payment = ((getInitialAmount() * (getApr()/12)) / (1-Math.pow(1+(getApr()/12), -tim)));
        return Payment;
    }

    /** Return final loan amount*/
    public double FinalTotal() {
        // Using previously inputted variables calculate and return final amount
        int tim = getTimeInYears() * 12;
        double FinalTotal = Payment() * tim;
        return FinalTotal;
    }
    DecimalFormat df = new DecimalFormat("###,##0.00");

    @Override
    public String toString() {
        // Initial return language
        return "Created on " + getDateCreated() + "\nBegining Loan Ammount: $" + df.format(getInitialAmount()) +
                "\nMonthly Payment: $" + df.format(Payment()) + "\nTotal Paid with interest at life of loan: $"
                + df.format(FinalTotal());
    }
}
