import processing.core.PApplet;
public class Asteroid extends Floater
{
    private int rot;
    public Asteroid(PApplet p)
    {
        super(p);
        //PApplet.main("Spaceship");
        //PApplet applet;

        corners = 6;
        xCorners = new int[corners];
        yCorners = new int[corners];
        xCorners[0] = -11;
        yCorners[0] = -8;
        xCorners[1] = 7;
        yCorners[1] = -8;
        xCorners[2] = 13;
        yCorners[2] = 0;
        xCorners[3] = 6;
        yCorners[3] = 10;
        xCorners[4] = -11;
        yCorners[4] = 8;
        xCorners[5] = -5;
        yCorners[5] = 0;
        myColor = 150;
        myCenterX = (Math.random() * 700);
        myCenterY = (Math.random() * 700);
        myVelocityX = (double)(Math.random() * 0.85);
        myVelocityY = (double)(Math.random() * 0.85);
        myPointDirection = 180;
        rot = (int)((Math.random() * 11) - 5);
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
        myVelocityX = (double)x;
    }

    public double getVelocityX()
    {
        return myVelocityX;
    }

    public void setVelocityY(double y)
    {
        myVelocityY = (double)y;
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
        return (double)myPointDirection;
    }
    //"Override" the move() method of the Floater class by writing a new move() method 
    //in the Asteroid class that also rotates each Asteroid at its own speed.
    public void move()
    {
        super.move();
        rotate(rot);

        //wrap around screen
    }
}
