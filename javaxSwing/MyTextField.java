import javax.swing.*;
import java.awt.*;

public class MyTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // cratin obj of the frame ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // method to close by window closing ;
        frame.setSize(1000, 500);// set the size of the frame window ;
        frame.setBounds(100, 100, 1000, 500);// set the limits of window ;
        frame.setTitle("Sample Frame");
        JTextField t1 =new JTextField();
        Container c =frame.getContentPane();
        t1.setBounds(100, 50, 120, 30);
        c.add(t1); //content pane() meh t1 ko add karna ;
        t1.setText("mkmc");
        Font font = new Font("arial",Font.BOLD,25);
        t1.setFont(font);
        t1.setBackground(Color.GREEN);
        t1.setForeground(Color.YELLOW);
        t1.setEditable(true);
        frame.setVisible(true);

    }
    
}
