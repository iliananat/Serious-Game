import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Helen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helen extends Actor
{
    /**
     * Act - do whatever the Helen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Helen(){
        GreenfootImage img=new GreenfootImage("helen.png");
        img.scale(img.getWidth()/2, img.getHeight()/2);
        setImage(img);
    }
}
