QUESTION:
You are given an integer array. At any moment, you may choose a nonempty contiguous subsequence of 1 or 2 elements in the array. Whenever you do so, you will gain power equal to the product of all elements in the chosen subsequence.

You chose each possible contiguous subsequence exactly once, each time gaining some power. Write a program to compute the total amount of power you gained.

Assume: n<=100



INPUT & OUTPUT FORMAT:
Input consists of n+1 integers. 
The first line of the input corresponds to n, the number of elements in the array. 
The second line of the input consists of the n integers in the array separated by a space.
Output consists of a single integer that corresponds to the total amount of power gained.
SAMPLE INPUT & OUTPUT:

3
1
2
2
11
Explanation for sample input and output:
The possible subsequences are { {1}, {2}, {2}, {1,2}, {2,2}}
The answer is computed as follows : 1+2+2+2+4 = 11



Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     Scanner sc =new Scanner(System.in);
     int n =sc.nextInt();
     int arr[] =new int[n];
     for (int i=0;i<n;i++){
         arr[i] =sc.nextInt();
     }
     int num=0;
     for (int i=0;i<n;i++){
         num = num+arr[i];
         
     }
     for(int i=0;i<n-1;i++){
         num=num+arr[i]*arr[i+1];
     }
     System.out.println(num);
    }
}
