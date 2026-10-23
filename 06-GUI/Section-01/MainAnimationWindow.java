import javax.swing.*;
import java.util.Base64;

public class MainAnimationWindow extends JFrame
{
    private BackgroundPanel mainPanel = new BackgroundPanel();
    private Orb o = new Orb(mainPanel);

    public MainAnimationWindow()
    {
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(o);

        o.animate();

        this.setContentPane(mainPanel);
        this.setSize(500, 500);
        this.setLocation(400, 100);
        this.setTitle("Animation!!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
