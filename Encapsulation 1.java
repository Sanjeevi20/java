Employee Details:

Create a class called "Employee" in which the employee's name, ID, and salary are declared as private attributes and the company name is a static variable. The data types of the members are as follows:

String eName; 
int eId; 
int eSalary; 
String companyName ; // static variable

Note: Use the public setter and getter methods to set and read the value of the attributes.
Initial companyName = "ABC Corp"

Input Format
The first input represents the number of employee details to be entered.
The next n inputs represent employee details with name, ID, and salary.
The last input represents the company name to be updated.

Output Format
Display the employee details entered by the user and also display the updated employee details.
Refer to the sample input and output for format specifications.

Sample Input 
2
Sachin
40
90000
Dhoni
42
95000
XYZCorp
Sample Output
Employee Name: Sachin
Employee ID: 40
Employee Salary: 90000
Employee Company Name: ABC Corp
Employee Name: Dhoni
Employee ID: 42
Employee Salary: 95000
Employee Company Name: ABC Corp
Updated Details
Employee Name: Sachin
Employee ID: 40
Employee Salary: 90000
Employee Company Name: XYZCorp
Employee Name: Dhoni
Employee ID: 42
Employee Salary: 95000
Employee Company Name: XYZCorp
Sample Input
3
Sachin
40
90000
Dhoni
42
95000
Angel
30
98000
ERPCorp
Sample Output
Employee Name: Sachin
Employee ID: 40
Employee Salary: 90000
Employee Company Name: ABC Corp
Employee Name: Dhoni
Employee ID: 42
Employee Salary: 95000
Employee Company Name: ABC Corp
Employee Name: Angel
Employee ID: 30
Employee Salary: 98000
Employee Company Name: ABC Corp
Updated Details
Employee Name: Sachin
Employee ID: 40
Employee Salary: 90000
Employee Company Name: ERPCorp
Employee Name: Dhoni
Employee ID: 42
Employee Salary: 95000
Employee Company Name: ERPCorp
Employee Name: Angel
Employee ID: 30
Employee Salary: 98000
Employee Company Name: ERPCorp


Code:



import java.util.Scanner;

class Employee {
    private String eName;
    private int eId;
    private int eSalary;
    private static String companyName = "ABC Corp";

    public void setEmployeeDetails(String name, int id, int salary) {
        eName = name;
        eId = id;
        eSalary = salary;
    }

    public String getEmployeeName() {
        return eName;
    }

    public int getEmployeeId() {
        return eId;
    }

    public int getEmployeeSalary() {
        return eSalary;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static String getCompanyName() {
        return companyName;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int id = sc.nextInt();
            int salary = sc.nextInt();
            sc.nextLine();

            Employee employee = new Employee();
            employee.setEmployeeDetails(name, id, salary);
            employees[i] = employee;
        }

        
        
        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Salary: " + employee.getEmployeeSalary());
            System.out.println("Employee Company Name: " + Employee.getCompanyName());
        }
        String updatedCompanyName = sc.nextLine();
        Employee.setCompanyName(updatedCompanyName);
        System.out.println("Updated Details");
        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Salary: " + employee.getEmployeeSalary());
            System.out.println("Employee Company Name: " + Employee.getCompanyName());
        }
    }
}
  
