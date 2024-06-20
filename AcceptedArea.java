import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AcceptedArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AcceptedArea extends Actor
{
    /**
     * Act - do whatever the AcceptedArea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public AcceptedArea(){
        GreenfootImage img=new GreenfootImage("transparent.png");
        img.scale(img.getWidth()/20,img.getHeight()/12);
        setImage(img);
    }
}
