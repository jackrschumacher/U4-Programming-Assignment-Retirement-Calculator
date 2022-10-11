import java.util.Scanner;

// Import Scanner
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Set up scanner
    System.out.println("=====Retirement Savings Calculator=====");
    // Ask user to enter their savings amount from thier paycheck. Prints out to the console the amount they entered.
    System.out.println("Please enter your savings per paycheck.");
    double savingsPerPaycheck = input.nextDouble();
    System.out.println("Your savings per paycheck is : "+savingsPerPaycheck);
    // Ask user to enter the number of paychecks that they receive per year
    System.out.println("========================================");
    System.out.println("How many paychecks do you recive per year?");
    int paychecksPerYear = input.nextInt();
    System.out.println("You usually receive: "+paychecksPerYear+" paychecks per year");
    System.out.println("========================================");
    System.out.println("What is your expected return on investment (a percentage)");
    double returnOnInvestment = input.nextDouble();
    System.out.println("Your expected return on investment is: "+ returnOnInvestment + "percent.");
    System.out.println("========================================");
    
    
    
    
    
    
  }
}