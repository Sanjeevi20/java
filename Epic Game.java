QUESTION:
Simon and Antisimon play a game. Initially, each player receives one fixed positive integer that doesn't change throughout the game. Simon receives number a and Antisimon receives number b. They also have a heap of n stones. The players take turns to make a move and Simon starts. During a move, a player should take from the heap the number of stones equal to the greatest common divisor of the fixed number he has received and the number of stones left in the heap. A player loses when he cannot take the required number of stones (i. e. the heap has strictly fewer stones left than one needs to take).

Write a program to determine by the given a, b and n who wins the game.



INPUT & OUTPUT FORMAT:
The input consists of three integers. (1 ≤ a, b, n ≤ 100)
The first input contains an integer a, which corresponds to the fixed numbers, Simon.
The first input contains an integer b, which corresponds to the fixed numbers, Antisimon.
The third input contains an integer n, which corresponds to the initial number of stones in the pile.
Text in bold represents the output.
The output displays ---- If Simon wins, print "0" (without the quotes), otherwise print "1" (without the quotes).

SAMPLE INPUT & OUTPUT 1:

3
5
9
0
SAMPLE INPUT & OUTPUT 2:

1
1
100
1


Code:


import java.util.Scanner;
public class Main
{
    public static int gcd(int a,int b){
        //check gcd
        if(b==0)
        return a;
        return gcd(b,a%b);}
    
	public static void main(String[] args) {
		//your code
		//i/p from user
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		boolean simonturn=true;
		while(n>0)
		{
		 if(simonturn)
		 {
		  int stonestaken=gcd(a,n);
		   if(stonestaken>=n)
		   {
		     System.out.println("0");
		   break;
		         }
		    n-=stonestaken;
		     }
		  else
		  {
		    int stonestaken=gcd(b,n);
	 if(stonestaken>=n)
	 {
		  System.out.println("1");
		  break;
	     
	 }
		  n-=stonestaken;
		      
		  }
	simonturn=!simonturn;
		    
		}}}
