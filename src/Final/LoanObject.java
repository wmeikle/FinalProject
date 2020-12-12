package Final;


//Implement LoanObject class
public class LoanObject {
    private java.util.Date dateCreated;
    private int InitialAmount = 0;
    private int TimeInYears = 0;

    /** Construct a default loan object */
    public LoanObject() { dateCreated = new java.util.Date();}

    /* Construct a loan object with specified Initial amount and time in years */
    /** Construct a Loan Object with the specified credit score, initial ammount, and time in years
     */
    public LoanObject(int InitialAmount, int TimeInYears) {
        this.InitialAmount = InitialAmount;
        this.TimeInYears = TimeInYears;
    }

    /** Get values */
    public int getInitialAmount() {return InitialAmount;}
    public void setInitialAmount(int InitialAmount) {this.InitialAmount = InitialAmount;}

    public int getTimeInYears() {return TimeInYears;}
    public void setTimeInYears(int TimeInYears) {this.TimeInYears = TimeInYears;}



    /** Get Date Created*/

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Opens a file named data.txt and writes the creditScore to file */
    //try {
        // code will open a new txt file and write the creditScore to it
    //}

    /** Return a string representation of this object */
    public String toString() {
        // Initial return language
        return "Created on " + dateCreated + "\nBegining Loan Ammount: " + InitialAmount;
    }

}
