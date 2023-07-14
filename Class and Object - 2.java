Write a Java program to Create a class named Player with the following member variables/attributes. Create another class named Main and write a main method to test the above class.

Input Format
The first line consists of a string that represents the name
The second line consists of a string that represents the country
The third line consists of a string that represents the skill

Output Format
The Output Should Display the Player Details 

Sample 1 Input:
Dhoni
India
Wicket-Keeper 

Sample 1 Output:
Player Details
Player Name: Dhoni
Country Name: India
Skill : Wicket-Keeper 

Sample 2 Input:
Virat Kholi
India
Batsman 

Sample 2 Output:
Player Details
Player Name: Virat Kholi
Country Name: India
Skill : Batsman


Code:


import java.util.Scanner;
class lone{
   
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a=sc.nextLine();
        String n=sc.nextLine();
       
}
    
    
    
    class Main
{
    public static void main(String[] args)
    {
        lone e=new lone();
        System.out.println("Player Details ");
        System.out.println("Player Name: "+e.s);
        System.out.println("Country Name: "+e.a);
        System.out.println("Skill: "+e.n);
    }
}
