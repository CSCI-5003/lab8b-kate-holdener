package ball.view;

import javax.swing.*;
import ball.model.Ball;

public class LocationTracker extends JPanel
{
   private Ball ball;
   private JLabel locationLabel;
   public LocationTracker(Ball ball)
   {
      this.ball = ball;
      this.locationLabel = new JLabel();
      showLocation();
      this.add(locationLabel);
   }

   public void showLocation()
   {
      this.locationLabel.setText("("+ball.getX()+", "+ball.getY()+")");

   }
}
