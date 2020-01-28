
package javaarrray;

import java.util.Arrays;


public class Array3 {
    public static void main(String[] args) {
        
        int[] number = {8,4,9,2,0};
                
            Arrays.sort(number);
              
            System.out.println("Acending : ");
            
            for (int i = 0; i < 5; i++) {
                System.out.print("  "+number[i]);
            
            }
            System.out.println(" ");
            
            System.out.println("Decending : ");
            
            for (int i = 4; i >= 0; i--) {
                System.out.print("  "+number[i]);
            
            }
            System.out.println("");
            
            
            //2nd.....
            String[] names = {"ashikur","jaman","santo","badhon"};
                
            Arrays.sort(names);
              
            System.out.println("Acending : ");
            for (int i = 0; i < 4; i++) {
                System.out.print("  "+names[i]);
            
            }
          
            System.out.println(" ");
            
            System.out.println("Decending : ");
            
            for (int i = 3; i >= 0; i--) {
                System.out.print(" "+names[i]);
            
            }
            System.out.println("");
            
    }
}
