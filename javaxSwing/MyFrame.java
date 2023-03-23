import java.awt.*;
import javax.swing.*;
class MyFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // cratin obj of the frame ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // method to close by window closing ;
        frame.setSize(1000, 500);// set the size of the frame window ;
        frame.setBounds(100, 100, 1000, 500);// set the limits of window ;
        frame.setTitle("Sample Frame");// set the title on the windw ;
// how to attach the image in the frame ( window  as logo of java )
 ImageIcon icon = new ImageIcon("whatsapp.png") ;
 frame.setIconImage(icon.getImage()); // icon meh jo image store hui use get karen ke liye getImage() method use ;
 Container c = frame.getContentPane();// contentpane ko container type ke c object meh dala ;
 c.setBackground(Color.RED);
 frame.setResizable(true);
        frame.setVisible(true);
    }

}