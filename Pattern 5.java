Write a program to generate the given pattern.
if n=4,

4 
3 3 
2 2 2 
1 1 1 1 

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n.
Refer to the sample input and output for formatting specifications.
Text in bold represents the input.

SAMPLE INPUT & OUTPUT 1:

5
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 



Code:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = n; j >= i ; j--) {
                System.out.print(i+" ");
            }
              System.out.println(""); // Move to the next line
        }
	}
}
