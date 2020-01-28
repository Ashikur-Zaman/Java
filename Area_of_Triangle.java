
package santo_java_basic;

import java.util.Scanner;


public class Area_of_Triangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double base,height,area;
        
        System.out.print("Enter the Base: ");
        base = input.nextDouble();
        
        System.out.print("Enter the Height: ");
        height = input.nextDouble();
        
        area = 0.5*base*height;
        
        System.out.println("The triangle area is : "+area);
        
    }
    
}
