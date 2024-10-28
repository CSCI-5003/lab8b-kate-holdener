package ball.model;
/*
 *  Class that defines a point in 2D
 **/

public class Ball
{
   protected int x;
   protected int y;
   protected int diameter = 50;

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
   }

   public void adjustSize(int amount)
   {
      this.diameter+=amount;
   }
}
