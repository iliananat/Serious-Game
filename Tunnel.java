import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tunnel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tunnel extends Actor
{
    /**
     * Act - do whatever the Tunnel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Tunnel(){
        GreenfootImage img=new GreenfootImage("underground tunnel.jpg");
        img.scale(img.getWidth()/4, img.getHeight()/4);
        setImage(img);
    }
}
