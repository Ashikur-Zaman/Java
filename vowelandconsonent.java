
package santo_java_basic;

import java.util.Scanner;

public class vowelandconsonent {
    
    public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);  
      int[][] A = new int[3][3];
      int[][] B = new int[2][3];
      int[][] C = new int[2][3];
      
      int dia=0,up=0,low=0;
      
        System.out.println("Enter the array number A:");
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]= ",row,col);
                A[row][col]= input.nextInt(); 
            }
        }
        System.out.println(" ");
        System.out.print("A=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+A[row][col]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        
        System.out.println("Enter the array number B:");
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d]= ",row,col);
                B[row][col]= input.nextInt(); 
            }
        }
        System.out.println(" ");
        System.out.print("B=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+B[row][col]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        
        
        System.out.println(" ");
        System.out.print("A+B=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col]=A[row][col]*B[row][col];
                System.out.print("\t "+C[row][col]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        
        
        
          for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
                if(row==col){
                    dia=dia+A[row][col];
                }
                if(row<col){
                    up=dia+A[row][col];
                }
                if(row>col){
                    low=dia+A[row][col];
                }
            }
          }
        
        
        System.out.println("dia"+dia);
        System.out.println("up"+up);
        System.out.println("low"+low);

    }
    
}
