Write a program to find whether the given string is palindrome or not without using string library functions:


Input Format:

Input consist of 1 string.
If the given string is a Palindrome display “Palindrome”, else display “Not a Palindrome”.
Sample Input & Output:
computer
Not a Palindrome

Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String d=sc.nextLine();
        String u="";
        for(int i=d.length()-1;i>=0;i--){
        u=u+d.charAt(i);
        }
        if(d.equals(u)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
}
}
