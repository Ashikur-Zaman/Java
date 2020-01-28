
package java_oop;


public class Vehicle_Car extends Vehicle {
    
    String type;
    double weight;
    
    Vehicle_Car(String n, String c,String t, double w){
        super(n,c);
        type = t;
        weight = w;
        
    }
    
    @Override
    void displayinfo(){
        
        super.displayinfo();
        System.out.println("Vehicle's type : "+type);
        System.out.println("Vehicle's weight(Kg) : "+weight);
        System.out.println("");
    }
}
