
package java_oop;


public class PlayarBatting extends Playar {
    String position;
    int avarage;
    
    @Override
    void displayinfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+getAge());
        System.out.println("Position : "+position);
        System.out.println("Avarage : "+avarage);
        System.out.println("");
    }
        

}
