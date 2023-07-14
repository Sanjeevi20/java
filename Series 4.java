QUESTION:
Write a program to generate the first n terms in the series.

1,2.0,3.0,6.0,9.0,18.0,27.0,...

 

INPUT FORMAT:

Input consists of a single integer which corresponds to n.

OUTPUT FORMAT:

Output consists of the terms in the series separated by a blank space. 

SAMPLE INPUT:

8
SAMPLE OUTPUT:

1 2.0 3.0 6.0 9.0 18.0 27.0 54.0



Code:

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		//creating an object for Scanner class
		Scanner sc = new Scanner(System.in);
		
		//initializing the variables for user input
		int first = 1;
		int n = sc.nextInt();
		int gap = 1;
		double result = first;
		System.out.print(first);
		for (int i = 1 ; i < n ; i++){ // 1 2 3 4 5 ... n
		    
		    if (i % 2 == 0){
		        result+=gap;
		        System.out.print(" "+result);
		        gap *= 3;
		    }
		    else{
		        result+=gap;
		        System.out.print(" "+result);
		        
		    }
		}
	}
}

