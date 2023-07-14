Write a program to generate the given pattern.
if n = 5,

*   *
 * *
  *
 * *
*   *

 

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n. 
Refer to the sample input and output for formatting specifications.
Text in bold represents the input.

SAMPLE INPUT & OUTPUT 1:

5
*   *
 * *
  *
 * *
*   *


Code:

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1 || i==j){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                    
                }
            }
        System.out.println("");
        }
        
    }
}

