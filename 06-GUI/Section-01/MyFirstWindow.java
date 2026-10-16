import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstWindow extends JFrame
{
    private JPanel contentPane = new JPanel();
    private JPanel topBar = new JPanel(new GridLayout(4, 5));
    private JPanel center = new JPanel();;
    private JPanel bottomBar = new JPanel();
    private JButton clicker = new JButton("Clicker Button");;
    private JLabel text = new JLabel("Click the button above");
    private JLabel currentCount = new JLabel();

    private int counter = 0;

    public MyFirstWindow()
    {
        contentPane.setLayout(new BorderLayout());
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));

        currentCount.setText("Current count: " + counter);

        clicker.setLocation(100, 500);
        clicker.setPreferredSize(new Dimension(200, 200));
        clicker.addActionListener(e -> {
            counter++;
            currentCount.setText("Current count: " + counter);
        });

        for (int i = 1; i <= 20; i++)
        {
            JButton b = new JButton(Integer.toString(i));
            b.addActionListener(new ButtonListener());
            topBar.add(b);
        }

        center.add(clicker);
        center.add(currentCount);

        bottomBar.add(text);

        contentPane.add(topBar, BorderLayout.NORTH);
        contentPane.add(center, BorderLayout.CENTER);
        contentPane.add(bottomBar, BorderLayout.SOUTH);
        this.add(contentPane);
    }

    class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            counter = counter * Integer.parseInt(b.getText());
            currentCount.setText("Current count: " + counter);
        }
    }
}
