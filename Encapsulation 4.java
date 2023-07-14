Player Details:
Create a class ‘Player’ in which all the fields are declared private.

Attributes are as follows:
String pName; 
int pAge; 
String gameType; 

Note: Use public setter and getter methods to set and read the value of the attributes.

Input Format
The first input (string) represents the player's name.
The second input (integer) represents the player's age.
The third input (string) represents the game type of a player.

Output Format
Refer sample output.

Sample Input
Dhoni
40
Cricket
Sample Output
Player's Name: Dhoni
Player's Age: 40
Player's Gametype: Cricket


Code:

//Enter your codeimport java.util.Scanner;
import java.util.Scanner;
class Player {
    private String pName;
    private int pAge;
    private String gameType;

    public void setPName(String playerName) {
        this.pName = playerName;
    }

    public void setPAge(int playerAge) {
        this.pAge = playerAge;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getPName() {
        return pName;
    }

    public int getPAge() {
        return pAge;
    }

    public String getGameType() {
        return gameType;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Player player = new Player();
        String playerName = input.nextLine();
        int playerAge = input.nextInt();
        input.nextLine(); // Consume the newline character

        String gameType = input.nextLine();

        player.setPName(playerName);
        player.setPAge(playerAge);
        player.setGameType(gameType);

        System.out.println("Player's Name: " + player.getPName());
        System.out.println("Player's Age: " + player.getPAge());
        System.out.println("Player's Gametype: " + player.getGameType());

    }
}

  
