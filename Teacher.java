
package java_oop;


public class Teacher {
    
    String name;
    static String gender= "Male";
    static int count = 0;
    int phone;
    
    
    Teacher(String n,int p){
        name = n;
        phone = p;
        count++;
        
    }
    
    void displayinfo(){
        System.out.println("Student serial No. : "+count);
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("");
    }
    
    
}
