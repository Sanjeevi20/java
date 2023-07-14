QUESTION:
Our good friend Mole is trying to code a big message. He is typing on an unusual keyboard with characters arranged in the following way.

 qwertyuiop asdfghjkl; zxcvbnm,./ 
Unfortunately, Mole is blind, so sometimes it is a problem for him to put his hands accurately. He accidentally moved both his hands with one position to the left or to the right. That means that now he presses not a button he wants, but one neighboring button (left or right, as specified in input).

We have a sequence of characters he has typed and we want to find the original message.



INPUT FORMAT:
The first line of the input contains a character, which describes the direction of shifting ('L' or 'R' respectively for left or right).
The second line contains a sequence of characters written by Mole. The size of this sequence will be no more than 50. The sequence contains only symbols that appear on Mole's keyboard. It doesn't contain spaces as there is no space on Mole's keyboard.
It is guaranteed that even though Mole's hands are moved, he is still pressing buttons on the keyboard and not hitting outside it.
OUTPUT FORMAT:
The output is to print a line that contains the original message.
Refer to sample input and output for formatting details.
[All text in bold represents the input and the rest represents the output.]
SAMPLE INPUT & OUTPUT:

Enter a character
R
Enter the string
s;;upimrrfod;pbr
The original message
allyouneedislove



  Code:


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a character");
        String shift = sc.nextLine();
        
        System.out.println("Enter the string");
        String input = sc.nextLine();
        
        String keys = "qwertyuiopasdfghjkl;zxcvbnm,./";
        System.out.println("The original message");
        if(shift.equals("R")){
            for(int i = 0; i < input.length(); i++){
                int n = -1;
                n += keys.indexOf(input.charAt(i));
                System.out.print(keys.charAt(n));
            }
        }else{
            for(int i = 0; i < input.length(); i++){
                int n = 1;
                n += keys.indexOf(input.charAt(i));
                System.out.print(keys.charAt(n));
            }
            
        }
    }
}
