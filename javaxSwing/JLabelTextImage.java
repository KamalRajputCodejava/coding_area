import java.awt.*;
import javax.swing.*;
public class JLabelTextImage {
public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setBounds(100,100,1000,500);
    Container c = f.getContentPane();
    c.setLayout(null);
    ImageIcon icon = new ImageIcon("whatsapp.png");
    JLabel label = new JLabel("Text",icon,JLabel.RIGHT);//Image aur text both add in 
    // the label  by calling the above constructor ;
    label.setBounds(0,100,500,100);
    c.add(label);// add the label to the container ;
    f.setVisible(true );

}
    
}
