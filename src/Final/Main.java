package Final;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("data.txt");
	    // Tell user what program does
        System.out.print("""
                This program gets a loan type from the user, along with their
                estimated credit score, the loan amount they are requesting in 
                whole dollars, and the length of the loan in years as integer values.
                It then calculates and prints the apr, monthly minimum payments, and 
                the total loan amount with interest included.
                """);

        List<LoanObject> list = new ArrayList<>();
        String loanType = "";

        // Ask what type of loan they are inquiring about
        for (int i = 0; i < 1; i++) {
                loanType = getString(input);
            }
        // Get information of Loan input into list
        if (loanType.equals("home")){
            try{
                for (int i = 0; i < 1; i++) {
                    int score = getInteger("Enter your estimated credit score: \n", input);
                    if (score < 630 || score > 850){
                        System.out.print("Your gonna need either a higher or real score if you want a valid estimate. Start over and try again.");
                        System.exit(2);
                    }
                    PrintWriter printWriter = new PrintWriter(file);
                    printWriter.write(String.format("%d%n", score));
                    printWriter.close();
                }
                for(int i = 0; i<1; i++){
                    double InitialAmount = getInteger("Enter the amount of the loan in whole dollars: \n", input);
                    int TimeInYears = getInteger("Enter the length of the loan in whole years: \n", input);

                    Home loan = new Home(InitialAmount, TimeInYears);
                    list.add(loan);
                }
                list.forEach(System.out::println);
            }catch(IOException e){
                e.printStackTrace();
                System.exit(1);
            }
        }else try{
            for (int i = 0; i < 1; i++) {
                int score = getInteger("Enter your estimated credit score: \n", input);
                if (score < 630 || score > 850){
                    System.out.print("Your gonna need either a higher or real score if you want a valid estimate. Start over and try again.");
                    System.exit(2);
                }
                PrintWriter printWriter = new PrintWriter(file);
                printWriter.write(String.format("%d%n", score));
                printWriter.close();
            }
            for(int i = 0; i<1; i++){
                double InitialAmount = getInteger("Enter the amount of the loan in whole dollars: \n", input);
                int TimeInYears = getInteger("Enter the length of the loan in whole years: \n", input);

                Auto loan = new Auto(InitialAmount, TimeInYears);
                list.add(loan);
            }
            list.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
            System.exit(1);
        }

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

    private static String getString(Scanner input){
        System.out.print("Enter the loan type you would like an estimate for (auto or home): \n");
        String validString = "";
        while (input.hasNext()){
            validString = input.next();
            if(validString.equals("home")){
                break;
            }else if(validString.equals("auto")){
                break;
            } else{
                System.out.println("Error: Input must be 'auto' or 'home'");
                System.out.print("Enter the loan type you would like an estimate for (auto or home): \n");
                input.next();
            }
        }
        return validString;
    }


}
