Some country is populated by wizards. They want to organize a demonstration.

There are n people living in the city, x of them are the wizards who will surely go to the demonstration. Other city people (n - x people) do not support the wizards and will not go to the demonstration. We know that the city administration will react only to the demonstration involving at least y percent of the city people. Having considered the matter, the wizards decided to create clone puppets which can substitute the city people on the demonstration.

So all in all, the demonstration will involve only the wizards and their puppets. The city administration cannot tell the difference between a puppet and a person, so, as they calculate the percentage, the administration will consider the city to be consisting of only n people and not containing any clone puppets.

Write a program to help the wizards and find the minimum number of clones to create so that the demonstration had no less than y percent of the city people.

INPUT & OUTPUT FORMAT:

The first line contains three space-separated integers, n, x, y (1 ≤ n, x, y ≤ 104, x ≤ n) — the number of citizens in the city, the number of wizards and the percentage the administration needs, correspondingly.
Please note that y can exceed 100 percent, that is, the administration wants to see on a demonstration more people that actually live in the city ( > n).
The output prints a single integer — the answer to the problem, the minimum number of clones to create, so that the demonstration involved no less than y percent of n (the real total city population). 
Text in bold represents the output.
SAMPLE INPUT & OUTPUT 1:
10 1 14 
1 
SAMPLE INPUT & OUTPUT 2:
20 10 50 
0
SAMPLE INPUT & OUTPUT 3:
1000 352 146 
1108 

Code:

import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String input = sc.nextLine();
String[] list = input.split(" ");

int n = Integer.parseInt(list[0]);
int x = Integer.parseInt(list[1]);
int y = Integer.parseInt(list[2]);

if(n > 0 && n <= 10000){
   if(x > 0 && x <= 10000 && x <= n){
       if(y > 0 && y <= 10000){
           int want = n * y / 100;
           if(x > want){
               System.out.println(0);
           }else{
               System.out.println(want - x);
           }
       }
   }
}
}
}



