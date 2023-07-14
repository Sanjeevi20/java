QUESTION:
Rita, a class mentor brought a new book to the class. She decided to gift this book to the student who finds the number of pages in the book. Help the students to complete this task. Assume that every page in a book is numbered sequentially and that the first page is numbered 1.
A 10-page book puzzle can be solved as, Pages 1 to 9 would require 1 digit each (total 9), and page 10 would require 2 digits. This makes 11 digits. Similarly, a book of 34 pages would require 59 digits.
Each line in the input represents the number of digits used in numbering a book. Output is the number of pages the book has. If the number supplied cannot possibly be valid, display "Impossible!" 
 
INPUT & OUTPUT FORMAT:
Input contains a single integer, between 1 and 2,000,000,000, representing a number of digits used in numbering the pages of a book.
If the input value is valid, output the number of pages in the book. Otherwise, output "Impossible!"
Refer to the sample input and output for formatting specifications.
SAMPLE INPUT & OUTPUT 1:
11 
10  
SAMPLE INPUT & OUTPUT 2:
13 
11  
SAMPLE INPUT & OUTPUT 3:
60 
Impossible! 



Code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int d = sc.nextInt();
        int p =0;
        for (int i=1;i<=9;i++) {
            p +=i*9*Math.pow(10,i- 1);
            if (p >= d) {
                p -= i*9*Math.pow(10,i - 1);
                d -= p;
                int num = (int)Math.pow(10,i - 1) +(d- 1)/i;
                if (num < Math.pow(10, i)) {
                    System.out.println(num);
                } else {
                    System.out.println("Impossible!");
                }
                return;
            }
        }

        System.out.println("Impossible!");
    }
}

  
  
