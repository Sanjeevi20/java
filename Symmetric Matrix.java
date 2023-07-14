A symmetric matrix is a square matrix that is equal to its transpose.
Write a program to find whether a given matrix is a square matrix or not.

Input Format:
The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.

Output Format:
Refer sample output for details.

Sample Input 1:
2
2
4 5
5 4

Sample Output 1:
Symmetric


  Code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
    
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        
        boolean isSquare = (m == n);
        
        
        boolean isSymmetric = true;
        if (isSquare) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        isSymmetric = false;
                        break;
                    }
                }
                if (!isSymmetric) {
                    break;
                }
            }
        }
        
        
        if (isSquare && isSymmetric) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Not Symmetric");
        }
    }
}

