
package javaarrray;


public class BasicArray {
     public static void main(String[] args) {
        
         int[] number;
         number = new int[5];
         
         number[0] = 10;
         number[1] = 20;
         number[2] = 30;
         number[3] = 40;
         number[4] = 16;
         
         int len = number.length;
         System.out.println("length = "+len);
         
         int sum = number[1] + number[2];
         System.out.println("Sum = "+sum);
         
    }
}