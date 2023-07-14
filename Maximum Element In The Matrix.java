A group of children playing in the garden. The old man needs help but he needs elder boy from the children . Help the old man to find the elder boy from that children.

Write a program to find the maximum element in the matrix.

Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.

Output Format:

Refer sample output for details.

Sample Input 1: 

3

2

4 5

6 9

0 3

 Sample Output 1:

 The maximum element is 9



  Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     int x =sc.nextInt();
     int y =sc.nextInt();
     int arr[][]= new int[x][y];
     for (int i=0;i<x;i++){
         for (int j=0;j<y;j++){
             arr[i][j] =sc.nextInt();
         }
     }
     int max =0;
     for(int i=0;i<x;i++){
         for(int j=0;j<y;j++){
             if(arr[i][j]>max){
                 max= arr[i][j];
             }
         }
     }
     System.out.println("The maximum element is "+max);
    }
}
