package Final;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

    /** Return APR*/
    try {
        // read from file to get creditScore and convert to APR, return apr
        List<Integer> ints = Files.lines(Paths.get("data.txt"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        switch ((630 <= ints && ints <= 689) ? 0: (690 <= ints && ints <= 719) ? 1: 2){
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
    public Home (apr, int LoanAmount, int TimeInYears) {}

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
