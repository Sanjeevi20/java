QUESTION:
Write a program to generate the given pattern.

if n = 4,
   *
  **
 ***
****

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n.
Refer to the sample input and output for formatting specifications.
SAMPLE INPUT:

4
SAMPLE OUTPUT:
   *
  **
 ***
****


Code:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		String s = " ";
		String f = "*";
		for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }
	}
}
