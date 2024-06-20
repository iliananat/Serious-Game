import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hector extends Actor
{
    /**
     * Act - do whatever the Hector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Hector(){
        GreenfootImage img=new GreenfootImage("hector.png");
        img.scale(img.getWidth()/2,img.getHeight()/2);
        setImage(img);
    }
}
