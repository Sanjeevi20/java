2 arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all i. Write a  program to find whether 2 arrays are compatible or not.

Input Format:

Input consists of 2n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the first array. The last 'n' integers correspond to the elements in the second array. Assume that the maximum value of n is 15.

Output Format:

Refer sample output for details.

Sample Input :

5

2

3

6

8

1

1

1

1

1

1

Sample Output :

Compatible

Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     int arr1[]=new int[n];
     for (int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     for (int i=0;i<n;i++){
         arr1[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++){
     if(arr[i]>=arr1[i]){
         System.out.println("Compatible");
     }
     else{
         System.out.println("Incompatible");
     }
     
     
    }
}
    
}
