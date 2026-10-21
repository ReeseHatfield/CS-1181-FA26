import javax.swing.*;
import java.awt.*;

public class ChatBotGUI  extends JFrame {

    private JPanel root = new JPanel();
    private ChatBot cb = new ChatBot("RnJ.txt");

    public ChatBotGUI(){
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Shakespeare");

        this.initComponents();
        this.setContentPane(this.root);

        this.setVisible(true);
    }

    private void initComponents(){
        JTextArea inputBox = new JTextArea(3, 10);
        JButton inputBtn = new JButton("Get Response");
        inputBtn.addActionListener(e -> {
            String inputGiven = inputBox.getText();
            String reply = cb.reply(inputGiven);
            System.out.println(reply);

            JLabel lbl = new JLabel(reply);
            root.add(lbl);
            root.revalidate();

        });
        this.root.add(inputBox);
        this.root.add(inputBtn);
    }
}