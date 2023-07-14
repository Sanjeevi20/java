Write a Java program to create a class named "Birds" that contains a constructor that prints "Birds : ". Create a class named Parrot, it extends the class Birds. It contains a constructor that prints "Grey Parrot."

Create class named Cocktail, it extends class Parrot. It contains a constructor that prints "Grey Cocktail". Create class named Kiwi, it extends class Cocktail. It contains constructor which prints "Grey Kiwi"..

If the input is "Parrot" call the class Parrot.
If the input is "Cocktail" call the class Cocktail.
If the input is "Kiwi" call the class Kiwi.

Input Format
Input consists of a string.

Output Format
Output consists of a string.
Refer to the sample output for your reference.

Sample Input
Kiwi
Sample Output
Birds : Grey Kiwi
Sample Input
Cocktail
Sample Output
Birds : Grey Cocoktail


  Code:


import java.util.Scanner;
class Birds{
    Birds(){}
    public static void birds(){
    System.out.print("Birds:");
    }
}

class Parrot extends Birds{
    Parrot(){}
    public static void parrot(){
    System.out.println(" Grey Parrot");
    }
    }

class Cocktail extends Parrot{
    Cocktail(){
        
    }
    public static void cocktail(){
   System.out.println(" Grey Cocoktail");
    }
    }
class Kiwi extends Cocktail{
    Kiwi(){}
    public static void kiwi(){
     System.out.println(" Grey Kiwi");
}
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
 
        Birds br=new Birds();
        Parrot pr=new Parrot();
        Cocktail ck=new Cocktail();
        Kiwi kk=new Kiwi();
        if(a.equals("Kiwi")){
            br.birds();kk.kiwi();
        }
        else if(a.equals("Cocktail")){
            br.birds();ck.cocktail();
        }
        else if(a.equals("Parrot")){
            br.birds();pr.parrot();
        }
            
        }
        
    }


