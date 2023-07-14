Write a Java Program to Create a Class named Player with the following member variables/attributes. Create another Class called Main and write a main method to get the player details in a string separated by a comma. Use String. Split() function to display the details.

Sample 1 Input:
MS Dhoni,India,Wicket Keeper 

Sample 1 Output:
Player Details
Player Name: MS Dhoni
Country Name: India
Skill: Wicket Keeper 

Sample 2 Input:
Virat Kholi,India,Batsman 

Sample 2 Output:
Player Details
Player Name: Virat Kholi
Country Name: India
Skill: Batsman

Code:

import java.util.*;
class subject{
    Scanner sc=new Scanner(System.in);
    String e = sc.nextLine();
    String d = e.split(",")[0];
    String s = e.split(",")[1];
    String t = e.split(",")[2];
    
}
class Main
{
    public static void main(String[] args)
    {
        subject t=new subject();
        System.out.println("Player Details ");
        System.out.println("Player Name: "+t.d);
        System.out.println("Country Name: "+t.s);
        System.out.println("Skill: "+t.t);
    }
}
