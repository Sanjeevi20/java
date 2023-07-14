QUESTION:
Write a program to generate the first n terms in the series 

0.5,1.5,4.5,13.5,...

 

INPUT FORMAT:

Input consists of a single integer which corresponds to n.

OUTPUT FORMAT:

Output consists of the terms in the series separated by a blank space.

SAMPLE INPUT:

5
SAMPLE OUTPUT:

0.5 1.5 4.5 13.5 40.5


Code:


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		float a = 0.5f;
		while (i <= n){
		    if (i < n){
		        System.out.print(a + " ");
		        a *= 3;
		        i++;
		    }
		    else if (i == n){
		        System.out.print(a);
		        i++;
		    }
		}
	}
}
