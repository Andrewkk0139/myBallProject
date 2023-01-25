import java.awt.*;
import javax.swing.*;
public class Main
{
    public static void main(String[] args)
    {
      System.out.println("Made a comment in replit");
      System.out.println("MADE COMMENT IN INTELLIJ!!");

        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        //DrawPanel myPanel = new DrawPanel();
        BallPanel2 bPanel = new BallPanel2();
        //BallPanel2 b2Panel = new BallPanel2();




        //myFrame.add(myPanel);
        myFrame.add(bPanel);
        myFrame.setVisible(true);



    }
}