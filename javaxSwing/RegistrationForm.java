import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Myframe extends JFrame{
    Myframe(){
        JLabel l1,l2,l4,l3,l5, msg;
        JTextField t1,t2 ;
        JRadioButton male ,female ;
        JComboBox day,month,yr;
        JTextArea tal,screen;
        JCheckBox item,terms ;
        JButton submit ;
        setTitle("Registration form ");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        l1 =new JLabel("Name");
        l1.setBounds(20, 50, 100, 20);
        c.add(l1);
        t1 =new JTextField();
        t1.setBounds(130, 50, 100, 20);
        c.add(t1);
        l2 =new JLabel("Name");
        l2.setBounds(20, 100, 100, 20);
        c.add(l1);
        t2 =new JTextField();
        t2.setBounds(130, 100, 100, 20);
        c.add(t2);
        l3 = new JLabel("Gender");
        l3.setBounds(20,150,100,20);
        c.add(l3);
        male = new JRadioButton("Male");
        female= new JRadioButton("Female");
        male.setBounds(130,150,80,20);
        female.setBounds(220,150,80,20);
        male.setSelected(true);
        c.add(male);
        c.add(female);
        ButtonGroup Gen =new ButtonGroup();
        Gen.add(male);
        Gen.add(female);
        l4 =new JLabel("DOB");
        l4.setBounds(20,200,100,20);
        c.add(l4);
        String[] days={"1","2","3","4","5","6","7","8","9","10","11","12"};
        String[] months ={"Jan","Feb","Mar","Apr","May","June","Jul","Aug","Sept","Oct","Nov","Dec"};
        String[] years ={"1996","1997","1998","1999","2000","2001","2002","2004","2005"};
        month =new JComboBox();
        day = new JComboBox();
        yr =new JComboBox();
        day.setBounds(130,200,50,80);
        month.setBounds(130,200,50,80);
        yr.setBounds(130,200,50,80);
        c.add(day);
        c.add(month);
        c.add(yr);
        l5 =new JLabel("Address");
        l5.setBounds(20,250,100,20);
        c.add(l5);
        tal =new JTextArea();
        tal.setBounds(130, 240, 200, 50);
        c.add(tal);
        terms =new JCheckBox();
        terms.setBounds(50, 300, 250, 20);
        c.add(terms);
        submit =new JButton("Submit");
        submit.setBounds(150,350,80,30);
        c.add(submit);
        screen = new JTextArea();
        screen.setBounds(350,50,300,300);
        c.add(screen);
        msg =new JLabel();
        msg.setBounds(20,400,250,20);
        c.add(msg);
        setVisible(true);




    }
}
 class RegistrationForm {
public static void main(String[] args) {
    Myframe f =new Myframe();
         }
}
