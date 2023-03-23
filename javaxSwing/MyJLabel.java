import java.awt.*; // in this packege Container class is Define ; 
import javax.swing.*;// impor the library package ;
public class MyJLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();// Creating the jFrame obje ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set close default ;
        frame.setBounds(100 ,100,1000,500);// set alll the bounds ;
        Container c = frame.getContentPane();// store the contentPane into Container type c object ;
        c.setLayout(null);// aage padenge ise ;
        JLabel l = new JLabel("Username"); // creating JLabel obje by Username ; 
        l.setBounds(100,50,100,30);// setBounds ofr label ,l ;
        Font font = new Font("arial",Font.BOLD,12);// setting of fonts in the Jlabel l ;
        l.setFont(font);
        c.add(l);// add the label l to the contentPane() c ;
        frame.setVisible(true); //on the visibility ;
    }
    
}
