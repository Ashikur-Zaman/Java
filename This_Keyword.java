
package java_final;


public class This_Keyword {
    
    String name;
    int age;
    String color;
    
    This_Keyword(String name, int age){
        
        this.name = name;
        this.age = age;
    }
    
    This_Keyword(String name, int age, String color){
        
        this(name,age);
        this.color = color;
    }
    
    void displayinfo(){
        this.ss();
        System.out.println("Nmae : "+name);
        System.out.println("Age : "+age);
        System.out.println("Color : "+color);  
        System.out.println("");
    }
    
    void ss(){
        System.out.println("HI");
    }
}
