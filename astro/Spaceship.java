import processing.core.PApplet;
public class Spaceship extends Floater  
{   
    public Spaceship(PApplet app)
    {
        super(app);
        //PApplet.main("Spaceship");
        //PApplet applet;
        corners = 3;
        int[] sX = {-8, 16, -8, -2};
        int[] sY = {-8, 0, 8, 0};
        xCorners = sX;
        yCorners = sY;
        myColor = 100;
        myCenterX = 0;
        myCenterY = 0;
        myVelocityX = 0.5;
        myVelocityY = 0.5;
        myPointDirection = 180;
    }
    
    public void setX(int x)
    {
        myCenterX = (double)x;
    }

    public int getX()
    {
        return (int)myCenterX;
    }

    public void setY(int y)
    {
        myCenterY = (double)y;
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
        myPointDirection = (double)degrees;
    }

    public double getPointDirection()
    {
        return myPointDirection;
    }
}