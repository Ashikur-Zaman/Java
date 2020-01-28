
package java_final;


public class Shape_Triangle extends Shape {
    
    
    Shape_Triangle(double num1, double num2){
        super(num1,num2);
    }
    @Override
    void area(){
        
        double result = 0.5 * num1 *num2;
        System.out.println("The triangle is = "+result);
        System.out.println("");
    }
}
