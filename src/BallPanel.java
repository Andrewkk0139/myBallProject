import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BallPanel extends JPanel
{
    int x = 80;
    int xSpeed = 3;
    int y = 20;
    int ySpeed = 3;
    Ball b1 = new Ball(300,250,50);
    public BallPanel()
    {
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int z = e.getKeyCode();
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setBackgroundocu(Color.RED);
        //We are in the JPanel class, so we can just stright call the method.
    }

    @Override
    //lets compiler know we are overriding the next method we write. Allows us to detect spelling errors. *
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //Allows you to call the parent of your extended class, and will do the OG code and let you extend the orignal method code.
        g.fillOval(x,y,10,10);
        g.fillOval(b1.getX(),b1.getY(),b1.getSize(),b1.getSize());
        x+=xSpeed;
        y-=ySpeed;
        if(x >= getWidth()-10 || x<= 0)
        {
            xSpeed*=-1; //changes the signs! thats cool tbh
        }
        if(y>=getHeight()-10 || y<=0)
        {
            ySpeed*=-1;
        }
        try{ //catch any exception
            Thread.sleep(14); //refresh rate
        } catch(Exception e){
            System.out.println(e);
        }
        repaint(); //since we extended, we can just plain call it
    }
}