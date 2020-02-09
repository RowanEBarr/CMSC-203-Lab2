import java.util.Scanner;
/*
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		
		Scanner stdin = new Scanner(System.in); 
		//identifier declarations
		final int NUMBER = 2; // number of scores
		//int score1 = 100; first test score
		//int score2 = 95; second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		int temperature;
		int score1;
		int score2;
		
		System.out.println("Please enter the first test score: ");
		score1 = stdin.nextInt();
		System.out.println("Please enter the second test score: ");
		score2 = stdin.nextInt();
		
		// Find an arithmetic average
		average = (score1 + score2*1.0) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9)*(BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.println("Please enter another temperature: ");
		temperature = stdin.nextInt();
		fToC = (5.0/9)*(temperature - 32);
		output = temperature + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
