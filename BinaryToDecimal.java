
package javaarrray;


public class BinaryToDecimal {
    public static void main(String[] args) {
       
        String bi= "1111";
        int de = Integer.parseInt(bi, 2);
        System.out.println("From Decimal = "+de);
        
        String oc= "11";
        int di = Integer.parseInt(oc, 8);
        System.out.println("From Octal = "+di);
        
        String hx= "F";
        int dk = Integer.parseInt(hx, 16);
        System.out.println("From Hexa = "+dk);
        
    }
}
