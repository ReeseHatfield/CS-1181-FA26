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

        this.initComponents();
        this.setContentPane(root);


        // this.setResizable(false);


        
        this.setVisible(true);

    }

    public void initComponents(){
        // JColorChooser chooser = new JColorChooser();
        // this.root.add(chooser);

        // JButton btn = new JButton("Click me");
        // btn.addActionListener(e -> {
        //     btn.setBackground(chooser.getColor());
        // });
        // this.root.add(btn);

        // this.root.setLayout(new FlowLayout());
        // this.root.setLayout(new BorderLayout());
        // this.root.setLayout(new GridLayout(3, 3));
        // this.root.setLayout(new BoxLayout(this.root, BoxLayout.Y_AXIS));

        this.root.setLayout(new BorderLayout());
        this.root.add(new JLabel("Click one of the following:"), BorderLayout.NORTH);
        this.root.add(new JLabel("Thank you for clicking"), BorderLayout.SOUTH);
        // this.root.add(new JButton("left"), BorderLayout.WEST);

        JButton leftBtn = new JButton("left");
        leftBtn.addActionListener(e ->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie){
                // ignore
            }
        });

        this.root.add(leftBtn, BorderLayout.WEST);
        
        // this.root.add(new JButton("right"), BorderLayout.EAST);
        JButton rightBtn = new JButton("right");
        rightBtn.addActionListener(e -> {
            // new GUI();

            Random rng = new Random();

            for(int i = 0; i < 10; i++){

                JFrame f = new JFrame();
                f.setSize(500, 500);
                
                f.setLocation(rng.nextInt(0, 2000), rng.nextInt(0, 1500));
                f.setVisible(true);
            }
            

        });

        this.root.add(rightBtn, BorderLayout.EAST);


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 3));

        ArrayList<JButton> btns = new ArrayList<>();
        for(int i = 0; i < 9; i ++){
            btns.add(new JButton("Button " + i));
        }

        // // ...
        for(int i = 0; i < btns.size(); i++){
            centerPanel.add(btns.get(i));
        }

        this.root.add(centerPanel, BorderLayout.CENTER);



        // this.root.add(new JButton("hello"), BorderLayout.CENTER);
        // this.root.add(new JButton("world"), BorderLayout.SOUTH);
        // this.root.add(new JButton("my"), BorderLayout.EAST);
        // this.root.add(new JButton("name"), BorderLayout.NORTH);
        // this.root.add(new JButton("is"), BorderLayout.WEST);
        // this.root.add(new JButton("Reese"));
    }
}