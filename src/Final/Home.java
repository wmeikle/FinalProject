package Final;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Home extends LoanObject {
    private double apr;

    /** Construct default Home loan object*/
    public Home() {}

    public Home(int initialAmount, int timeInYears) {
    }

    /** Return APR*/
    public double getApr () {
        // read from file to get creditScore and convert to APR, return apr
        /**List<Integer> ints1 = Files.lines(Paths.get("data.txt"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int ints = Integer.parseInt(ints1);*/
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


        switch ((630 <= sum && sum <= 689) ? 0 : (690 <= sum && sum <= 719) ? 1 : 2) {
            case 0:
                return apr = .00289;

            case 1:
                return apr = .00260;

            case 2:
                return apr = .00250;


        }
        return apr;
    }catch (IOException e) {
    e.printStackTrace();
    System.exit(1);
}return apr;

    }
    /** Construct a auto loan with specified APR*/
    public Home (double apr, int InitialAmount, int TimeInYears) {
        this.apr = apr;
        setInitialAmount(InitialAmount);
        setTimeInYears(TimeInYears);
    }

    /** Return monthly minimum payment*/
    public double Payment() {
        // Using previously inputted variables calculate minimum monthly payment
        double Payment = (getInitialAmount() * apr) / (1-Math.pow(1+apr, (-getTimeInYears()*12)));
        return Payment;
    }

    /** Return final loan amount*/
    public double FinalTotal() {
        // Using previously inputted variables calculate and return final amount
        double FinalTotal = ((getPayment() / ((apr*100)/12) * (1-(1/Math.pow(1 +(apr*100)/12, (getTimeInYears()*12))))));
        return FinalTotal;
    }


    @Override
    public String toString() {
        // Initial return language
        return "Created on " + getDateCreated() + "\nBegining Loan Ammount: " + getInitialAmount() +
                "\nMonthly Payment: " + Payment() + "\nTotal Paid with interest at life of loan: "
                + FinalTotal();
    }
}
