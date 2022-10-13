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
    System.out.println("========================================");
    System.out.println("What is your expected return on investment (a percentage)");
    double returnOnInvestment = input.nextDouble();
    System.out.println("========================================");
    System.out.println("How many years would you like to run the calculation for?");
    int yearsToRun = input.nextInt();
    System.out.println("========================================");
    System.out.println("What is the current size of your account?");
    double accountSize = input.nextDouble();


    for (int i = 0; i < yearsToRun; i++){
      for(int x = 0; x < paychecksPerYear; x++){
        accountSize *= Math.pow(1+ returnOnInvestment, 1 / paychecksPerYear);
        accountSize += savingsPerPaycheck;
      }
    }
    System.out.println(accountSize);
    
    
    
    
    
    
    
  }
}