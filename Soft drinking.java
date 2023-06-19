This winter is so cold in Nvodsk. A group of n friends decided to buy k bottles of a soft drink called "Take-It-Light" to warm up a bit. Each bottle has l milliliters of the drink. Also, they bought c limes and cut each of them into d slices. After that, they found p grams of salt.

To make a toast, each friend needs nl milliliters of the drink, a slice of lime and np grams of salt. The friends want to make as many toasts as they can, provided they all drink the same amount.
Write a program to display the number of toasts each friend can make?



INPUT FORMAT:
The input contains 8 positive integers.
The first and only line contains positive integers n, k, l, c, d, p, nl, np, not exceeding 1000 and no less than 1. The numbers are separated by exactly one space.
Output Format:

The output displays a single integer — the number of toasts each friend can make.
Refer to the sample input and output for formatting specifications. 
Text in bold represents the output.
SAMPLE INPUT & OUTPUT 1:
3 4 5 10 8 100 3 1
2
SAMPLE INPUT & OUTPUT 2:

5 100 10 1 19 90 4 3
3
SAMPLE INPUT & OUTPUT 3:
10 1000 1000 25 23 1 50 1
0

Code:

import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
int l = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
int p = sc.nextInt();
int nl = sc.nextInt();
int np = sc.nextInt();

int totl = k*l;
int tots = c*d;

int drnksplit = totl/n;
int saltsplit = p/np;

if( drnksplit < saltsplit){
   int toast = drnksplit/n;
   System.out.println(toast);
}
if( drnksplit > saltsplit){
   int toast1 = saltsplit/n;
   System.out.println(toast1);
}

}
}
