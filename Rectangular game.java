QUESTION:

The Smart Beaver from ABBYY decided to have a day off. But doing nothing the whole day turned out to be too boring, and he decided to play a game with pebbles. Initially, the Beaver has n pebbles. He arranges them in 'a' equal rows, each row has 'b' pebbles (a > 1). Note that the Beaver must use all the pebbles he has, i. e. n = a·b.

 
10 pebbles are arranged in two rows, each row has 5 pebbles
Once the Smart Beaver has arranged the pebbles, he takes back any of the resulting rows (that is, b pebbles) and discards all other pebbles. Then he arranges all his pebbles again (possibly choosing other values of a and b) and takes back one row, and so on. The game continues until at some point the Beaver ends up with exactly one pebble.

The game process can be represented as a finite sequence of integers c1, ..., ck, where:

c1 = n
ci + 1 is the number of pebbles that the Beaver ends up with after the i-th move, that is, the number of pebbles in a row after some arrangement of ci pebbles (1 ≤ i < k). Note that ci > ci + 1.
ck = 1
The result of the game is the sum of numbers ci. You are given n.
Write a program to find the maximum possible result of the game.



INPUT & OUTPUT FORMAT:
The input contains a single integer n — the initial number of pebbles the Smart Beaver has.
The input limitations for getting 30 points are:
2 ≤ n ≤ 50
The input limitations for getting 100 points are:
2 ≤ n ≤ 109
The output displays the maximum possible result of the game.
Text in bold represents the output.
SAMPLE INPUT & OUTPUT 1:

10
16
SAMPLE INPUT & OUTPUT 2:
8
15


Code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //gets user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //to store result of the game
        int result = n;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                n /= i;
                result += n;
            }
        }
        //if the n pebbles greater than 1
        if (n > 1) {
            result++;
        }
        //display the maximum possible reuslt of the game
        System.out.println(result);
    }
}

