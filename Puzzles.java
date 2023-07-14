QUESTION:
The end of the school year is near and Ms. Manana, the teacher, will soon have to say goodbye to a yet another class. She decided to prepare a goodbye present for her n students and give each of them a jigsaw puzzle.

The shop assistant told the teacher that there are m puzzles in the shop, but they might differ in difficulty and size. Specifically, the first jigsaw puzzle consists of f1 pieces, the second one consists of f2 pieces and so on.

Ms. Manana doesn't want to upset the children, so she decided that the difference between the numbers of pieces in her presents must be as small as possible. Let A be the number of pieces in the largest puzzle that the teacher buys and B be the number of pieces in the smallest such puzzle. She wants to choose such n puzzles that A - B is the minimum possible. Help the teacher and find the least possible value of A - B.



INPUT & OUTPUT FORMAT:

The first input consists of an integer n ( 2 ≤ n ≤ 50), which corresponds to the number of students.
The second input consists of an integer m ( 2 ≤ n ≤ m ≤ 50), which corresponds to the number of puzzles sold in the shop.
The next 'm' lines correspond to the quantities of pieces in the puzzles sold in the shop.
The output displays a single integer — the least possible difference the teacher can obtain.
SAMPLE INPUT & OUTPUT 1:

Enter the number of students
 4
Enter the number of puzzles sold in the shop
 6
Enter the quantities of pieces in the puzzles
10
12
10
7
5
22
The least possible difference = 5




Code:

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        //Display no of students
        System.out.println("Enter the number of students");
        //get the size of array
        int n= sc.nextInt();
        System.out.println("Enter the number of puzzles sold in the shop");
        int m = sc.nextInt();
        //declare array
        int [] arr = new int[m];
        System.out.println("Enter the quantities of pieces in the puzzles");
        int i,j;
        for(i =0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        for(i = 0;i<=m -n;i++){
            int diff = arr[i + n - 1] - arr[i];
            if(diff < min){
                min = diff;
            }
        }
        //display the poosible differeces
        System.out.println("The least possible difference = "+min);
    }
}
