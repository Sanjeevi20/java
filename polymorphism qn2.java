Create a Java class named 'Main' that demonstrates function overloading:

Define a method named 'multiply' that takes two integer parameters 'num1' and 'num2' and returns their product as an integer value.
Overload the 'multiply' method by defining a second method named 'multiply' that takes two double parameters 'num1' and 'num2' and returns their product as a double value.
Input Format
Input two Integers in a separate line & two Double in a separate line.

Output Format
One Integer value and Double value after performing multiplication in a separate line.

Sample Input
2
3
1.2
2.3
Sample Output
6
2.76
Sample Input
4
5
1.5
3.4
Sample Output
20
5.1


  Code:

import java.util.*;
class Main{
  
  
public static void multiply(int a,int b){
        System.out.println(a*b);
    }
public static void multiply(double a,double b){
        System.out.println(a*b);
    }


public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Main.multiply(x,y);
        Main.multiply(a,b);
    }
}
