QUESTION:
Vasya works as a DJ in the best Berland nightclub, and he often uses dubstep music in his performance. Recently, he has decided to take a couple of old songs and make dubstep remixes from them.

Let's assume that a song consists of some number of words. To make the dubstep remix of this song, Vasya inserts a certain number of words "WUB" before the first word of the song (the number may be zero), after the last word (the number may be zero), and between words (at least one between any pair of neighbouring words), and then the boy glues together all the words, including "WUB", in one string and plays the song at the club.

For example, a song with words "I AM X" can transform into a dubstep remix as "WUBWUBIWUBAMWUBWUBX" and cannot transform into "WUBWUBIAMWUBX".

Recently, Petya has heard Vasya's new dubstep track, but since he isn't into modern music, he decided to find out what was the initial song that Vasya remixed. Help Petya restore the original song.



INPUT & OUTPUT FORMAT:
The input consists of a single non-empty string, consisting only of uppercase letters, the string's length doesn't exceed 100 characters.
It is guaranteed that before Vasya remixed the song, no word contained substring "WUB" in it; Vasya didn't change the word order. It is also guaranteed that initially, the song had at least one word.
The output is to print the words of the initial song that Vasya used to make a dubstep remix. Separate the words with space.
[All text in bold represents the input and the rest represents the output.]
SAMPLE INPUT & OUTPUT 1:
Enter the dubstep remix of the song 
WUBWUBABCWUB 
The words of the initial song 
ABC 
SAMPLE INPUT & OUTPUT 2:
Enter the dubstep remix of the song 
WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB 
The words of the initial song 
WE ARE THE CHAMPIONS MY FRIEND 




Code:

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dubstep remix of the song");
        String str = sc.next();
                
        System.out.println("The words of the initial song");
        System.out.println(str.replace("WUB", " ").replace("   ", " ").replace("  ", " ").trim());
    }
}
