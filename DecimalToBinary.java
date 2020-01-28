
package javaarrray;

import java.util.Scanner;


public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int deci;
        System.out.print("Enter any number : ");
        deci = input.nextInt();
        
        String bina = Integer.toBinaryString(deci);
        System.out.println("Binary = "+bina);
        
        String oc = Integer.toOctalString(deci);
        System.out.println("Octal = "+oc);
        
        String hex = Integer.toHexString(deci);
        System.out.println("Hexa = "+hex);
        
        
    }
}
