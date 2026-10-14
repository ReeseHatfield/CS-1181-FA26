import javax.swing.*;
import java.awt.*;

public class Driver {

    // create object
    // initialize object
    // add object to something else (parent)

    public static void main(String[] args){

        // dont worry about this, just for presenting
        FontAdjuster.adjustFontSize(20);

        JFrame myFrame = new JFrame();

        myFrame.setSize(500, 500);
        myFrame.setTitle("My First GUI");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel root = new JPanel();

        JLabel myLabel = new JLabel("Hello world!");
        // myLabel.setText("hello world");
        root.add(myLabel);


        JLabel course = new JLabel();
        course.setText("CS-1181"); 
        root.add(course);

        JTextArea inputBox = new JTextArea(2, 15);
        root.add(inputBox);

        JButton btn = new JButton();
        btn.setText("My first button");
        btn.setIcon(new ImageIcon("cookie.png"));
        // btn.setEnabled(false);
        root.add(btn);


        myFrame.setContentPane(root);


        myFrame.setVisible(true);
    }
}