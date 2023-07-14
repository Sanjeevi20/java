Write a program to count the number of vowels in the given string:

Input Format:

Input consist of 1 string.
Sample Input & Output:

hello

Number of vowels: 2


Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String input =sc.nextLine();
    int count =0;
    input = input.toLowerCase();
    for (int i=0;i<input.length();i++){
        char ch = input.charAt(i);
        if(ch== 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            count++;
        }
    }
    System.out.println("Number of vowels: "+count);
    }
}
