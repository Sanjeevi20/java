QUESTION:
Children are taught to add multi-digit numbers from right-to-left, one digit at a time. Many find the "carry" operation - in which 1 is carried from one digit position to be added to the next - to be a significant challenge. Your job is to count the number of carry operations for each addition problem so that educators may assess their difficulty.

Note: To find the current carry, consider the previous.

INPUT & OUTPUT FORMAT:

Input consists of two unsigned integers less than 11 digits.
Output consists of an integer that corresponds to the number of carry operations that would result from adding the two numbers.
Text in bold represents the output.

SAMPLE INPUT & OUTPUT 1:
123
456
O

SAMPLE INPUT & OUTPUT 2:
555
555
3

SAMPLE INPUT & OUTPUT 3:
423
594
2




Code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int carry = 0;
        int count = 0;
        while (a != 0 || b != 0) {
            int sum = carry + a % 10 + b % 10;
            if (sum >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }
            a /= 10;
            b /= 10;
        }
        System.out.println(count);
    }
}
