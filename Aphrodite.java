import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aphrodite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aphrodite extends God
{
    private boolean firstTime=true;
    /**
     * Act - do whatever the Aphrodite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public Aphrodite(){
        GreenfootImage img=new GreenfootImage("aphrodite.png");
        img.scale(img.getWidth()/20, img.getHeight()/20);
        setImage(img);
    }
}
