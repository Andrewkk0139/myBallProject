import java.awt.*;
import javax.swing.*;
public class Main
{
    public static void main(String[] args)
    {

        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        //DrawPanel myPanel = new DrawPanel();
        BallPanel bPanel = new BallPanel();
        //BallPanel2 b2Panel = new BallPanel2();




        //myFrame.add(myPanel);
        myFrame.add(bPanel);
        myFrame.setVisible(true);



    }
}