In a family the people are arranged in rows and columns. Male persons in the families arranged in a row and females are arranged in a column. Find the biggest women in the each column.Help me to find the biggest women. 

Write a  program to find the maximum element in each column of the matrix.

 Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.

Output Format:

Refer sample output for details.

 Sample Input 1:

 3

2

4 5

6 9

0 3

Sample Output 1:

6

9


Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int arr[][]=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    for(int j=0;j<x;j++){
       int max = arr[0][j];
        for(int i=0;i<y;i++){
           if (arr[i][j]>max){
            max=arr[i][j];
           }
            }System.out.println(max);
        
        }
    }
}
