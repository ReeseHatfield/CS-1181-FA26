import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.GREEN);
        g.fillRect(0, getHeight() - 50, getWidth(), 50);
        int[] x = {0, 10, 20};
        int[] y = {getHeight() - 50, getHeight() - 70, getHeight() - 50};

        for (int i = 0; i < 100; i++)
        {
            g.fillPolygon(x, y, 3);
            x[0] = x[0] + 20;
            x[1] = x[1] + 20;
            x[2] = x[2] + 20;
        }

    }
}
