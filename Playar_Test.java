
package java_oop;


public class Playar_Test {
    public static void main(String[] args) {
        
        Playar p = new Playar();
        PlayarBatting p1 = new PlayarBatting();
        
        p1.name = "Tamim Iqbal";
        p1.setAge(28);
        p1.position = "Batting";
        p1.avarage = 35;
        p1.displayinfo();
        
        p.name = "Masrafi Bin Murtoza";
        p.setAge(33);
        p.displayinfo();
        
        p.name = "Sakib Al Hasan";
        p.setAge(30);
        p.displayinfo();
        
        p1.name = "Musfiqur Rahim";
        p1.setAge(29);
        p1.position = "Batting";
        p1.avarage = 34;
        p1.displayinfo();
        
        
        System.out.println(p1 instanceof PlayarBatting);
        
    }
}
