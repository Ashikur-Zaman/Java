
package santo;

import java.util.Scanner;


public class PositiveNagetive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int chck;
        System.out.print("Enter any number : ");
        chck = input.nextInt();
        
        if(chck>0){
            System.out.println("This is a positive number."); 
        }
        else if(chck<0){
            System.out.println("This is a nagative number.");
        }
        else{
            System.out.println("This is zero.");
        }
    }
    
}
