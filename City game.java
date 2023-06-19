Suman was an ardent gamer and would toil spending time playing all sorts of video games. One such day, he sat to play the dragon city game. He has “n” levels in the game and a possible point he earns from each level is from 2 to 5. If he scores 2 points, then he will have to replay the level.
Suman would have to be very cautious and spend too much of his efforts to make the sum of his total points strictly in the “n” levels more than “k”. But that is impossible as his mom had insisted him just one hour of play. On the other hand, if the sum of the points is less than “k”, he would not keep up the challenge given to Varun, his pal, and a rival gamer.
Suman is very smart enough to get the points he chooses to score in every level. Also, he hates to replay a level.
Write a program to help Suman find the minimum number of levels he will have to replay if he clears his levels in a way that makes the sum of the points acquired from all “n” levels equals exactly “k”.



INPUT FORMAT:
The input consists of two integers. 
The first input consists of an integer n, which corresponds to the number of levels. ( 1 ≤ n ≤ 50) 
The second input consists of an integer k, which corresponds to the required sum of points. ( 1 ≤ k ≤ 250 ) 
It is guaranteed that there exists a way to pass n levels in the way that makes the sum of points equal exactly k.
OUTPUT FORMAT:

The output prints the single number — the minimum number of levels that the author will get a 2 for, considering that the sum of points for all levels must equal k.
Refer to the sample input and output for formatting specifications. 
[All text in bold corresponds to the input and the rest corresponds to output.]
SAMPLE INPUT & OUTPUT 1:
Enter the number of levels
4
Enter the required sum of points
8
The minimum number of levels is 4
SAMPLE INPUT & OUTPUT 2:

Enter the number of levels
4
Enter the required sum of points
10
The minimum number of levels is 2
  
  
Code:

import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of levels");
int levels = sc.nextInt();
System.out.println("Enter the required sum of points");
int points = sc.nextInt();

if(points%levels == 0){
   System.out.println("The minimum number of levels is "+levels);
}else{
   System.out.println("The minimum number of levels is "+ (points%levels));
}
}
}
