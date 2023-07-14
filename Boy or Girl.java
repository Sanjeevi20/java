QUESTION:
Those days, many boys use beautiful girls' photos as avatars in forums. So it is pretty hard to tell the gender of a user at first glance. Last year, our hero went to a forum and had a nice chat with a beauty (he thought so). After that, they talked very often and eventually, they became a couple in the network.

But yesterday, he came to see "her" in the real world and found out "she" is actually a very strong man! Our hero is very sad and he is too tired to love again now. So he came up with a way to recognize users' genders by their user names.

This is his method: if the number of distinct characters in one's user name is odd, then he is a male, otherwise, she is a female. You are given a string that denotes the user name, please help our hero to determine the gender of this user by his method.



INPUT & OUTPUT FORMAT:
The first line contains a non-empty string, that contains only lowercase letters, which corresponds to the user name. This string contains at most 50 letters.
Output is If it is a female by our hero's method, print "CHAT WITH HER!" (without the quotes), otherwise, print "IGNORE HIM!" (without the quotes).
Refer to the sample input and output for formatting details.
Text in bold represents the output.
SAMPLE INPUT & OUTPUT 1:
xiaodao
IGNORE HIM!
SAMPLE INPUT & OUTPUT 2:
sevenkplus
CHAT WITH HER!

Code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        int n = username.length();
        int count=0;
        for(int i=0;i<n;i++){
            char c = username.charAt(i);
            for(int j=0;j<n;j++){
                if(username.charAt(j)==c){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        if (count% 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
