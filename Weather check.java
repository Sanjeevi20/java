Xinyou has an in-built GPS system that gives its current position coordinates as input. Using these coordinates Xinyou gets the current weather information. Initially, Dr. Dexter wants Xinyou to drive only when it is sunny. The different weather conditions are 'sunny', 'rainy', and 'foggy'.

Given the weather condition, write a program to check whether Xinyou can drive or not.
 
INPUT FORMAT:

Input consists of a string, corresponding to the weather condition.

OUTPUT FORMAT:

Output is a string "Yes I can drive smile" or "Sorry invalid input :|" or "No I cant drive sad".
Refer to the sample input and output for formatting specifications. 
SAMPLE INPUT & OUTPUT 1:
sunny
Yes I can drive :)
SAMPLE INPUT & OUTPUT 2:
misty
Sorry invalid input :|
SAMPLE INPUT & OUTPUT3:
rainy
No I cant drive :(

Code:
  
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//creating an object for the Scanner function
		Scanner sc = new Scanner(System.in);
		
		//initializing the variables for the user input
		String input;
		
		//getting user input of the weather
		input = sc.nextLine();
		
		//
		if (input.equals("sunny")){
		    System.out.print("Yes I can drive :)");
		}
		else if (input.equals("rainy")){
		    System.out.print("No I cant drive :(");
		}
		else if (input.equals("foggy")){
		    System.out.print("No I cant drive :(");
		}
		else {
		    System.out.print("Sorry invalid input :|");
		}
	}
}
