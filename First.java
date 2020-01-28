
package santo;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double farhanite,sels;
        System.out.print("Enter any number : ");
        
        sels = input.nextDouble();
        
        farhanite = 1.8*sels+32;
        
        System.out.println("Farhanite : "+farhanite);
        
    }
    
}
