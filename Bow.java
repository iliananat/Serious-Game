import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bow extends Actor
{
    /**
     * Act - do whatever the Bow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Bow(){
        GreenfootImage img=new GreenfootImage("bow final.png");
        img.scale(img.getWidth()/5, img.getHeight()/5);
        img.mirrorHorizontally();
        setImage(img);
    }
}
