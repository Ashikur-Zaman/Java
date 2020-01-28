
package java_final;


public class Shape_Test {
    public static void main(String[] args) {
        
        Shape ss;
        
        ss = new Shape_Rectangle(10,20);
        ss.message();
        ss.area();
        
        ss = new Shape_Circle(10);
        ss.message();
        ss.area();
        
        ss = new Shape_Triangle(10,20);
        ss.message();
        ss.area();
        
    }
}
