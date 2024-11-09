package ball.model;
/*
 *  Class that defines a point in 2D
 **/

import ball.Observer;
import java.util.ArrayList;

public class Ball
{
   protected int x;
   protected int y;
   protected int diameter = 50;
   protected ArrayList<Observer> observers = new ArrayList<>();

   public Ball()
   {
      this.x = 0;
      this.y = 0;
   }

   public Ball(int x, int y)
   {
      this.x = x;
      this.y = y;
   }

   public void setX(int x)
   {
      this.x = x;
   }

   public void setY(int y)
   {
      this.y = y;
   }

   public int getX()
   {
      return x;
   }

   public int getY()
   {
      return y;
   }

   public int getDiameter()
   {
      return diameter;
   }

   public void move(int xDistance, int yDistance)
   {
      this.x+=xDistance;
      this.y+=yDistance;
      notifyObservers();
   }

   public void adjustSize(int amount)
   {
      this.diameter+=amount;
      notifyObservers();
   }

   public void register(Observer observer) {
      observers.add(observer);
   }

   public void notifyObservers() {
      for (Observer o: observers) {
         o.update();
      }
   }
}
