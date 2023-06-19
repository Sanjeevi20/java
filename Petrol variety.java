Dr. Dexter is now in the gas bunk. He has perfectly planned his trip. He has been working keenly on the budget so that the trip goes on well. Now, he finds that there are two varieties of fuel – Ordinary and Speed. Speed fuel yields him a fairly better performance than its ordinary counterpart. He wants Xinyou to find out as to which variety of fuel he must opt to stick to the budget.
Write a C program to find out the variety of fuel.

 
INPUT FORMAT:

Input consists of 5 lines.
The first line of input is a floating point number 'm', which corresponds to the mileage Dr.Dexter's car yields.
The second line and third lines of input consists of floating point numbers 'o' and 's', which corresponds to the costs of ordinary fuel and speed fuel respectively.
The fourth line of input is an integer 'd', which corresponds to the distance between the bunk and Shinyao.
The fifth line of input is a floating point number 'b', which corresponds to the budget for the fuel.
OUTPUT FORMAT:
Output consists of a string 'Ordinary' or 'Speed'.
Refer to the sample input and output for formatting specifications. 
SAMPLE INPUT & OUTPUT 1:
25
75
100
3
500
Speed
SAMPLE INPUT & OUTPUT 2:
25
75
100
25
80
Ordinary

Code:

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		//creating an object for Scanner class
		Scanner sc = new Scanner(System.in);
		
		//initializing the variables for user input
		float mileage = sc.nextFloat();
		float ordinary = sc.nextFloat();
		float speed = sc.nextFloat();
		int distance = sc.nextInt();
		float budget = sc.nextInt();
		float litres = distance / mileage;
		float price_Speed = speed * litres;
		
		// using ternary operators for the result
		if (speed > budget){
		    System.out.print("Ordinary");
		}
		else {
		    String result = (price_Speed > budget) ? "Ordinary" : "Speed";
		    System.out.print(result);
		}
	}
}
