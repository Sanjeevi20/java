Bishop Cotton High School was celebrating, as their school’s Grade 10 students have come out with flying colors in their board exams. School management was overwhelmed by the outperforming achievement of the students and organised a celebration to honor the top scorers. Too many students have procured 100 on 100 in all the subjects. Hence, at the celebrations, the management presented the proficiency certificate for all of the top scorers and centum scorers. 
The management also wanted to provide surprise awards to a few students. Those few students are selected based on their roll numbers. The criterion, applied on the roll numbers, is the concept of lucky numbers. Lucky numbers are those positive numbers whose decimal representation contains only the digits 4 and 7. All the lucky roll numbers are taken into consideration for award giving. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not. 
Now, write a program to find out if the given roll number is almost lucky or not. 

INPUT FORMAT:
The input consists of a single integer n (1 ≤ n ≤ 1000) — the number that needs to be checked.

OUTPUT FORMAT:

The output prints "YES" (without the quotes), if number n is almost lucky. Otherwise, print "NO" (without the quotes).
Refer to the sample input and output for formatting specifications. 
[All text in bold corresponds to the output and the rest corresponds to input.]
SAMPLE INPUT & OUTPUT 1:
Enter the number
47
YES
SAMPLE INPUT & OUTPUT 2:
Enter the number
16
YES
SAMPLE INPUT & OUTPUT 3:
Enter the number
78
NO

Code:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//creating a object for scanner class
		Scanner sc = new Scanner(System.in);
		
		//initializing the variables for user input
		System.out.println("Enter the number");
		int input = sc.nextInt();
		 
		if (input < 1 || input > 1000){
		    System.out.print("NO");
		}
		else{
		    if (input >=100 && input <=1000){
		        int hundred = (int)input / 100;
		        int tens = (int)(input % 100) / 10 ;
		        int ones = (int)((input % 100) % 10);
		        String result = ((hundred == 7 || hundred == 4) && (tens == 7 || tens == 4) && (ones == 7 || ones == 4)) ? "YES" : "NO";
		        System.out.print(result);
		    } 
		    else if (input >=10 && input <=99){
		        float tens = (input % 100)/10;
		        float ones = ((input % 100) % 10);
		        String Result = ((tens == 7 || tens == 4) && (ones == 7 || ones == 4)) ? "YES" : "NO";
		        System.out.print(Result);
		    }
		    else{
		        float tens = input % 100;
		        float ones = tens % 10;
		        String Result = (ones == 7 || ones == 4) ? "YES" : "NO";
		        System.out.print(Result);
		    }
		}
	}
}
