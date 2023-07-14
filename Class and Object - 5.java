Create a class named Innings with The following private member variables/attributes

Include a 2-argument Argument Constructor in This Class. The arguments passed To The constructor are in This order --- battingTeam, runs. Include a default, empty constructor. Include appropriate getters and setters.

[Naming Convention:
getters : getBattingTeam getRuns
setters : setBattingTeam, setRuns...]

Create another class named Main and include a main method To test The above class(print The Output in Main Class).

Use an array of objects To read innings details. It includes the first innings and second innings 

Input Format
The Input Consists of String and Long 

Output Format
The Output should display the Innings Details 

Sample 1 Input:
RCB
190
CSK
188 

Sample 1 Output:
Innings 1 Details
BattingTeam : RCB
Runs scored : 190
Innings 2 Details
BattingTeam : CSK
Runs scored : 188 

Sample 2 Input:
CSK
230
RR
145 

Sample 2 Output:
Innings 1 Details
BattingTeam : CSK
Runs scored : 230
Innings 2 Details
BattingTeam : RR
Runs scored : 145



Code:


import java.util.Scanner;
class inn{
    public static void inn(){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    Long d=sc.nextLong();
    String e=sc.next();
    Long l=sc.nextLong();
    System.out.println("Innings 1 Details ");
        System.out.println("BattingTeam: "+s);
        System.out.println("Runs scored: "+d); 
        System.out.println("Innings 2 Details ");    
        System.out.println("BattingTeam: "+e);
        System.out.println("Runs scored: "+l);
}}
 class Main
{
    public static void main(String[] args)
    {
        inn r=new inn();
        r.inn();
    }
}
