The conditional operator is also known as ternary operator [exp ? true : false] can be used to make an either-or choice. 

Write a program to get a number from the user and find out whether it is odd or even.

Input format:

The input containing integer denotes the given number 

Output format:

If given number is even, print "Even". Otherwise, print "Odd".

Sample Input:
5

Sample Output:

Odd

Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     String b = (a%2==0)?"Even":"Odd";
     System.out.println(b);
    }
}
