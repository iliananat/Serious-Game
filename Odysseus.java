import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Odysseus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Odysseus extends Actor
{
    /**
     * Act - do whatever the Odysseus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Odysseus(){
        GreenfootImage img=new GreenfootImage("odysseus.png");
        img.scale(img.getWidth()/4, img.getHeight()/4);
        setImage(img);
    }
}
