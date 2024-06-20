import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Athena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Athena extends God
{
    /**
     * Act - do whatever the Athena wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public Athena(){
        GreenfootImage img=new GreenfootImage("athena.png");
        img.scale(img.getWidth()/20, img.getHeight()/20);
        setImage(img);
    }
}
