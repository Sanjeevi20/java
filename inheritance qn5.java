Write a program by creating a class called "Bicycle" as a base class with the number of gears and speed of the bicycle as integer attributes and creating a class called "MontaneBike," a derived class that extends the Bicycle class with an attribute called "seat height" as an integer. Create a Test class to run the program and obtain the output on the console.

Note: Override the toString() method to display the details of the bicycle.

Input Format
The first line of the input consist of integer (Number of gears, Speed of bicycle, and Seat height).

Output Format
Display the number of gears and speed of the bicycle 

Constraints
integers only.

Sample Input
2 90 40
Sample Output
No of gears are 2
speed of bicycle is 90
seat height is 40
Sample Input
3 60 20
Sample Output
No of gears are 3
speed of bicycle is 60
seat height is 20



  Code:



import java.util.Scanner;
//int a;
//int b;
//int c;
class Bicycle{
    public static void bicycle(int a,int b){
        //Scanner.sc=new Scanner(System.in);
        //int a;//=sc.nextInt();
       // int b;//=sc.nextInt();
       System.out.println("No of gears are "+a);
        System.out.println("Speed of bicycle is  "+b);
    }
}
class MontanBike extends Bicycle{
    MontanBike(){
    }
    public static void moton(int c){
       // int c;//=sc.nextInt();
      System.out.println("Seat height is "+c);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       // Bicycle bi=new Bicycle();
        MontanBike mo=new MontanBike();
        mo.bicycle(a,b);
         //mo.bicycle(3);
         mo.moton(c);
        
    };
}
