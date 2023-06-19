Dr. Dexter has now started his trip to Shinyao. Unfortunately, he has forgotten about the fuel. There are two gas bunks on the way to Shinyao, 'A' and 'B'. As soon as his car reaches the bunk A, it runs out of fuel. Bunks A and B are 'd' miles apart. Xinyou, the robot finds out from statistics that one of the bunks provides the best quality fuel. They decide on filling the best quality fuel.
Write a C program module that finds the quantity of fuel that has to be filled at bunks A and B.
 
INPUT FORMAT:
Input consists of 4 lines.
The first line of input is an integer d (0 <  d < 32767), which corresponds to the distance between bunks A and B
The second line of input is an integer s (0 <  s < 32767), whcih corresponds to the distance between bunk A and Shinyao.
The third line of input is a floating point number 'm' corresponding to the mileage Dr.Dexter's car yields.
The fourth line of input is the character 'b' corresponding to the bunk that provides the best quality fuel. Assume that b takes values either 'A' or 'B'
Assume that bunk A lies before bunk B.
OUTPUT FORMAT:
Output consists of the quantities of fuel to be filled at bunks A and B, correct up to 2 decimal places.
Refer to the sample input and output for formatting specifications. 
SAMPLE INPUT & OUTPUT:
100
200
25
B
4.00
4.00

Code:

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		//creating an object for Scanner class
		Scanner sc = new Scanner(System.in);
		
		//initializing variables for user input
		int dist_AtoB = sc.nextInt();
		int dist_AtoS = sc.nextInt();
		float mileage = sc.nextFloat();
		String better_bunker = sc.next();
		double litres_AtoB = dist_AtoB / mileage;
		double litres_AtoS = dist_AtoS / mileage;
		double litres_BtoS = (dist_AtoS - dist_AtoB)/mileage;
		
		if (better_bunker.equals("B")){
		    System.out.printf("%.2f\n",litres_AtoB);
		    System.out.printf("%.2f",litres_BtoS);
		}
		else if (better_bunker.equals("A")){
		    System.out.printf("%.2f\n",litres_AtoS);
		    System.out.printf("%.2f",0/mileage);
		}
	}
}
