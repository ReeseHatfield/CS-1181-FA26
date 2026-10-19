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

    private JButton clicker = new JButton("Clicker Button");
    private JButton timedAdder = new JButton("Start timer!");

    private JSlider sizeController = new JSlider(5, 50, 12);

    private JLabel text = new JLabel("Click the button above");
    private JLabel currentCount = new JLabel();

    private Timer t;

    private int counter = 0;
    private int delayCounter = 0;

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

        ActionListener timedAddListener = (e -> {
            if (delayCounter < 10)
            {
                t.start();
                counter = counter + 10;
                currentCount.setText("Current count: " + counter);
                delayCounter++;
                timedAdder.setEnabled(false);
            }
            else
            {
                t.stop();
                delayCounter = 0;
                timedAdder.setEnabled(true);
            }
//            for (int i = 0; i < 10; i++)
//            {
//                try
//                {
//                    Thread.sleep(1000);
//                    counter = counter + 10;
//                    currentCount.setText("Current count: " + counter);
//                }
//                catch (InterruptedException ie)
//                {
//                    System.out.println("problem!");
//                }
//            }
        });
        t = new Timer(1000, timedAddListener);
        timedAdder.addActionListener(timedAddListener);

        for (int i = 1; i <= 20; i++)
        {
            JButton b = new JButton("Multiply by " + i);//Integer.toString(i));
            b.addActionListener(new ButtonListener(i));
            topBar.add(b);
        }

        //sizeController.setExtent(50);
        sizeController.setMajorTickSpacing(10);
        sizeController.setMinorTickSpacing(5);
        sizeController.setPaintTicks(true);
        sizeController.setPaintLabels(true);

        center.add(clicker);
        center.add(timedAdder);
        center.add(currentCount);
        center.add(sizeController);

        bottomBar.add(text);

        contentPane.add(topBar, BorderLayout.NORTH);
        contentPane.add(center, BorderLayout.CENTER);
        contentPane.add(bottomBar, BorderLayout.SOUTH);
        this.add(contentPane);
    }

    class ButtonListener implements ActionListener
    {
        private int buttonNum = 0;

        public ButtonListener(int num)
        {
            buttonNum = num;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //JButton b = (JButton) e.getSource();
            //counter = counter * Integer.parseInt(b.getText());
            counter = counter * buttonNum;
            currentCount.setText("Current count: " + counter);
        }
    }
}
