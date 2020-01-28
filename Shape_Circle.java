
package java_final;


public class Shape_Circle extends Shape {
    
    Shape_Circle(double r){
        super(r,r);
    }
    @Override
    void area(){
        
        double result = Math.PI * num1 *num2;
        System.out.println("The circle is = "+result);
        System.out.println("");
    }
}
