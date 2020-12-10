package Final;

//Implement LoanObject class
public class LoanObject {
    private java.util.Date dateCreated;
    private int CreditScore = 0;
    private int InitialAmmount = 0;
    private int TimeInYears = 0;
    private double FinalTotal = 0.00;
    private double Payment = 0.00;

    /** Construct a default loan object */
    public LoanObject() { dateCreated = new java.util.Date();}

    /* Construct a loan object with specified Initial amount and time in years */
    /** Construct a Loan Object with the specified credit score, initial ammount, and time in years
     */
    public LoanObject(CreditScore, InitialAmmount, TimeInYears) {
        //sudo code
    }

    /** Get values */
    public int getCreditScore() {}

    public int getInitialAmmount() {}

    public int getTimeInYears() {}

    public double getFinalTotal() {}

    public double getPayment() {}


    /** Get Date Created*/

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Opens a file named data.txt and writes the creditScore to file */
    try {
        // code will open a new txt file and write the creditScore to it
    }

    /** Return a string representation of this object */
    public String toString() {
        // Intitial return language
    }

}
