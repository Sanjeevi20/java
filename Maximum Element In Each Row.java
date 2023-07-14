There are some students in the class. The class Advisor needs a recruitments process for above 60% students. In each and every row there was a student above 60% . Help your advisor to find the students in each row.

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

5

9

3


Code:


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int arr[][] =new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j] =sc.nextInt();
            }
        }
         for(int i=0;i<x;i++)
         {
        int max = arr[i][0];
        for(int j=0;j<y;j++)
        {
            if(arr[i][j]>max){
                max= arr[i][j];
            }
        }System.out.println(max);
    }
}
}
