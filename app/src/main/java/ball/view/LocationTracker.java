package ball.view;

import javax.swing.*;
import ball.model.Ball;
import ball.Observer;

public class LocationTracker extends JPanel implements Observer
{
   private Ball ball;
   private JLabel locationLabel;
   public LocationTracker(Ball ball)
   {
      this.ball = ball;
      this.locationLabel = new JLabel();
      showLocation();
      this.add(locationLabel);
      this.ball.register(this);
   }

   public void update() {
      showLocation();
   }

   public void showLocation()
   {
      this.locationLabel.setText("("+ball.getX()+", "+ball.getY()+")");

   }
}
