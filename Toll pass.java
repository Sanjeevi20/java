Dr. Dexter regularly visits his only friend Dr. Lee. Dr. Lee lives in a city named Nakuto. In order to get to Nakuto, Dr. Dexter has to take National Highways (NH  999). NH 999 has a toll booth where the toll passes are categorized as One-way pass, Two-way pass, and Monthly pass.
If Dr. Dexter travels to Nakuto and doesn't return the same day, a one-way pass would do better. If he travels to Nakuto and returns to his hometown the same day, a two-way pass is economical. One-way passes cost $O, two-way passes cost $T and monthly-passes cost $M. In a month, Dr. Dexter plans to travel 'x' times to Nakuto and stays there, travel 'y' times to Nakuto and returns home the same day. He wants Xinyou to know whether a combination of one-way and two-way passes would be economical or a monthly pass would be economical. 

Write a Java program module that finds out whether he ought to take a monthly-pass or a combination of one-way and two-way passes.
 
INPUT FORMAT:

Input consists of 5 lines.
The first line of input is an integer 'x', which corresponds to the sum of the number of times Dr. Dexter travels only to Nakuto and doesn't return back in a day and the number of times he travels to his home town from Nakuto without a two-way pass.
The second line of input is an integer 'y', which corresponds to the number of times Dr. Dexter travels to Nakuto and returns back to his hometown the same day.
The third line of input is a floating point number 'o', which corresponds to the cost of a one-way pass.
The fourth line of input is a floating point number 't', which corresponds to the cost of a two-way pass.
The fifth line of input is a floating point number 'm', which corresponds to the cost of a monthly pass.
OUTPUT FORMAT:
Output consists of a string, "Monthly Pass" or "Invalid Input" or "One way pass + Two way pass".
Refer to the sample input and output for formatting specifications. 
Note: When the combination of one-way and two-way pass equals monthly pass, Dr.Dexter prefers monthly pass.

Consider, o < t < m

SAMPLE INPUT & OUTPUT 1:
10
15
10
12
250
Monthly Pass
SAMPLE INPUT & OUTPUT 2:
20
20
100
110
5000
One way pass  +  Two way pass
SAMPLE INPUT & OUTPUT 3:
10
15
15
12
250
Invalid Input

Code:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//creating an object for the Scanner class
		Scanner sc = new Scanner(System.in);
		
		//getting the user input
		int one_Way = sc.nextInt();
		int two_Way = sc.nextInt();
		float oneway_Pass = sc.nextFloat();
		float twoway_Pass = sc.nextFloat();
		float monthly_Pass = sc.nextFloat();
		
		//calulation of one way and two ways trips
		float total = (one_Way*oneway_Pass) + (two_Way*twoway_Pass);
		
		//using if cases compare 
	    if (oneway_Pass > twoway_Pass){
		    System.out.print("Invalid Input");}
	    else{
	        if (total >= monthly_Pass)
		        System.out.print("Monthly Pass");
	    
	        else
	            System.out.print("One way pass + Two way pass");
	    }
    }
}
