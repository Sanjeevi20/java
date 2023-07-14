QUESTION:
Write a program to generate the first n terms in the series 

121,225,361,...

 

INPUT FORMAT:

Input consists of a single integer which corresponds to n.

OUTPUT FORMAT:

Output consists of the terms in the series separated by a blank space.

SAMPLE INPUT:

4
SAMPLE OUTPUT:

121 225 361 529



Code:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int input = sc.nextInt();
		int a = 11;
		while (i <= input){
		    if (i < input){
		        System.out.print((a*a) + " ");
		        a += 4;
		        i++;
		    }
		    else if (i == input){
		        System.out.print(a*a);
		        i++;
		    }
		}
	}
}
