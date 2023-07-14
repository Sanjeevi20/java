Write a  program to find whether the given two strings are same or not using string library functions:

Input& Output Format:

Input consist of 2 string.
If two strings are same display “Strings are same”,else display “Strings are not same”.
Sample Input & Output:

hello

hello

Strings are same



Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String k=sc.nextLine();
    String m=sc.nextLine();
    if (k.equals(m)){
        System.out.println("Strings are same");
    }
   else{ 
       System.out.println("Strings are not same");
    }
    }
}
