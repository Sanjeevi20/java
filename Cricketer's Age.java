You are collecting the age of each cricketers in the team. At a time, you can get only one cricketer age. So, create a program, which will get that one cricketer's age and print the age to verify.

Input Format:
Input value consists of an Integer.

Output Format:
Output value consists of an Integer.

Sample Input:
29

Sample Output:
The cricketer age is 29

code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("The cricketer age is " + a);
    }
}
