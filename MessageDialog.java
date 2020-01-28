import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
class MessageDialog{
     
	public static void main(String[] args){
        ImageIcon icon = new ImageIcon("download.jpg");
        JOptionPane.showMessageDialog(null,"Invalid number","WARNING",-1,icon);	
    }

}