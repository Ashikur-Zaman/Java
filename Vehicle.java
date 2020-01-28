
package java_oop;


public class Vehicle {
    
    String name;
    String color;
    
    Vehicle(String n, String c){
        
        name = n;
        color = c;
    }
    
    void displayinfo(){
        
        System.out.println("Brand's name : "+name);
        System.out.println("Color : "+color);
    }
    
}
