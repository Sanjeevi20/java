Write a program to change the given string to lowercase using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

HEllO

hello

Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String ab=sc.nextLine();
        System.out.println(ab.toLowerCase());
    }
}
