Write a program to generate the given pattern.
if n=4,
   *
  * *
 *   *
*     *
 *   *
  * *
   *

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n.
Refer sample input and output for formatting specifications.
Text in bold represents the input.

SAMPLE INPUT & OUTPUT 1:
6
     *
    * *
   *   *
  *     *
 *       *
*         *
 *       *
  *     *
   *   *
    * *
     *


Code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisk and inner spaces
            System.out.print("*");
            for (int k = 1; k < 2 * i - 2; k++) {
                System.out.print(" ");
            }

            // Print asterisk if not the first row
            if (i != 1) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

        // Print lower half of the pattern
        for (int i = n-1 ; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisk and inner spaces
            System.out.print("*");
            for (int k = 1; k < 2 * i-2 ; k++) {
                System.out.print(" ");
            }

            // Print asterisk if not the first row
            if (i != 1) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
}    }
