Now, Xinyou is quite well versed with driving skills. He now has to learn the traffic signals. Write a C program that instructs Xinyou in this regard.
 
INPUT & OUTPUT FORMAT:
Input consists of a string 's' corresponding to the color of the traffic light red, yellow or green.
Assume that the input consists of lowercase characters only.
Output consists of a single line, a string 'Go', 'Stop','Get Ready' or 'Invalid Input'.
Refer to the sample input and output for formatting specifications. 
SAMPLE INPUT & OUTPUT 1:
red
Stop
SAMPLE INPUT & OUTPUT 2:
blue
Invalid Input
SAMPLE INPUT & OUTPUT 3:
Blue
Invalid Input

code:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//creating an object for Scanner class
		Scanner sc = new Scanner(System.in);
		
		//initializing variables and getting user input
		String input = sc.next();
		
		//using if else if statements to print the result based on the input of the user
		if (input.equals("red") || input.equals("Red")){
		    System.out.print("Stop");
		}
		else if (input.equals("yellow") || input.equals("Yellow")){
		    System.out.print("Get Ready");
		}
		else if (input.equals("green") || input.equals("Green")){
		    System.out.print("Go");
		}
		else{
		    System.out.print("Invalid Input");
		}
	}
}
