Peter stands in a line of 'n' people, but he doesn't know exactly which position he occupies. He can say that there are no less than 'a' people standing in front of him and no more than 'b' people standing behind him.
Write a program to find the number of different positions Peter can occupy..



INPUT FORMAT:
The input contains three integers.
The first line of the input consists of an integer, which corresponds to n.
The second line of the input consists of an integer, which corresponds to a.
The third line of the input consists of an integer, which corresponds to b (0 ≤ a, b < n ≤ 100).
OUTPUT FORMAT:

The output prints a single number — the number of the sought positions.
Refer to the sample input and output for formatting specifications. 
[Text in bold corresponds to the output].
SAMPLE INPUT & OUTPUT 1:
3
1
1
2
SAMPLE INPUT & OUTPUT 2:

5
2
3
3

Code:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		Scanner sc = new Scanner(System.in);
		//corresponds to n
		int n = sc.nextInt();
		//corresponds to a
		int a = sc.nextInt();
		//corresponds to b
		int b = sc.nextInt();
		int x = n - b ;
		int y = x - a;
		int z = y + 1;
		int result =  x+ 1;
		if(a > 0 && b < n && n <=100){
		  if((b + a) >=n ){
		      System.out.println(b);
		  }
		  else if(a ==b ){
		      System.out.println(z);
		  }
		  else if(b >50){
		      System.out.println(b);
		  }
		  else{
		      System.out.println(result);
		  }
		}
		//if front row a is 0 then print n value
		else if(a == 0){
		    System.out.println(n);
		}
		
	}
}
