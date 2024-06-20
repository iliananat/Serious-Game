import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Agamemnon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Agamemnon extends Actor
{
    /**
     * Act - do whatever the Agamemnon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Agamemnon(){
        GreenfootImage img=new GreenfootImage("agamemnon.png");
        img.scale(img.getWidth()/9,img.getHeight()/8);
        setImage(img);
    }
}
