import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Ball extends JComponent {

    private int x = 73;
    private int y = 417;

    private int width = 200;
    private int height = 200;

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // g.setColor(Color.ORANGE);
        g.setColor(Color.GREEN);

        // g.fillOval(this.x, this.y, 70, 70);

        // g.fillOval(x, y, width, height);

        g.drawString("DVD", this.x, this.y);
    }

    private int deltaX = 3;
    private int deltaY = 3;

    public void animate(){


        Timer t = new Timer(10, e -> {
            x += deltaX;
            y += deltaY;

            if(x > 800 - width){
                deltaX *= -1;
                playThump();
            }
            if(x < 0){
                deltaX *= -1;
                playThump();
            }
            
            if(y > 800 - height){
                deltaY *= -1;
                playThump();
            }
            
            if(y < 0){
                deltaY *= -1;
                playThump();
            }

            repaint();
        });

        t.setRepeats(true);
        t.start();
    }

    public void playThump(){
        try {
            File audioFile = new File("thump.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);


            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
