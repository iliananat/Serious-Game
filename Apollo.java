import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apollo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apollo extends God
{
    /**
     * Act - do whatever the Apollo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Apollo(){
        GreenfootImage img=new GreenfootImage("apollo.png");
        img.scale(img.getWidth()/18, img.getHeight()/18);
        setImage(img);
    }
}
