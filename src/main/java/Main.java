// *3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches.
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter weight in pounds and assigns it to the variable weight
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();

    // Prompts the user to enter feet and assigns it to the variable feet
    System.out.print("Enter feet: ");
    double feet = input.nextDouble();

    // Prompts the user to enter inches and assigns it to the variable inches
    System.out.print("Enter inches: ");
    double inches = input.nextDouble();

    // Calculates the BMI and prints it
    double height = feet * 12 + inches;
    double bmi = weight / (height * height) * 703;
    System.out.println("BMI is " + bmi);

    // Assigns the calculated BMI to a category and prints it
    String bmiCategory = (bmi < 18.5) ? "Underweight" : (18.5 <= bmi && bmi < 25) ? "Normal" : (25 <= bmi && bmi < 30) ? "Overweight" : "Obese"; 

    //Print relevant BMI category
    System.out.println(bmiCategory);
  }
}