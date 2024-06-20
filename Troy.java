import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Troy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Troy extends Actor
{
    /**
     * Act - do whatever the Troy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Troy(){
        GreenfootImage img=new GreenfootImage("troy.gif");
        img.scale(img.getWidth()/4, img.getHeight()/4);
        setImage(img);
    }
}
