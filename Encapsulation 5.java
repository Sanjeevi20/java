Hall Equality:
The same halls cannot be booked on the same date for two different events. So get the halls booked by two different people and check whether it is the same or not. Use equals method to check all attributes of the hall are equal including the booking date.

Create Hall class with the following private attributes

Attributes              Datatype
name                     String
contactNumber     String
costPerDay            Double
ownerName          String


Include appropriate getters and setters. Create Default and Parameterized Constructor as Hall(String name, String contactNumber, Double costPerDay, String ownerName) for the class. Override equals method that compares all the fields of the class.

Create a driver class named Main to test the above class.

Input Format
Input consists of two sets of hall booking details.
Refer sample input.

Output Format
Output prints whether the booked halls are the same or not.

Sample Input
Benny
9089078654
1000
Dayal
Samir
9789432346
2000
Dev
Sample Output
Halls are different
Sample Input
Benny
9089078654
1000
Dayal
Benny
9089078654
1000
Dayal
Sample Output
Halls are same


Code:


import java.util.Scanner;
class Hall {
    private String name;
    private String contactNumber;
    private Double costPerDay;
    private String ownerName;
    public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public Double getCostPerDay() {
        return costPerDay;
    }
    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Hall otherHall = (Hall) obj;
        return name.equals(otherHall.name) &&
                contactNumber.equals(otherHall.contactNumber) &&
                costPerDay.equals(otherHall.costPerDay) &&
                ownerName.equals(otherHall.ownerName);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String contactNumber1 = scanner.nextLine();
        double costPerDay1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        String ownerName1 = scanner.nextLine();
        Hall hall1 = new Hall(name1, contactNumber1, costPerDay1, ownerName1);
        String name2 = scanner.nextLine();
        String contactNumber2 = scanner.nextLine();
        double costPerDay2 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        String ownerName2 = scanner.nextLine();
        Hall hall2 = new Hall(name2, contactNumber2, costPerDay2, ownerName2);
        if (hall1.equals(hall2)) {
            System.out.println("Halls are same");
        } else {
            System.out.println("Halls are different");
        }
    }
}

  
