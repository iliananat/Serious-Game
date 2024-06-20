import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hint extends Actor
{
    private long startTime;
    private int duration;
    
    public Hint(String text, int d) {
        duration = d;
        setImage(new GreenfootImage(text, 24, Color.RED, Color.LIGHT_GRAY));
        startTime = System.currentTimeMillis();
    }
    public void act() {
        if (System.currentTimeMillis() >= startTime + duration * 1000 || Greenfoot.isKeyDown("enter")) {
            getWorld().removeObject(this);
        }
    }
}
