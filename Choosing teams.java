QUESTION:

The Saratov State University Olympiad Programmers Training Center (SSU OPTC) has n students. For each student, you know the number of times he/she has participated in the ACM ICPC world programming championship. According to the ACM ICPC rules, each person can participate in the world championship at most 5 times.

The head of the SSU OPTC is recently gathering teams to participate in the world championship. Each team must consist of exactly three people and any person cannot be a member of two or more teams.

Write a program to determine the maximum number of teams the head can make if he wants each team to participate in the world championship with the same members at least k times?



INPUT & OUTPUT FORMAT:

The first input consists of an integer n (1 ≤ n ≤ 20), which corresponds to the number of students.
The next 'n' line contains integers, which corresponds to the number of times the person participated in the ACM ICPC world championship.
The next input consists of an integer k (1 ≤ k ≤ 5), which corresponds to the number of times the same member can participate.
The output displays the maximum number of teams can the head make.
[All text in bold represents the input, and the remaining represents the output.]
SAMPLE INPUT & OUTPUT 1:

Enter the number of students
5
Enter the number of times the person participated
O
4
5
1
O
Enter the number of times same member can participate
2
The maximum number of teams = 1
SAMPLE INPUT & OUTPUT 2:

Enter the number of students
6
Enter the number of times the person participated
O
1
2
3
4
5
Enter the number of times same member can participate
4
The maximum number of teams = 0



Code:


import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the number of times the person participated");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of times same member can participate");
        int k=sc.nextInt();
        int tc=calculateMaximumTeamCount(arr,k);
        System.out.println("The maximum number of teams = "+tc);
    }
    public static int calculateMaximumTeamCount(int[] arr,int k){
        int eligibleTeamCount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+k<=5){
                eligibleTeamCount++;
            }
        }
        int maximumTeamCount=eligibleTeamCount/3;
        return maximumTeamCount;
    }
}
