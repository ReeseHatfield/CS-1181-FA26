import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JPanel root = new JPanel();

    public GUI(){
        this.setTitle("Custom Graphics");

        this.setSize(800, 800);
        this.root.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(root);

        initComponents();

        this.setVisible(true);

    }

    private void initComponents() {
        Ball b = new Ball();

        this.root.add(b);

        b.animate();
    }

}
