Dr. Dexter is now in the gas bunk. He has filled fuel with your help and now is about to take an air check. He wants Xinyou to fill air. Dr. Dexter owns a Honda Civic and Xinyou gets to know that the air pressure to be filled in the front tyres is 33 PSI and rear tyres is 32 PSI. 
Write a C program to check if the tyres already have enough air and print whether the tyres have to be deflated, inflated or left untouched. 
  
INPUT FORMAT:
Input consists of 4 lines of floating point numbers, each corresponding to the air pressure in each of the tyres. 
The first line corresponds to the front-left tyre. 
The second line corresponds to the rear-left tyre. 
The third line corresponds to the rear-right tyre. 
The fourth line corresponds to the front-right tyre. 
OUTPUT FORMAT:
Output consists of 4 lines.  
Refer to the sample input and output for formatting specifications.  
SAMPLE INPUT & OUTPUT: 
33 
35 
40 
31 
Front-left : Untouched 
Rear-left : Deflate 
Rear-right : Deflate 
Front-right : Inflate 

Code:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//creating an object for the Scanner function
		Scanner sc  = new Scanner(System.in);
		
		//initializing the variables for the user input
		float fl_Tyre = sc.nextFloat();
		float rl_Tyre = sc.nextFloat();
		float rr_Tyre = sc.nextFloat();
		float fr_Tyre = sc.nextFloat();
		
		//if else condition for Front Left tyre
		if (fl_Tyre == 33){
		    System.out.println("Front-left : Untouched");
		}
		else{
		    String Front_Left = (fl_Tyre > 33 ? "Front-left : Deflate":"Front-left : Inflate");
		    System.out.println(Front_Left);
		}
		
		//if else statement for rear left tyre
		if (rl_Tyre == 32){
		    System.out.println("Rear-left : Untouched");
		}
		else{
		    String Rear_Left = (rl_Tyre > 32 ? "Rear-left : Deflate": "Rear-left : Inflate");
		    System.out.println(Rear_Left);
		}
		
		//if else statement for rear right tyre
		if (rr_Tyre == 32){
		    System.out.println("Rear-right : Untouched");
		}
		else{
		    String Rear_Right = (rr_Tyre > 32 ? "Rear-right : Deflate" : "Rear-right : Inflate");
		    System.out.println(Rear_Right);
		}
		
		//if else statement for front right tyre
		if (fr_Tyre == 33){
		    System.out.print("Front-right : Untouched");
		}
		else{
		    String Front_Right = (fr_Tyre > 33 ? "Front-right : Deflate" : "Front-right : Inflate");
		    System.out.print(Front_Right);
		}
	}
}
