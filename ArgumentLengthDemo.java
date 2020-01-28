
package java_oop;


public class ArgumentLengthDemo {
    
    void add(double ... num){
        
        double sum = 0;
        for (double x : num) {
            sum = sum + x;
            
        }
                    System.out.println("Sum is  = "+sum);
    }
    
}
