A magic square is an arrangement of numbers (usually integers) in a square grid, where the numbers in each row, and in each column, and the numbers in the forward and backward main diagonals, all add up to the same number.

Write a program to find whether a given matrix is a magic square or not.

Input Format:

The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5. 

Output Format:
Print yes if it is a magic square. Print no if it is not a magic square. 

Sample Input 1:
2
4 5
5 4

Sample Output 1:
no

Code:

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m=0,s=0;
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                {
                    if(i==0)
                {
                    m=m+arr[i][j];
                }}
                for(j=0;j<n;j++)
                {
                if(i==j)
                {
                    s=s+arr[i][j];
                }}
        }
        if(m==s)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}

