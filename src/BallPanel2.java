import javax.swing.*;
import java.awt.*;
import java.util.*;
public class BallPanel2 extends JPanel
{
    boolean plzWork = true;
    ArrayList<Ball> ballList = new ArrayList<Ball>();


    // add each ball into an arrayList

    Ball b1 = new Ball();
    Ball b2 = new Ball();
    int i = 0;

    public BallPanel2()
    {
        setBackground(Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for( i = i;i<20;i++){
            ballList.add(new Ball());

        }

        for(int i = 0;i<ballList.size();i++){
            ballList.get(i).drawBall(g);
            ballList.get(i).moveBall();
        }

        try{ //catch any exception
            Thread.sleep(10); //refresh rate
        } catch(Exception e){
            System.out.println(e);
        }
        repaint();



    }




}