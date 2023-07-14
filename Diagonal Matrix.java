Diagonal Matrix. A square matrix which has zeros everywhere other than the main diagonal. Entries on the main diagonal may be any number, including 0.

Write a program to find whether a given matrix is a diagonal matrix or not.

 Input Format:

The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5.

Output Format:

Print yes if it is a diagonal matrix. Print no if it is not a diagonal matrix.

 

Sample Input :

2

4 5

5 4

Sample Output:

no




Code:


import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int i,j,x=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }}
            for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(arr[i][j]==0)
                    {
                        x++;
                    }
                }
            }
        }
        if(x==n*n-n)
        {   
            //display no
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
