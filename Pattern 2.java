Write a program to generate the given pattern.
if n = 4,
****
*  *
*  *
****

 INPUT & OUTPUT FORMAT:

Input consists of a single integer, n. n is always an even integer. n>=6.
Refer to the sample input and output for formatting specifications.
Text in bold represents the input.
SAMPLE INPUT & OUTPUT 1:
6
******
*    *
*    *
*    *
*    *
******


SAMPLE INPUT & OUTPUT 2:
4
****



Code:

import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String s = "*";

   for(int i=1;i<=n;i++){
       if ((i==1)||(i==n)){
       for (int j=1;j<=n;j++){ //for 1st rows
                 if(j==n){
                    System.out.println(s);
       }
                 else{
                    System.out.print(s);
                 }}}
       else if((i!=1)||(i!=n)){
           for (int k=1;k<=n;k++){
               if ((k==1) || (k==n)){
                   if(k==n){
                    System.out.print(s+"\n");
       }
                 else{
                    System.out.print(s);
                 }}
               else{
                   System.out.print(" ");
               }
           }
       }
           
       }
       
       
   
   
}
}
