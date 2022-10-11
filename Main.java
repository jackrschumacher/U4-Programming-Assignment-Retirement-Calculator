import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("=====Retirement Savings Calculator=====");
    System.out.println("Please enter your savings per paycheck.");
    double savingsPerPaycheck = input.nextDouble();
    System.out.println("Your savings per paycheck is : "+savingsPerPaycheck);
    
    
    
  }
}