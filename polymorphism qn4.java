Write a Java program to demonstrate method overloading.

Create a class named 'Main' with three overloaded 'main' methods. The first 'main' method takes a single argument of type 'String', the second 'main' method takes two arguments of type 'String', and the third 'main' method takes no arguments.

In each 'main' method, print a message to the console indicating that the method has been called, along with any arguments that were passed to the method.

In the third 'main' method, call the first two 'main' methods with appropriate arguments to demonstrate that method overloading allows multiple methods with the same name to be defined, as long as they have different method signatures

Input Format
No console input.

Output Format
The first line of the output should display 'Hi'.
The second line of the output should display 'Overloaded: Hello World'.
The third line of the output should display 'Overloaded: Tom & Jerry'.

Sample Input

Sample Output
Hi
Overloaded: Hello World
Overloaded: Tom & Jerry



Code:

public class Main {
    public static void main(String[] args) {
        main();
        main("Hello World");
        main("Tom", "Jerry");
    }

    public static void main() {
        System.out.println("Hi");
    }

    public static void main(String arg1) {
        System.out.println("Overloaded: " + arg1);
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Overloaded: " + arg1 + " & " + arg2);
    }
}

