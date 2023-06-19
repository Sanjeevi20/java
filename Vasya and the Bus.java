One day Vasya heard a story: "In the city of High Bertown, bus number 62 left from the bus station. It had n grown-ups and m kids..."

The latter events happen to be of no importance to us. Vasya is an accountant and he loves counting money. So he wondered what maximum and minimum sum of money these passengers could have paid for the ride.

The bus fare equals one Berland ruble in High Bertown. However, not everything is that easy — no more than one child can ride for free with each grown-up passenger. That means that, a grown-up passenger who rides with his k (k > 0) children, pays overall k rubles: a ticket for himself and (k - 1) tickets for his children. Also, a grown-up can ride without children, in this case, he only pays one ruble.

We know that in High Bertown children can't ride in a bus unaccompanied by grown-ups.

Write a program to help Vasya count the minimum and the maximum sum in Berland rubles, that all passengers of this bus could have paid in total.



INPUT FORMAT:
The input contains two integers. 
The first input consists of an integer n, which corresponds to the number of grown-ups. ( 0 ≤ n) 
The second input consists of an integer m, which corresponds to the number of children. ( m ≤ 105) 
OUTPUT FORMAT: 
The output prints the minimum and the maximum possible total bus fare. 
Otherwise, print " Impossible " (without the quotes). 
Refer to the sample input and output for formatting specifications. 
[All text in bold corresponds to output and the rest corresponds to input.]
SAMPLE INPUT & OUTPUT 1:

Enter the number of grown-ups
1
Enter the number of children
2
Minimum possible bus fare : 2
Maximum possible bus fare : 2
SAMPLE INPUT & OUTPUT 2:
Enter the number of grown-ups
0
Enter the number of children
2
Impossible


Code:

import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number of grown-ups");
   int grup =sc.nextInt();
   System.out.println("Enter the number of children");
   int chi = sc.nextInt();
   
   if(grup ==0){
       System.out.println("Impossible");
   }
   else if(grup < chi){
       int max = grup+(chi-1);
       System.out.println("Minimum possible bus fare : "+chi);
       System.out.println("Maximum possible bus fare : "+max);
   }
   else if(grup > chi){
       int max = grup+(chi-1);
       System.out.println("Minimum possible bus fare : "+grup);
       System.out.println("Maximum possible bus fare : "+max);
   }
}
}
