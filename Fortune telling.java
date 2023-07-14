QUESTION:
Marina loves Sasha. But she keeps wondering whether Sasha loves her. Of course, the best way to know it is fortune telling. There are many ways of telling fortune, but Marina has picked the easiest one. She takes in her hand one or several camomiles and tears off the petals one by one. After each petal, she pronounces alternatively "Loves" and "Doesn't love", at that. Marina always starts with "Loves". There are n camomiles growing in the field, possessing the numbers of petals equal to a1, a2, ... an. Marina wants to pick a bouquet with the maximal possible total number of petals so that the result would still be "Loves".
Write a program to find the maximal number of petals possible in the bouquet.



INPUT & OUTPUT FORMAT:
The first input contains an integer n (1 ≤ n ≤ 20), which corresponds to the number of flowers growing in the field.
The next 'n' lines contain n integers ai (1 ≤ ai ≤ 20) which represent the number of petals on given i-th camomile.
The output displays a single number which is the maximal number of petals in the bouquet, the fortune telling on which would result in "Loves".
If there are no such bouquet, print "0"(without quotes) instead. The bouquet may consist of a single flower.
[All text in bold represents the input, and the remaining represents the output.]
SAMPLE INPUT & OUTPUT 1:
Enter the number of flowers
1
Enter the number of petals in each flower
1
The maximum number of petals in the bouquet = 1
SAMPLE INPUT & OUTPUT 2:
Enter the number of flowers
1
Enter the number of petals in each flower
2
The maximum number of petals in the bouquet = 0
SAMPLE INPUT & OUTPUT 3:
Enter the number of flowers
3
Enter the number of petals in each flower
5
6
7
The maximum number of petals in the bouquet = 13




Code:

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number of flowers");
        int n = sc.nextInt();
       
        System.out.println("Enter the number of petals in each flower");
        int[] arr = new int[n];
        int[] rem = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
           
            if((arr[i]+sum)%2 == 1){
                sum += arr[i];
            }else{
                rem[i] = arr[i];
            }
        }
       
        for(int i = 0; i < n; i++){
            if((rem[i] + sum)%2 == 1 ){
                sum += rem[i];
            }
        }
        System.out.println("The maximum number of petals in the bouquet = "+sum);
    }
}
