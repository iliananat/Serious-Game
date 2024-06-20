import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    private long startTime;
    private int duration;
    
    public Message(String text, int d) {
        duration = d;
        setImage(new GreenfootImage(text, 24, Color.BLACK, new Color(0, 0, 0, 0)));
        startTime = System.currentTimeMillis();
    }
    public Message(String text){
        setImage(new GreenfootImage(text, 24, Color.BLACK, new Color(0, 0, 0, 0)));
    }
    public void act() {
        if (System.currentTimeMillis() >= startTime + duration * 1000 || Greenfoot.isKeyDown("enter")) {
            getWorld().removeObject(this);
        }
    }
}
