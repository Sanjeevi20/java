Write a java program to get 2 numbers from the user and swap their values without any loss of data. You can make use of additional 3rdvariable for swapping.

Print the corresponding swapped values of the two numbers as output in the console.

Input format:
First input: an integer

Second input: an integer

Output format:

The output will be integers(swapped values)

Sample Input:

20

10

Sample Output:

10

20


Code:

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();;
        int y=sc.nextInt();
        int temp=x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
        
    }
}


