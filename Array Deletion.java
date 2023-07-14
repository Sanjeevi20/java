Two friends are playing a puzzle. They have set of sticks to arrange the puzzle. They need to delete one puzzle to make the correct puzzle. So for making correct puzzle you have to find the position where we have to move off the stick. Help them to correct the puzzle.

Input and Output Format:

Assume that the maximum number of elements in the array is 20.

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output 1:

Enter the number of elements in the array

5

Enter the elements in the array

1

2

3

4

5

Enter the location where you wish to delete an element

4

Array after deletion is

1

2

3

5



Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of elements in the array");
     int n =sc.nextInt();
     int arr[] =new int[n];
     int size = n;
     int arr2[] =new int[size];
     System.out.println("Enter the elements in the array");
     for (int i=0;i<n;i++){
         arr[i] =sc.nextInt();
     }
     System.out.println("Enter the location where you wish to delete an element");
     int loc =sc.nextInt();
     if (loc<=n){
         for (int i=0;i<n;i++){
             int j=i;
             if(j+1!=loc){
                 arr2[i] =arr[i];
             }
         }
         System.out.println("Array after deletion is");
         for(int i=0;i<size;i++){
             if(i!=loc-1){
                 System.out.println(arr[i]);
             }
         }
     }
     else{
         System.out.println("Invalid Input");
     }
    }
}
