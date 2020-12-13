package Final;


//Implement LoanObject class
public class LoanObject {
    private java.util.Date dateCreated;
    private double InitialAmount = 0;
    private int TimeInYears = 0;

    /** Construct a default loan object */
    public LoanObject() { dateCreated = new java.util.Date();}

    /* Construct a loan object with specified Initial amount and time in years */
    /** Construct a Loan Object with the specified credit score, initial amount, and time in years
     */
    public LoanObject(int InitialAmount, int TimeInYears) {
        this.InitialAmount = InitialAmount;
        this.TimeInYears = TimeInYears;
    }

    /** Get values */
    public double getInitialAmount() {return InitialAmount;}
    public void setInitialAmount(double InitialAmount) {this.InitialAmount = InitialAmount;}

    public int getTimeInYears() {return TimeInYears;}
    public void setTimeInYears(int TimeInYears) {this.TimeInYears = TimeInYears;}



    /** Get Date Created*/

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        // Initial return language
        return "Created on " + dateCreated + "\nBeginning Loan Amount: " + InitialAmount;
    }

}
