Write a program to generate the given pattern. 
if n = 5,

    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n.
Refer to the sample input and output for formatting specifications.
Text in bold represents the input.

SAMPLE INPUT & OUTPUT 1:
5
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 


Code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            // Print spaces
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }

            int num = 1;
            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}


