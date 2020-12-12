package Final;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Auto extends LoanObject {
    private double apr;
    private static File file = new File("data.txt");

    /** Construct default Auto loan object*/
    public Auto() {

    }

    /** Return APR*/

        // read from file to get creditScore and convert to APR, return apr
    public double getApr () {
        try {
            Scanner scanner = new Scanner(new File("data.txt"));
            int[] tall = new int[1];
            int i = 0;
            while (scanner.hasNextInt()) {
                tall[i++] = scanner.nextInt();
            }
            int sum = 0;
            for (int num : tall) {
                sum = sum + num;
                return sum;
            }


            switch ((630 <= sum && sum <= 689) ? 0 : (690 <= sum && sum <= 719) ? 1 : 2) {
                case 0:
                    return apr = .00289;

                case 1:
                    return apr = .00260;

                case 2:
                    return apr = .00250;

            }
            return apr;
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return apr;
    }

    /** Construct a auto loan with specified APR*/
    public Auto(double apr, int InitialAmount, int TimeInYears) {
        this.apr = apr;
        setInitialAmount(InitialAmount);
        setTimeInYears(TimeInYears);
    }

    public Auto(int initialAmount, int timeInYears) {
    }

    /** Return monthly minimum payment*/
    public double MonthlyPayment(int InitialAmount, double apr, int TimeInYears) {
        // Using previously inputted variables calculate minimum monthly payment
        double monthlyPayment = (InitialAmount * apr) / (1-Math.pow(1+apr, (-TimeInYears*12)));
        return monthlyPayment;
    }

    /** Return final loan amount*/
    public double FinalAmount(double monthlyPayment, double apr, int TimeInYears) {
        // Using previously inputted variables calculate and return final amount
        double finalAmount = ((monthlyPayment / ((apr*100)/12) * (1-(1/Math.pow(1 +(apr*100)/12, (TimeInYears*12))))));
        return finalAmount;
    }
    @Override
    public String toString() {
        // Initial return language
        return "Created on " + getDateCreated() + "\nBegining Loan Ammount: " + getInitialAmount() +
                "\nMonthly Payment: " + getPayment() + "\nTotal Paid with interest at life of loan: "
                + getFinalTotal();
    }
}
