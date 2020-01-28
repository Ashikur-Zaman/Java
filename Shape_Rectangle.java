
package java_final;


public class Shape_Rectangle extends Shape {
    
    Shape_Rectangle(double num1, double num2){
        super(num1,num2);
    }
    
    @Override
    void area(){
        
        double result = num1*num2;
        System.out.println("The rectangle is = "+result);
        System.out.println("");
    }
}
