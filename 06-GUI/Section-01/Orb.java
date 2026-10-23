import javax.swing.*;
import java.awt.*;

public class Orb extends JComponent
{
    private int x = 0;
    private int y = 0;
    private int width = 50;
    private int height = 50;
    private int deltaX = 20;
    private int deltaY = 20;

    private Timer t;
    private JPanel window;

    public Orb(JPanel panel)
    {
        window = panel;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, width, height);
    }

    public void animate()
    {
        t = new Timer(1, e -> {
            x = x + deltaX;
            y = y + deltaY;

            if (x + width > window.getWidth())
            {
                deltaX *= -1;
            }

            if (y + height > window.getHeight())
            {
                deltaY *= -1;
            }

            if (x < 0)
            {
                deltaX *= -1;
            }

            if (y < 0)
            {
                deltaY *= -1;
            }

            invalidate();
            repaint();
        });

        t.start();
    }

}
