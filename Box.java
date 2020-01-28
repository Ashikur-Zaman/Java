
package java_oop;


public class Box {
    
    double height;
    double width;
    double depth;
    
    Box(double h,double w,double d){
        height = h;
        width = w;
        depth = d;
    }
    
    void displayVol(){
        System.out.println("Height : "+height);
        System.out.println("Width : "+width);
        System.out.println("Depth : "+depth);
        double vol = height*width*depth;
        System.out.println("The volume of the box is = "+vol);
        System.out.println("");
    }
}
