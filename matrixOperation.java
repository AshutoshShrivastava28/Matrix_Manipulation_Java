// import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;

// class InputMatrix extends JFrame implements ActionListener
// {
//  JLabel l1;
//   JTextField t1;
//   JLabel l2;
//   JTextField t2;
//   JButton b;
//   JLabel l3;
// }
// public class matrixOperation 
// {

//     public static void main(String []Args)
//     {
//         System.out.println("Hello");
//     }
// }

class LabelExample{

    public static void main(String args[])throws Exception {
    
    Frame f= new Frame("Label Example");
    
    Label l1,l2; //creating labels
    
    l1=new Label("First Label.");
    
    l1.setBounds(50,100, 100,30); //specifying location
    
    l2=new Label("Second Label.");
    
    l2.setBounds(50,150, 100,30);
    
    f.add(l1); //adding label control to frame
    
    f.add(l2);
    
    f.setSize(400,400); // setting frame dimension
    
    f.setLayout(null);
    
    f.setVisible(true);
    
    Thread.sleep(5000);
    
    l2.setText("New Label"); //use of setText method
    
    l2.setAlignment(Label.RIGHT);
    
    Thread.sleep(10000);
    
    f.dispose();
    
    }
    
    }