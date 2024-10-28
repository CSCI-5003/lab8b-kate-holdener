package ball.view;

import javax.swing.*;
import java.awt.event.KeyListener;

import ball.model.Ball;

public class MovingBallGUI
{
   JFrame mainFrame;
   JPanel mainPanel;
   BallDrawing drawing;
   LocationTracker locationTracker;
   Ball ball;

   public MovingBallGUI(Ball ball, KeyListener keyListener)
   {
      this.ball = ball;

      mainFrame = new JFrame();
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));   
   
      // the drawing of the ball
      drawing = new BallDrawing(400, ball);
      // place the ball in the middle of the drawing
      ball.setX((400-ball.getDiameter())/2);
      ball.setY((400-ball.getDiameter())/2);

      // the display showing the location of the ball
      locationTracker = new LocationTracker(ball);

      mainPanel.add(locationTracker);
      mainPanel.add(drawing);

      // attach key listener to the frame: when the frame is in focus and
      // any key is pressed, key listener will be called
      mainFrame.addKeyListener(keyListener);

      mainFrame.add(mainPanel);
      mainFrame.pack();
      mainFrame.setVisible(true);
   }
}
