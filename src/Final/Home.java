package Final;

public class Home extends LoanObject {
    private double apr;

    /** Construct default Home loan object*/
    public Home() {}

    /** Return APR*/
    try {
        // read from file to get creditScore and convert to APR, return apr
    }

    /** Construct a auto loan with specified APR*/
    public Auto (double apr, int LoanAmount, int TimeInYears) {}

    /** Return final loan amount*/
    public double FinalAmount() {
        // Using previously inputted variables calculate and return final amount
    }

    /** Return monthly minimum payment*/
    public double MonthlyPayment(int InitialAmmount, apr, int TimeInYears) {
        // Using previously inputted variables calculate minimum monthly payment
        double monthlyPayment = (InitialAmmount * apr) / (1-Math.pow(1+apr, (-TimeInYears*12)));
        return monthlyPayment
    }

    /** Return string description of loan details */
    public String toString () {
        // final string of loan details
    }
}
