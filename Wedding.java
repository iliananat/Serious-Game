import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wedding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wedding extends Actor
{
    /**
     * Act - do whatever the Wedding wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Wedding(){
        GreenfootImage img=new GreenfootImage("wedding.gif");
        img.scale(img.getWidth()/3, img.getHeight()/3);
        setImage(img);
    }
}
