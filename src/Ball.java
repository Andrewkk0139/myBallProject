import javax.swing.*;
import java.awt.*;
public class Ball
{
    private int x,y,size,xSpeed,ySpeed;



    public Ball(int x,int y, int size)
    {
        this.x = x;
        this.y = y;
        this.size = size;
        xSpeed = 3;
        ySpeed = 3;
    }
    public Ball()
    {
      x = (int)(Math.random() * 400) + 1;
      y = (int)(Math.random() * 400) + 1;
      size = (int)(Math.random() * 20) + 5;
      xSpeed = (int)(Math.random() * 25) + 1;
      ySpeed = (int)(Math.random() * 25) + 1;


    }
    public void drawBall(Graphics g)
    {
        g.fillOval(x,y,size,size);
    }
    public void moveBall()
    {
        x+=xSpeed;
        y+=ySpeed;
        if(x >= 500 || x<= 0)
        {
            xSpeed*=-1;
        }
        if(y>=500 || y<=0)
        {
            ySpeed*=-1;
        }

    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getSize()
    {
        return size;
    }
}