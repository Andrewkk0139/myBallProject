import javax.swing.*;
import java.awt.*;
public class Ball
{
    private int x,y,size,xSpeed,ySpeed;
    private Color ballColor;


    public Ball(int x, int y, int size, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        ballColor = new Color((int)(Math.random() * 0x1000000));
    }
    public Ball()
    {
      x = (int)(Math.random() * 400) + 1;
      y = (int)(Math.random() * 400) + 1;
      size = (int)(Math.random() * 20) + 5;
      xSpeed = (int)(Math.random() * 10) + 1;
      ySpeed = (int)(Math.random() * 10) + 1;
      ballColor = new Color((int)(Math.random() * 0x1000000));


    }



    public void drawBall(Graphics g)
    {
        g.setColor(ballColor);
        g.fillOval(x,y,size,size);
    }
    public void moveBall(int frameWidth, int frameHeight)
    {
        x+=xSpeed;
        y+=ySpeed;
        if(x >= frameWidth || x<= 0)
        {
            xSpeed*=-1;
            ySpeed=(int)(Math.random() * 10) - 5;
        }
        if(y>=frameHeight || y<=0)
        {
            ySpeed*=-1;
            xSpeed=(int)(Math.random() * 10) - 5;
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