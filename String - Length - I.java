Write a  program to find the length of the given string using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

Java

The length of Java is 4


Code:


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String o=sc.nextLine();
        System.out.println("The length of "+o+" is "+o.length());
    }
}
