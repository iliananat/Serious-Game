import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eris extends God
{
    /**
     * Act - do whatever the Eris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Eris(){
        GreenfootImage img=new GreenfootImage("Eris.png");
        img.scale(img.getWidth()/5, img.getHeight()/5);
        img.mirrorHorizontally();
        setImage(img);
    }
}
