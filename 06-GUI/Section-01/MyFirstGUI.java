import javax.swing.*;

public class MyFirstGUI
{
    public static void main(String[] args)
    {
        JFrame myWindow = new MyFirstWindow();
        myWindow.setTitle("My First GUI!!!");
        myWindow.setSize(700, 500);
        myWindow.setLocation(250, 150);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
        System.out.println("All done!");
    }
}
