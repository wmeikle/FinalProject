package Final;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    // Tell user what program does
        System.out.print("""
                This program gets a loan type from the user, along with their
                estimated credit score, the loan amount they are requesting in 
                whole dollars, and the length of the loan in years as integer values.
                It then calculates and prints the apr, monthly minimum payments, and 
                the total loan amount with interest included.
                """);
        // Ask what type of loan they are inquiring about
        System.out.println("""
                Enter the loan type you would like an estimate for (e.g. "auto" or "home"):
                """);
        String loanType = input.next();



        // Get information of Loan input into list

        // Print toString and Goodbye message.

    }

    private static int getInteger(String prompt, Scanner input){
        System.out.print(prompt);
        int validInt = -1;
        while (input.hasNext()){
            if (input.hasNextInt()){
                validInt = input.nextInt();
                break;
            }else {
                System.out.println("Error: Input must be an integer.");
                System.out.print(prompt);
                input.next();
            }
        }
        return validInt;
    }

    private static String getString(String prompt, Scanner input){
        System.out.print(prompt);
        String validString = "";
        while (input.hasNext()){
            validString = input.next();
            if(validString.equals("home")){
                break;
            }else if(validString.equals("auto")){
                break;
            } else{
                System.out.println("Error: Input must be 'auto' or 'home'");
                System.out.print(prompt);
                input.next();
            }
        }
        return validString;
    }
}
