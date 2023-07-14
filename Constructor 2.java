The copy constructor is a constructor which creates an object by initializing it with an object of the same class, which has been created previously.
Create three class called Main, Student and Department.
public class Main{}
public class Studen{}
public classDepartment{}
In Main class, get all details of the student such as Name, id and Department.
In Department class only id and department fields are declared as private.
    private String name;
    private int id;
Include getter and setter for appropriate fields in Department class.
Create a constructor with two arguments id and department.
public Department(int id, String name) 
public Department(Department oldDepartment) 
In Student class create a constructor with three arguments Id, Name and Department object.
    private String name;
    private int id;
    private Department department;
Include getter and setter for appropriate fields in Student class.
Create an object for Department class and the constructor will be initialized.
        Department department = new Department(id,depar);
Create an object for Student class and the constructor will be initialized.
        Student originalEmployee = new Student(id,name, department);
Display the details of the student.
System.out.println("Original:- " + originalEmployee);
Then create a new object which copies the first constructor object.
       Student clonedEmployee = new Student(originalEmployee);
Display the details of the student after copy constructor is initialized.
System.out.println("Duplicate:- " + clonedEmployee);
public String toString() 
    {
        return "\nStudent Id: " + id + "\nStudent Name: " + name + ""+ department;
    }
 
Sample Input and Output 1:
Name
Sherin
Id
45
Department
CSE
Original:- 
Id: 45
Name: Sherin
Department Id: 45
Department: CSE
Duplicate:- 
Id: 45
Name: Sherin
Department Id: 45
Department: CSE

Sample Input and Output 2:
Name
Jeni
Id
678
Department
Civil
Original:- 
Id: 678
Name: Jeni
Department Id: 678
Department: Civil
Duplicate:- 
Id: 678
Name: Jeni
Department Id: 678
Department: Civil

Sample Input and Output 3:
Name
Eve
Id
345
Department
Mech
Original:- 
Id: 345
Name: Eve
Department Id: 345
Department: Mech
Duplicate:- 
Id: 345
Name: Eve
Department Id: 345



Code:


import java.util.*;
class Student{
    private String name;
    private int id;
    private String department;
    Student(String name,int id,String dept){
        this.name=name;
        this.id = id;
        this.department = dept;
    }
    public void stu(){
        System.out.println("Original:-");
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department Id: "+id);
        System.out.println("Department:"+department);
    }
}
class Department{
    private String name ;
    private int id;
    private String department;
    Department(String name,int id,String depar){
    this.name = name;
    this.id = id;
    this.department = depar;
    }
    public void dep(){
        System.out.println("Duplicate:-");
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department Id: "+id);
        System.out.println("Department:"+department);
    }
}
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name");
        String name = sc.nextLine();
        System.out.println("Id");
        int id = sc.nextInt();
        System.out.println("Department");
        sc.nextLine();
        String depar = sc.nextLine();
        Student stu = new Student(name,id,depar);
        stu.stu();
        Department dept = new Department(name,id,depar);
        dept.dep();
        
        
        
    }
}

