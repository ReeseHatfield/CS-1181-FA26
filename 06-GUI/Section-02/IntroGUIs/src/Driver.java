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

        JLabel myLabel = new JLabel("Enter your name:");
        // myLabel.setText("hello world");
        root.add(myLabel);


        // JLabel course = new JLabel();
        // course.setText("CS-1181"); 
        // root.add(course);

        JTextArea inputBox = new JTextArea(2, 15);
        root.add(inputBox);

        JButton btn = new JButton();
        btn.setText("Greet");
        // btn.setIcon(new ImageIcon("cookie.png"));
        // btn.setEnabled(false);

        // btn.addActionListener(new ButtonAction());
        btn.addActionListener(e -> {

            // System.out.println("button action ran");
            String name = inputBox.getText();
            System.out.println("Hello, " + name);

            JLabel nameLabel = new JLabel();
            nameLabel.setText(name);
            root.add(nameLabel);

            root.repaint();
            root.revalidate();

            // System.out.println("Action event was: " + e);

        
        });
        root.add(btn);


        
        CustomButton btn2 = new CustomButton();
        root.add(btn2);

        root.add(new CustomButton());
        root.add(new CustomButton());


        myFrame.setContentPane(root);


        myFrame.setVisible(true);
    }
}