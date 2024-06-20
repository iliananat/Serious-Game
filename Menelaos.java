import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menelaos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menelaos extends Actor
{
    /**
     * Act - do whatever the Menelaos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Menelaos(){
        GreenfootImage img=new GreenfootImage("menelaos.png");
        img.scale(img.getWidth()/10,img.getHeight()/8);
        setImage(img);
    }
}
