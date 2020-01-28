
package javaarrray;

import java.util.Scanner;


public class ArraySumOfDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] A = new int[3][3];
        int sumOfDiagonal = 0;
        int sumOfUpper = 0;
        int sumOfLower = 0;
        System.out.println("Enter the matrix numbers : ");
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
             
            }
        }
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                
                if(row==col){
                    sumOfDiagonal = sumOfDiagonal + A[row][col];
                }
                if(row<col){
                    sumOfUpper = sumOfUpper + A[row][col];
                }
                if(row>col){
                    sumOfLower = sumOfLower + A[row][col];
                }
                
            }
            
        }
        System.out.println("Diagonal = "+sumOfDiagonal);
        System.out.println("Upper triangle = "+sumOfUpper);
        System.out.println("Lower triangle = "+sumOfLower);
    }
}
