import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;
public class AsteroidsGame extends PApplet 
{
    //your variable declarations here
    private Spaceship s;
    //private Star[] st;
    List<Asteroid> a = new ArrayList<>();
    private Star[] stars = new Star[200];//[200];
    List<Bullet> b = new ArrayList<>();
    public static void main(String[] args)
    {
        PApplet.main(new String[] {"AsteroidsGame"});
    }

    public void settings()
    {
        // your size() method here
        size(700, 700);

    }

    public void setup() 
    {
        //your code here
        s = new Spaceship(this);
        for (int i = 0; i < 25; i++)
        {

            a.add(i, new Asteroid(this));

        }

        for (int i = 0; i < stars.length; i++)
        {
            stars[i] = new Star(this); 
        }

    }
    public void draw() 
    {
        //your code here
        background(0, 0, 200);
        //ast.show();
        s.show();

        for (int i = 0; i < b.size(); i++)
        {

            b.get(i).show(); 
            b.get(i).move(); 

        }
        for (int i = 0; i < a.size(); i++)
        {
            int x = a.get(i).getX();
            int y = a.get(i).getY();
            for (int ab = 0; ab < b.size(); ab++)
            {

                float d = dist(x, y, b.get(ab).getX(), b.get(ab).getY());

                if (d < 20)
                {
                    b.remove(ab);

                    a.remove(i);
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < a.size(); i++)
        {
            a.get(i).show(); 
            a.get(i).move(); 

        }
        for (int i = 0; i < a.size(); i++)
        {
            float d = dist(a.get(i).getX(), a.get(i).getY(), s.getX(), s.getY());

            if (d < 20)
            {
                a.remove(i);
                i--;
            }
        }
        for (int i = 0; i < stars.length; i++)
        {
            stars[i].show();
        }
        if (keyPressed)
        {

            if (this.key == 'h')
            {
                s.rotate(-5);

            }

            else if (this.key == 'k')
            {
                s.rotate(5);

            }
            else if (this.key == 'u')
            {
                s.accelerate(0.9);
            }

            else if (this.key == 'j')
            {
                s.accelerate(-1);
            }

        }
        s.move();
        // Now we'll modify the program so that when our space ship strikes an asteroid, the asteroid is
        // removed from the ArrayList. Every time an asteroid moves find the distance between that asteroid
        // and the ship. Use processing's dist() function to find the distance between that asteroid and the ship.
        // If the distance is less than 20 remove the asteroid from the ArrayList. Otherwise, move and rotate the
        // asteroid normally. (If you used larger or smaller asteroids than those in the powerpoint, you will
        // need to change the distance to something larger or smaller than 20. See what looks best in your
        //situation.)

    }

    public void keyPressed()
    {
        if (this.key == 'l')
        {
            s.setX((int)(Math.random() * 500));
            s.setY((int)(Math.random() * 500));
            s.setVelocityX(0);
            s.setVelocityY(0);
            s.setPointDirection((int)(Math.random() * 360));
        }
        else if(this.key == 'i')
        {
            b.add(new Bullet(this, s));
            System.out.println(b.get(0).getVelocityX() + " " + b.get(0).getVelocityY());
            // draw();

        }
    }
}
