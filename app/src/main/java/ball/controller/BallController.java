package ball.controller;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import ball.model.Ball;
import ball.view.MovingBallGUI;

public class BallController implements KeyListener
{
   protected Ball ball;

   public BallController(Ball ball)
   {
      this.ball = ball;
      MovingBallGUI gui = new MovingBallGUI(ball, this);
   }
   @Override
   public void keyPressed(KeyEvent e)
   {
      // when right, left, up, down keys are pressed
      // the position of the ball gets updated
      // however, we are also calling on the ball drawing
      // and the display showing the position of the board
      // to update.

      // TODO: remove the calls to drawing.move() and
      // locationTracker.showLocation() and turn
      // LocationTracker and BallDrawing into observers
      // of the ball, such that when the ball coordinates
      // get updated, all observers are notified.
      if (e.getKeyCode() == KeyEvent.VK_RIGHT)
      {
         //TODO: Move the ball 5 pixels in the x direction
         System.out.println("User wants to move right");
      }
      else if (e.getKeyCode() == KeyEvent.VK_LEFT)
      {
         //TODO: Move the ball -5 pixels in the x direction
         System.out.println("User wants to move left");

      }
      else if (e.getKeyCode() == KeyEvent.VK_UP)
      {
         //TODO: Move the ball -5 pixels in the y direction
         System.out.println("User wants to move up");

      }
      else if (e.getKeyCode() == KeyEvent.VK_DOWN)
      {
         //TODO: Move the ball 5 pixels in the y direction
         System.out.println("User wants to move down");

      }

   }

   @Override
   public void keyReleased(KeyEvent e)
   {
      // we don't care about this
   }

   @Override
   public void keyTyped(KeyEvent e)
   {
      // we don't care about this
   }
}


