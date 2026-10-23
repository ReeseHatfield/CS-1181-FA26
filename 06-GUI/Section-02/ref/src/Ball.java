import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.Timer;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ball extends JComponent{

    private int xPos = 30;
    private int yPos = 30;

    private int parentWidth = 500;
    private int parentHeight = 500;


    public Ball(){

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.CYAN);

        g.fillOval(xPos, yPos, 200, 200);
    }


    private int deltaX = 3;
    private int deltaY = 3;

    public void animate() throws Exception {
     


        Timer t = new Timer(10, e -> {

            this.xPos += deltaX;
            // this.yPos += deltaY;

            if(this.xPos > this.parentWidth) {
                deltaX *= -1;
                playThump();
                
            }
            else if(this.xPos < 0){
                deltaX *= -1;
                playThump();
            }


            this.repaint();

            // System.out.println("got here");

        });

        t.setRepeats(true);
        t.start();

     
    }

    private void playThump(){
        try {

            File audioFile = new File("thump.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        }catch(Exception e){

        }

    }
}