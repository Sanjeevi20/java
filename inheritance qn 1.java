Given a Book class and the main class, write a MyBook class that does the following:

Inherits from the book and has a parameterized constructor taking these 3 parameters:

string title
string author
int price
Implements the Book class' abstract display() method so it prints the title, author, and price.

Input Format
The first line of the input consists of a string
The second line of the input consists of a string
The third line of the input consists of an integer

Output Format
Display the book details.

Constraints
Strings and integers only.

Sample Input
love
jack
300

Sample Output
Title: love
Author: jack
Price: 300
Sample Input
stars
juno
150
Sample Output
Title: stars
Author: juno
Price: 150


Code:


import java.util.*;
class Book{
    String title;
    String author;
    long price;
    Book(String title,String author,long price){
        this.title = title;
        this.author =author;
        this.price = price;
    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price:"+price);
    }
}
class MyBook extends Book{
    MyBook(String title,String author,long price){
        super(title,author,price);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        long price = sc.nextLong();
        MyBook obj = new MyBook(title,author,price);
        obj.display();
    }
}
