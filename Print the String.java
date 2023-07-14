Write a program to scan the string from the user and to print it.

Input Format:

Input consist of 1 string.
Sample Input & Output:

Hello

The string is Hello

  Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     String i=s.split(" ")[0];
     System.out.println("The string is "+i);
    }
}

