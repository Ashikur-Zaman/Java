
package java_oop;


public class Recursion_Test {
    public static void main(String[] args) {
        
        
        RecursionDemo ob = new RecursionDemo();
        
        int result = ob.fact(5);
        int result1 = ob.fact(4);
        
        System.out.println("Rcursion is = "+result);
        System.out.println("Rcursion is = "+result1);
        //direct using of ob...
        System.out.println("Rcursion is = "+ob.fact(6));
        
    }
}
