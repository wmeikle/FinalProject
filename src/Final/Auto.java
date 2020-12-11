package Final;


import java.io.File;
import java.util.Scanner;

public class Auto extends LoanObject {
    private double apr;
    private static File file = new File("data.txt");

    /** Construct default Auto loan object*/
    public Auto() {}

    /** Return APR*/
    try {
        // read from file to get creditScore and convert to APR, return apr

        Scanner input = new Scanner(file);


        switch ((630 <== CreditScore && CreditScore <= 689) ? 0: (690 <== CreditScore && CreditScore <= 719) ? 1: 2)
        case 0:
            return apr = .00289;
        break;
        case 1:
            return apr = .00260;
        break;
        case 2:
            return apr = .00250;
        break;
    }
}

    /** Construct a auto loan with specified APR*/
    public Auto (double apr, int LoanAmount, int TimeInYears) {}

    /** Return monthly minimum payment*/
    public double MonthlyPayment(int InitialAmmount, apr, int TimeInYears) {
        // Using previously inputted variables calculate minimum monthly payment
        double monthlyPayment = (InitialAmmount * apr) / (1-Math.pow(1+apr, (-TimeInYears*12)));
        return monthlyPayment;
    }

    /** Return final loan amount*/
    public double FinalAmount(double monthlyPayment, apr, int TimeInYears) {
        // Using previously inputted variables calculate and return final amount
        double finalAmount = ((monthlyPayment / ((apr*100)/12) * (1-(1/Math.pow(1 +(apr*100)/12), (TimeInYears*12)))));
        return finalAmount;
    }

    /** Return string description of loan details */
    public String toString () {
        // final string of loan details
    }
}
