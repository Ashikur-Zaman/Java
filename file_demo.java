
package java_file;

import java.io.File;


public class file_demo {
    public static void main(String[] args) {
        
        
        File dir = new File("FirstFile");
        dir.mkdir();
        
        File file1 = new File("C:/Users/HP/Documents/NetBeansProjects/java_file/FirstFile/First");
        File file2 = new File("C:/Users/HP/Documents/NetBeansProjects/java_file/FirstFile/Second");
        
        
        try{
            
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created.");
            
        }
        catch(Exception e){
            System.out.println(e);
        
        }
        
        
        
        
    }
    
}
