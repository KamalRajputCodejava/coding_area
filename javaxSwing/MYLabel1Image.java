import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
public class MYLabel1Image { 
    // Jlabel main image  ko lagana ; 
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);// set layout mgr at null ;
        ImageIcon icon = new ImageIcon("whatsapp.png"); // image se obje ko initialize kia ;
        JLabel l1 =new JLabel(icon);//label meh iconimage ko add karna ; 
        l1.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());//label ke setbounds karna ; 
        c.add(l1);//label l1 ko container meh add karna ;
        frame.setVisible(true);// on the visibility of frame ;

    }
    
}
