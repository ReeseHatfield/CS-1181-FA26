import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class GUI extends JFrame {

    private JPanel root = new JPanel();

    public GUI(){
        // super();
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My GUI");
        // set before 
        this.root.setLayout(new BorderLayout());

        this.initComponents();
        this.setContentPane(root);


        // this.setResizable(false);


        
        this.setVisible(true);

    }

    public void initComponents(){
        Ball b = new Ball();
        this.root.add(b);

        try {
            b.animate();
        }
        catch(Exception e) {
            
        }

        this.revalidate();
    }
}