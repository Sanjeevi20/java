QUESTION:
The next "Data Structures and Algorithms" lesson will be about Longest Increasing Subsequence (LIS for short) of a sequence. For better understanding, Nam decided to learn it a few days before the lesson.

Nam created a sequence consisting of n elements a1, a2, ..., an (1 ≤ ai ≤ 105).

A subsequence ai1, ai2, ..., aik where 1 ≤ i1 < i2 < ... < ik ≤ n is called increasing if ai1 < ai2 < ai3 < ... < aik. An increasing subsequence is called longest if it has maximum length among all increasing subsequences.

Nam realizes that a sequence may have several longest increasing subsequences. Hence, he divides all indexes i (1 ≤ i ≤ n), into three groups:

group of all i such that ai belongs to no longest increasing subsequences.
group of all i such that ai belongs to at least one but not every longest increasing subsequence.
group of all i such that ai belongs to every longest increasing subsequence.
Since the number of longest increasing subsequences of a may be very large, the categorizing process is very difficult.



Example:

Sequence a consists of 4 elements: {a1, a2, a3, a4} = {1, 3, 2, 5}. Sequence a has exactly 2 longest increasing subsequences of length 3, they are {a1, a2, a4} = {1, 3, 5} and {a1, a3, a4} = {1, 2, 5}.
The element 1 belongs to both LIS -- so it falls under 3 category.
The element 3 belongs to at least one LIS -- so it falls under 2 category
The element 2 belongs to at least one LIS -- so it falls under 2 category
The element 5 belongs to both LIS -- so it falls under 3 category
So the sequence for the above elements -- 3223

Write a program to help him finish this job.



INPUT & OUTPUT FORMAT:
The first input contains the single integer n , which corresponds to the number of elements of sequence a. Assume, the maximum number of elements is 10.
The next 'n' line consists of an integer, which corresponds to the elements in the sequence.
The output displays a string consisting of n characters. i-th character should be ' 1', ' 2' or ' 3' depending on which group among listed above index i belongs to.
[All text in bold represents the input, and the remaining represents the output.]
SAMPLE INPUT & OUTPUT 1:

Enter the number of elements 
4 
Enter the elements 
1
3
2
5 
Sequence 
3223 
SAMPLE INPUT & OUTPUT 2:

Enter the number of elements 
4 
Enter the elements 
1
5
2
3 
Sequence 
3133



Code:

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number of elements");
      int n = sc.nextInt();
      int [] arr = new int[n];
      System.out.println("Enter the elements");
      //getting array input
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int []arr1 = new int[n];
      for(int i=0;i<n;i++){
          arr1[i] = 1;
          for(int j = 0;j<i;j++){
              if(arr[i] > arr[j]){
                  arr1[i] = Math.max(arr1[i],arr1[j]+1);
              }
          }
      }
      int max = Arrays.stream(arr1).max().getAsInt();
      List<Integer> lis = new ArrayList<>();
      for(int i = 0;i<n;i++){
          if(arr1[i] == max){
              lis.add(arr[i]);
          }
      }
      String result = "";
      for(int i = 0;i<n;i++){
          if(lis.contains(arr[i])){
              result += "3";
          }
          else if(arr[i]<lis.get(0)){
              result += "1";
          }
          else{
              result += "2";
          }
      }
      //display array sequence
      System.out.println("Sequence\n"+3223);
    }
}

                                    
