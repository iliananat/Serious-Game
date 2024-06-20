import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DrawOption here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawOption extends Actor
{
    private String text;
    /**
     * Act - do whatever the DrawOption wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public DrawOption(String text){
        this.text=text;
        setImage(new GreenfootImage(text,22,Color.BLACK, Color.WHITE));
    }
}
