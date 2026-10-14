import javax.swing.*;
import java.awt.*;

public class MyFirstWindow extends JFrame
{
    private JPanel contentPane;
    private JButton clicker;
    private JLabel text;

    public MyFirstWindow()
    {
        contentPane = new JPanel();
        clicker = new JButton("Clicker Button");
        text = new JLabel("Click the button above:");

        clicker.setLocation(100, 500);
        clicker.setPreferredSize(new Dimension(500, 500));

        contentPane.add(clicker);
        contentPane.add(text);
        this.add(contentPane);
    }
}
