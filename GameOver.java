import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private GreenfootSound sound=new GreenfootSound("game over.wav");
    private boolean firstTime=true;
    private String causedBy;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(String causedBy)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        this.causedBy=causedBy;
    }
    public void act(){
        prepare();
        if(firstTime){
            sound.play();
            firstTime=false;
        }
    }
    public void prepare(){
        if(causedBy.equals("lives")){
            getBackground().drawImage(new GreenfootImage(" ΤΕΛΕΙΩΣΑΝ ΟΙ ΖΩΕΣ  ", 80, Color.ORANGE, null),220,100);
        }else{
            getBackground().drawImage(new GreenfootImage(" ΤΕΛΟΣ ΧΡΟΝΟΥ  ", 80, Color.ORANGE, null),280,100);
        }
        getBackground().drawImage(new GreenfootImage(" ΣΚΟΡ =  " + Start.score +" ", 60, Color.WHITE, null),300,250);
        getBackground().drawImage(new GreenfootImage(" Λάθη = "+Start.mistakes+" ", 60, Color.RED, null),300,300);
    }
}
