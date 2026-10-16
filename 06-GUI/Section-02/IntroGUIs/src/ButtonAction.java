import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!");


        // inputBox doesnt exist
        // String name = inputBox.getText();
        // System.out.println("name was: " + name);

    }
}