Jim and Jam spent their evening on a game of Treasure hunt in their play station. Heading to a nail-biting finish, Jam completed the treasure find in 67 seconds whereas Jim could make it only in 93 seconds.
Since Jam set a record in finishing the find in the least duration, he was offered the Treasure itself as a reward, as per how the game was programmed for. But the key to the Treasure’s lock is a secret. He wants us to help him open the treasure by solving the mystery of the lock.

The Treasure's lock looks as follows: It contains 4 identical scoop outs for gems as a 2 × 2 square, and some integer numbers are written at the lock's edge near the scoop outs. The example of a lock is given on the picture below.


The box is accompanied with 9 gems. Their shapes match the scoop outs' shapes and each gem is numbered from 1 to 9. The box will open only after it is decked with gems correctly that is, each scoop out in the lock should be filled with exactly one gem. Also, the sums of numbers in the square's rows, columns and two diagonals of the square should match the numbers written at the lock's edge. For example, the above lock will open if we fill the scoop outs with gems with numbers as is shown on the picture below.


Now Jam wants to fill in the scoop outs with appropriate gems carrying the numbers, provided the numbers at the lock’s edge is given. Let us help him solve this challenge.



INPUT & OUTPUT FORMAT:
The input contains numbers written on the edges of the lock of the Treasure.
The first line contains 2 integers r1 and r2 that define the required sums of numbers in the rows of the square.
The second line contains 2 integers c1 and c2 that define the required sums of numbers in the columns of the square. 
The third line contains 2 integers d1 and d2 that define the required sums of numbers on the main and on the side diagonals of the square (1 ≤ r1, r2, c1, c2, d1, d2 ≤ 20).

The output prints the scheme of decorating the box with stones: two lines containing two space-separated integers from 1 to 9. The numbers should be pairwise different. If there is no solution for the given lock, then print the single number "-1" (without the quotes).
SAMPLE INPUT 1:

3 7
4 6
5 5
SAMPLE OUTPUT 1:
1 2
3 4
SAMPLE INPUT 2:
1 2
3 4
5 6
SAMPLE OUTPUT 2:
-1

 Code:

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        
        int[][] grid = new int[2][2];
        boolean foundSolution = false;
        
        // Loop through all possible combinations of numbers from 1 to 9
        for (int num1 = 1; num1 <= 9; num1++) {
            for (int num2 = 1; num2 <= 9; num2++) {
                if (num2 == num1)
                    continue;
                
                for (int num3 = 1; num3 <= 9; num3++) {
                    if (num3 == num1 || num3 == num2)
                        continue;
                    
                    for (int num4 = 1; num4 <= 9; num4++) {
                        if (num4 == num1 || num4 == num2 || num4 == num3)
                            continue;
                        
                        // Fill the grid with the current combination of numbers
                        grid[0][0] = num1;
                        grid[0][1] = num2;
                        grid[1][0] = num3;
                        grid[1][1] = num4;
                        
                        // Check if the sums match the required values
                        if (grid[0][0] + grid[0][1] == r1 &&
                            grid[1][0] + grid[1][1] == r2 &&
                            grid[0][0] + grid[1][0] == c1 &&
                            grid[0][1] + grid[1][1] == c2 &&
                            grid[0][0] + grid[1][1] == d1 &&
                            grid[0][1] + grid[1][0] == d2) {
                            
                            foundSolution = true;
                            break;
                        }
                    }
                    
                    if (foundSolution)
                        break;
                }
                
                if (foundSolution)
                    break;
            }
            
            if (foundSolution)
                break;
        }
        
        if (foundSolution) {
            // Print the solution
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("-1");
        }
        
        
    }
}
