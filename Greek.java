import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Greek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Greek extends Actor
{
    private String text;
    /**
     * Act - do whatever the Greek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Greek(){
        GreenfootImage img=new GreenfootImage("greek.gif");
        img.scale(img.getWidth()/4, img.getHeight()/4);
        setImage(img);
    }
}
