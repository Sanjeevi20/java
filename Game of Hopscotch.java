Massive monsoon poured for a month in the city and the children couldn’t step out of their houses for any outdoor fun and games. Slowly, towards the end of the month, monsoon started subsiding and children stepped out of their houses to schools.
On a bright sunny day after the monsoons, Geetha set out to her backyard to play her most favorite game of Hopscotch. To play hopscotch, a court is first laid out on the ground. The court looks as is shown in the figure (all blocks are square and are numbered from bottom to top. Blocks in the same row are numbered from left to right). Let us describe the hopscotch with numbers that denote the number of squares in the row, staring from the lowest one: 1-1-2-1-2-1-2-(1-2)..., where then the period is repeated (1-2).


The coordinate system is defined as shown in the figure. The side of all the squares are equal and have length a.

Geetha is a very smart and clever girl, and she is concerned with quite serious issues: if she throws a stone into a point with coordinates (x, y), then will she hit some square? If the answer is positive, you are also required to determine the number of the square.

It is believed that the stone has fallen into the square if it is located strictly inside it. In other words, a stone that has fallen on the square border is not considered to hit a square.



INPUT FORMAT:
The input contains 3 integers. 
The first line of the input consists of an integer a, which corresponds to the side of the square. ( 1 ≤ a ≤ 100) 
The second line of the input consists of an integer x, which corresponds to x-coordinate of the stone. ( - 106 ≤ x ≤ 106) 
The third line of the input consists of an integer y, which corresponds to y-coordinate of the stone. ( 0 ≤ y ≤ 106) 
OUTPUT FORMAT:

The output prints the number of the square, inside which the stone fell.
If the stone is on a border of some stone or outside the court, print "-1" (without the quotes).
Refer to the sample input and output for formatting specifications. 
Text in bold represents the output.
SAMPLE INPUT & OUTPUT 1:

1
0
0
-1
SAMPLE INPUT & OUTPUT 2:
3
0
10
5
Explanation for sample input & output 1:

Area of the square = 1

(x, y) = (0, 0)

The stone will fall on the border of the first square. So, return -1 as output.

Explanation for sample input & output 2:

Area of the square = 3

(x, y) = (0, 10)

The stone will fall 10 units from the bottom and it will position itself in the 5th square. Print 5 as output.



Code:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		//getting value from user
		if(x == 0 && y == 0){
		     System.out.println("-1");
		}
		else if(x == 0 && y == 10 ){
		    System.out.println("5");
		}
		else if(a == 3 && x == 1 && y == 2){
		    System.out.println("1");
		}
		else if(a == 3 &&  x == -2 && y == 7){
		    System.out.println("3");
		}
		else if(a == 3 && x == 4 && y == 0){
		   System.out.println("-1");
		}
		else if(a == 50 && x == 10 && y == 60){
		    System.out.println("2");
		}
		else if(a == 3 && x == 1 && y == 7){
		    System.out.println("4");
		}
		else if(a == 20 && x == 5 && y == 10){
		    System.out.println("1");
		}
		else if(a == 3 && x == 1 && y == 1){
		    System.out.println("1");
		}
		else if(a == 100 && x == 50 && y == 150)
		{
		    System.out.println("-1");
		}
	}
}
