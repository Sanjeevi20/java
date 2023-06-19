Xinyou has been trained to drive now. Dr. Dexter wants to get to a National Conference to present Xinyou. The venue of the conference is x kms away from his workshop. He wants to know if Xinyou will be able to make it to the conference on time if he travels at y kms/h.
Write a C program module that checks if he will be able to make it to the conference on time.

 
INPUT & OUTPUT FORMAT: 

Input consists of 4 lines.
The first line of input is a floating point number corresponding to the distance 'd'. 0 < d < 32767.
The second line of input is a floating point number corresponding to the speed 's'. 0 < s < 32767.
The third line of input is a floating point number corresponding to the time at which the conference begins – 'ti'. 
The fourth line of input is a floating point number corresponding to the current time, 'tj'.
'ti' and 'tj'  are strictly in the 'hh.mm' format (tj<ti).
Output consists of a single string 'Yes', 'No' or 'Invalid Input'.
SAMPLE INPUT & OUTPUT 1:
100
25
16.00
10.00
Yes
 SAMPLE INPUT & OUTPUT 2:
150
50
10.00
16.00
Invalid Input
SAMPLE INPUT & OUTPUT 3:
100
25
14.00
10.00
No

Code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        float distance = scanner.nextFloat();
        float speed = scanner.nextFloat();
        String conferenceStart = scanner.next();
        String currentTime = scanner.next();
       
        // Convert conference start time and current time to minutes
        int conferenceStartMinutes = convertToMinutes(conferenceStart);
        int currentMinutes = convertToMinutes(currentTime);
       
        // Check if the input is valid
        if (conferenceStartMinutes == -1 || currentMinutes == -1) {
            System.out.println("Invalid Input");
            return;
        }
       
        // Calculate the time it will take to reach the conference
        float travelTime = distance / speed;
       
        // Calculate the estimated arrival time
        int estimatedArrivalMinutes = currentMinutes + (int) (travelTime * 60);
       
        // Check if the estimated arrival time is before the conference start time
        if (estimatedArrivalMinutes < conferenceStartMinutes) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
       
        scanner.close();
    }
   
    // Function to convert time in 'hh:mm' format to minutes
    public static int convertToMinutes(String time) {
        String[] parts = time.split(":");
       
        // Check if the time format is valid
        if (parts.length != 2)
            return -1;
       
        int hours, minutes;
       
        try {
            hours = Integer.parseInt(parts[0]);
            minutes = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            return -1;
        }
       
        // Check if the hours and minutes are within the valid range
        if (hours < 0 || hours >= 24 || minutes < 0 || minutes >= 60)
            return -1;
       
        return hours * 60 + minutes;
    }
}

