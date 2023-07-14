Write a  program to find the reverse of the given without string using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

hello

The reversed String is olleh


Code:

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String d=sc.nextLine();
        System.out.print("The reversed String is ");
        for(int i=d.length()-1;i>=0;i--){
            char ch=d.charAt(i);
            System.out.print(ch);
        }
        
    }
}
