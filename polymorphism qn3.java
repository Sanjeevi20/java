Write a Java program to demonstrate method overriding and dynamic method dispatch.

Create a class named 'Animal' with a method named 'Print' that prints "Animal" to the console. Next, create two subclasses named 'Dog' and 'Cat' that inherit from the 'Animal' class and override the 'Print' method to print "Dog" and "Cat" to the console, respectively.

In the 'Main' class, declare a variable 'a' of type 'Animal' and initialize it with a new object of the 'Dog' class. Call the 'Print' method on the 'a' variable and observe that "Dog" is printed to the console.

Next, set the 'a' variable to a new object of the 'Cat' class and again call the 'Print' method. Observe that "Cat" is printed to the console this time.

Input Format
No console input.

Output Format
Print the String from subclass named Dog and Cat in seperate lines.

Sample Input

Sample Output
Dog
Cat


  Code:

import java.util.*;
class Animal{
    public void Print(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    Dog(){System.out.println("Dog");}
}
class Cat extends Animal{
    Cat(){System.out.println("Cat");}
}

class Main{
    public static void main(String[]args){
        Animal a = new Dog();
        Animal c = new Cat();
    }
}
