import java.util.Scanner;

/**
 * a program to say fizz when a number is divisible by 3, buzz if divisible by 5, and fizzbuzz if divisible by both
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creathe a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for an integer
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    int number = input.nextInt();

    // create a variable to keep track of what number we're on
    int count = 1;

    // create a do while loop
    do{
      (count <= number);
      // add 1 to our count to increase it 
      count = count + 1;
    }while (number%3 && number%5);
    System.out.println("FizzBuzz");
    
  }
}
