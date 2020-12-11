package Final;

import java.io.File;
import java.util.Scanner;

public class Home extends LoanObject {
    private double apr;
    private static File file = new File("data.txt");

    /** Construct default Home loan object*/
    public Home() {}

    /** Return APR*/
    try {
        // read from file to get creditScore and convert to APR, return apr
        Scanner input = new Scanner(file);
        switch ((300 <== CreditScore && CreditScore <= 629) ? 0: (630 <== CreditScore && CreditScore <= 689) ? 1:
                (690 <== CreditScore && CreditScore <= 719) ? 2:(720 <== CreditScore && CreditScore <= 850) ? 3: 4)
        case 0:
            return apr = .00300;
            break;
        case 1:
            return apr = .00289;
        break;
        case 2:
            return apr = .00260;
        break;
        case 3:
            return apr = .00250;
        break;
        case 4:
            return apr = .00315;
        break;
        }
    }

    /** Construct a auto loan with specified APR*/
    public Home (double apr, int LoanAmount, int TimeInYears) {}

    /** Return final loan amount*/
    public double FinalAmount() {
        // Using previously inputted variables calculate and return final amount
    }

    /** Return monthly minimum payment*/
    public double MonthlyPayment(int InitialAmmount, apr, int TimeInYears) {
        // Using previously inputted variables calculate minimum monthly payment
        double monthlyPayment = (InitialAmmount * apr) / (1-Math.pow(1+apr, (-TimeInYears*12)));
        return monthlyPayment;
    }

    /** Return string description of loan details */
    public String toString () {
        // final string of loan details
    }
}
