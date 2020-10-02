import processing.core.PApplet;
public class Star 
{
    private int myX, myY;
    private PApplet app;
    public Star(PApplet applet)
    {
        app = applet;
        myX = (int)(Math.random() * app.width);
        myY = (int)(Math.random()  * app.height);
        
    }
    
    public void show()
    {
        app.fill(255, 255, 255);
        app.ellipse(myX, myY, 5, 4);
    }
}
