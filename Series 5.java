QUESTION:
Write a program to generate the first n terms in the series.

4,5,9,18,34,...

 

INPUT FORMAT:

Input consists of a single integer which corresponds to n.

OUTPUT FORMAT:

Output consists of the terms in the series separated by a blank space. 

SAMPLE INPUT:

6
SAMPLE OUTPUT:

4 5 9 18 34 59



Code:


import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int z=4;
System.out.print("4");
for(int i = 1; i <= n-1; i++){
    int y=i*i;
    int x=z+y;
System.out.print(" "+x);
z=x;
}
}
}
