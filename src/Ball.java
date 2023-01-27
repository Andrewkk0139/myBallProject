import javax.swing.*;
import java.awt.*;
public class Ball
{
    private int x,y,size,xSpeed,ySpeed;
    private Color one = new Color(255,0,0);
    private Color two = new Color(0,255,0);
    private Color three = new Color(0,0,255);






    public Ball(int x, int y, int size, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public Ball()
    {
      x = (int)(Math.random() * 400) + 1;
      y = (int)(Math.random() * 400) + 1;
      size = (int)(Math.random() * 20) + 5;
      xSpeed = (int)(Math.random() * 10) + 1;
      ySpeed = (int)(Math.random() * 10) + 1;


    }
    public void drawBall(Graphics g)
    {
        int cdlrPicker = (int)(Math.random() * 2) + 1;
        switch(cdlrPicker){
            case 1:
                g.setColor(one);
                g.fillOval(x,y,size,size);
            case 2:
                g.setColor(two);
                g.fillOval(x,y,size,size);
            case 3:
                g.setColor(two);
                g.fillOval(x,y,size,size);
        }
    }
    public void moveBall(int frameWidth, int frameHeight)
    {
        x+=xSpeed;
        y+=ySpeed;
        if(x >= frameWidth || x<= 0)
        {
            xSpeed*=-1;
        }
        if(y>=frameHeight || y<=0)
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