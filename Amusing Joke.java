
QUESTION:
So, the New Year holidays are over. Santa Claus and his colleagues can take rest and have guests at last. When two "New Year and Christmas Men" meet, their assistants cut out from the cardboard, the letters from the guest's name and the host's name in honor of this event. Then, they hung the letters above the main entrance. One night, when everyone went to bed, someone took all the letters of our characters' names. Then, he may have shuffled the letters and put them in one pile in front of the door.

The next morning it was impossible to find the culprit who had made the disorder. But everybody wondered whether it is possible to restore the names of the host and his guests from the letters lying at the door? That is, we need to verify that there are no missing letters and that nobody will need to cut more letters.

Help the "New Year and Christmas Men" and their friends to solve this problem. You are given both inscriptions that hung over the front door the previous night and a pile of letters that were found at the front door next morning.



INPUT FORMAT:
The input consists of three strings.
The first string contains the guest's name
The second string contains the name of the residence host
The third string contains letters in a pile that were found at the door in the morning.
All strings are not empty and contain only uppercase Latin letters. The length of each string does not exceed 50.
OUTPUT FORMAT:
The output is to print " YES" (without the quotes), if the letters in the pile could be permuted to make the names of the "New Year and Christmas Men". Otherwise, print " NO" without the quotes.
Refer to sample input and output for formatting details.
[All text in bold represents the input, and the rest represents the output.]
SAMPLE INPUT & OUTPUT: 
Enter the guest's name 
SANTACLAUS 
Enter the name of the residence host 
DEDMOROZ 
Enter the letters in a pile 
SANTAMOROZDEDCLAUS 
YES 


Code:


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the guest's name");
        String a = sc.next();
        
        System.out.println("Enter the name of the residence host");
        String b = sc.next();
        
        System.out.println("Enter the letters in a pile");
        String c = sc.next();
        String ab = a+b;
        
        if(c.length() != (a.length() + b.length())){
            System.out.println("NO");
        }else{
            for(int i = 0; i < c.length(); i++){
                if(!c.contains(String.valueOf(ab.charAt(i)))){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
            
        }
    }
}
