import java.util.Scanner;

// Import Scanner
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Set up scanner
    System.out.println("=====Retirement Savings Calculator=====");
    // Ask user to enter their savings amount from thier paycheck.
    System.out.println("Please enter your savings per paycheck.");
    double savingsPerPaycheck = input.nextDouble();
    // Ask user to enter the number of paychecks that they receive per year
    System.out.println("========================================");
    System.out.println("How many paychecks do you recive per year?");
    double paychecksPerYear = input.nextInt();
    // Ask user to input return on investment
    System.out.println("========================================");
    System.out.println("What is your expected return on investment (a percentage as a decimal)");
    double returnOnInvestment = input.nextDouble();
    // Ask how many years the user would like the program to calculate for
    System.out.println("========================================");
    System.out.println("How many years would you like to run the calculation for?");
    int yearsToRun = input.nextInt();
    // Ask the user how big thier current account is
    System.out.println("========================================");
    System.out.println("What is the current size of your account?");
    double accountSize = input.nextDouble();


    // Program will run through the number of years that the user inputed, and then will run through the number of paychecks that the user inputs
    for (int i = 0; i < yearsToRun; i++){
      for(int x = 0; x < paychecksPerYear; x++){
        // Exponentially increase the amount of the users investments. Add 1 to the users return on ivestment and add that to the fration ofration of 1/the users paycheck per year. Add this to the total.
        accountSize *= Math.pow(1+ returnOnInvestment, 1 / paychecksPerYear);

        accountSize += savingsPerPaycheck;
      }
    }
    // Print out the users savings over the number of years they entered
    System.out.println("========================================");
    System.out.println("Your total savings over "+yearsToRun+" is "+accountSize+" Dollars");
    
    
    
    
    
    
    
  }
}