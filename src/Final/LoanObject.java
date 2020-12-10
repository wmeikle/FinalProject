package Final;

//Implement LoanObject class
public class LoanObject {

    /*Construct default Loan object**/


    /* Construct a loan object with specified Initial amount and time in years */

    /* Get Date Created*/

    /* Return a string representation of this object */

    private java.util.Date dateCreated;
    private int creditScore = 0;
    private int initialAmmount = 0;
    private int timeInYears = 0;

    /** Construct a default loan object */
    public LoanObject() { dateCreated = new java.util.Date();}

    /** Construct a Loan Object with the specified credit score, initial ammount, and time in years
     */
    public LoanObject(creditScore, initialAmmount, timeInYears) {
        //sudo code
    }
    /** Get Date Created*/

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */


}
