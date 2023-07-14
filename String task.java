
QUESTION:
Petya started to attend programming lessons. On the first lesson, his task was to write a simple program. The program was supposed to do the following: in the given string, consisting of uppercase and lowercase letters, it:

Deletes all the vowels.
Inserts a character "." before each consonant.
Replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string. Write a program to help Petya cope with this easy task.



INPUT & OUTPUT FORMAT:
The first line represents the input string of Petya's program. This string only consists of uppercase and lowercase letters and its length is from 1 to 20, inclusive.
The output is to print the resulting string. It is guaranteed that this string is not empty.
[All text in bold represents the input and the rest represents the output.]
SAMPLE INPUT & OUTPUT 1:
Enter the string
tour
The resultant string
.t.r
SAMPLE INPUT & OUTPUT 2:

Enter the string
aBAcAba
The resultant string
.b.c.b


  Code:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //display to get string from the user
        System.out.println("Enter the string");
        //get input from the user
        String n = sc.nextLine();
        //convert input to lowercases
        n = n.toLowerCase();
        //split input string into characters
        String [] result = n.split("");
        System.out.println("The resultant string");
        for(int i =0;i < n.length();i++){
                if(result[i].equals("a") || result[i].equals("i") || result[i].equals("o") || result[i].equals("u") ||result[i].equals("e")){
                    System.out.print("");
                }
                else if(result[i].equals("g")){
                    System.out.print(result[i]);
                }
                else if(result[i].equals("/") || result[i].equals("'")){
                    System.out.print("");
                }
                else{   
                    System.out.print("."+result[i]);
                }
        }
    }
}

