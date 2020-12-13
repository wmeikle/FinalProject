package Final;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Home extends LoanObject {
    private double apr;

    /** Construct default Home loan object*/
    public Home() {}

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
        }

    return switch ((630 <= sum && sum <= 689) ? 0 : (690 <= sum && sum <= 719) ? 1 : (720 <= sum && sum <= 850)
          ? 2 : 3) {
        case 0 -> apr = 2.89;
        case 1 -> apr = 2.6;
        case 2 -> apr = 2.5;
        default -> apr = 3.0;
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
        /**
         * A = P ((r(1+r)^n) / ((1+r)^n-1))
         */
        double P = getInitialAmount();
        double r = getApr()/ (100 * 12);
        double n = getTimeInYears() * 12;
        return P / ((Math.pow((1 + r), n)-1) / (r * (Math.pow((1 + r), n))));
    }

    /** Return final loan amount*/
    public double FinalTotal() {
        // Using previously inputted variables calculate and return final amount
        int tim = getTimeInYears() * 12;
        return Payment() * tim;
    }
    DecimalFormat df = new DecimalFormat("###,##0.00");

    @Override
    public String toString() {
        // Initial return language
        return "\nCreated on " + getDateCreated() + "\nBeginning Loan Amount: $" + df.format(getInitialAmount()) +
                "\nMonthly Payment: $" + df.format(Payment()) + "\nTotal Paid with interest at life of loan: $"
                + df.format(FinalTotal());
    }
}
