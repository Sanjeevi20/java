QUESTION:
Write a program to generate the first n terms in the series.

0,2,8,14,...,34

 

INPUT FORMAT:

Input consists of a single integer which corresponds to n.

OUTPUT FORMAT:

Output consists of the terms in the series separated by a blank space.

SAMPLE INPUT:

6
SAMPLE OUTPUT:

0 2 8 14 24 34


Code:

import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int first = ((1 * 1) - 1);
System.out.print(first);
for (int i = 2 ; i <= n ; i++){
   
   if (i % 2 == 0){
       System.out.print(" "+((i * i) - 2));
   }
   else{
       System.out.print(" "+((i * i) - 1));
   }
}
}
}

