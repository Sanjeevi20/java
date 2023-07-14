A company maintains a database that has the details of all the employees. There are two levels of employees where level 1 is the top management having salary more than 100 dollars and level 2 is the staffs who are getting a salary less than 100 dollars. Create a class named Employee with empId and salary as attributes. Create another class empLevel that extends employee and categorizes the employee into various levels.

Input Format
The input should contain only the employee id and salary of the employee separated by space.
Employee id should be of integer type and salary float type.

Output Format
The output of the program must display the employee id, salary, and level of the employee one below the other in the same order.

Sample Input
253 5.6
Sample Output
253
5.6
2


  Code:

import java.util.Scanner;

class Employee {
    int empId;
    float salary;

    public Employee(int empId, float salary) {
        this.empId = empId;
        this.salary = salary;
    }
}

class EmpLevel extends Employee {
    int level;

    public EmpLevel(int empId, float salary) {
        super(empId, salary);
        this.level = (salary > 100) ? 1 : 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        float salary = sc.nextFloat();

        EmpLevel emp = new EmpLevel(empId, salary);

        System.out.println(emp.empId);
        System.out.println(emp.salary);
        System.out.println(emp.level);
    }
}
