import processing.core.PApplet;
public class Bullet extends Floater
{
   
    public Bullet(PApplet app ,Spaceship ship)
    {
        super(app);
        myCenterX = ship.getX();
        myCenterY = ship.getY();
        double dRadians = ship.myPointDirection * (Math.PI / 180);
        myVelocityX = 5 * Math.cos(dRadians) + ship.getVelocityX();
        myVelocityY = 5 * Math.sin(dRadians) + ship.getVelocityY();
        myColor = 238;
        
        
        //xCorners = sX;
        //yCorners = sY;
    }
    
    public void setX(int x) 
    {
        myCenterX = x;
    }

    public int getX()
    {
        return (int)myCenterX;
    }

    public void setY(int y)  
    {
        myCenterY = y;
    }

    public int getY()   
    {
        return (int)myCenterY;
    }
    public void setVelocityX(double x)
    {
        myVelocityX = x;
    }

     public double getVelocityX()
     {
         return myVelocityX;
        }

    public void setVelocityY(double y)
    {
        myVelocityY = y;
    }
    public double getVelocityY()  
    {
        return myVelocityY;
    }
    public void setPointDirection(int degrees)   
    {
        myPointDirection = degrees;
    }
    public double getPointDirection()
    {
        return myPointDirection;
    }
    
    public void show()
    {
        
        applet.fill(myColor);
        applet.stroke(myColor);
        applet.ellipse((float)myCenterX, (float)myCenterY, (float)20, (float)20);
        
    }
}
    
    
   