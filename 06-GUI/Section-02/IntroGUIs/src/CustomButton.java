import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomButton extends JButton implements ActionListener {

    
    public CustomButton(){
        this.setText("This is a custom button class");

        // btn.addActionListener(instance of the ActionListener)
        this.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!");

    }
}