During the Physical Education hour, PT sir has decided to conduct some team games. He wants to split the students in the class into equal sized teams. In some cases, there may be some students who are left out from teams and he wanted to use the left out students to assist him in conducting the team games.

For instance, if there are 50 students in the class and if the class has to be divided into 7 equal sized teams, 7 students will be there in each team and 1 student will be left out.

PT sir asks your help to automate this team splitting task. Can you please help him out?

Input Format:

Input consists of 2 integers. The first integer corresponds to the number of students in the class and the second integer corresponds to the number of teams.

Output Format:

Refer sample input and output for formatting specifications.

Sample Input and Output:

[All text in bold corresponds to input and the rest corresponds to output]

60

8

The number of students in each team is 7 and left out is 4

Code:  
  
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=a/b;
 int d=a%b;
 System.out.println("The number of students in each team is "+c+" and left out is "+d);
 
 
}
}  
