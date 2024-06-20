import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spear extends Actor
{
    public static boolean killedHector=false;
    private boolean firstTime=true;
    public static GreenfootSound sound=new GreenfootSound("hector's death.mp3");
    private GreenfootSound won=new GreenfootSound("win.wav");
    /**
     * Act - do whatever the Spear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(firstTime){
            sound.playLoop();
            firstTime=false;
        }
        killHector();
        checkForNextLevel();
    }
    public Spear(){
        GreenfootImage img=new GreenfootImage("spear.jpg");
        img.scale(img.getWidth()/7, img.getHeight()/10);
        setImage(img);
    }
    public void killHector(){
        Actor hector = getOneIntersectingObject(Hector.class);
        if(hector!=null){
            won.play();
            getWorld().removeObject(hector);
            Message message = new Message("Σωστά, ο Αχιλλέας πήρε το δόρυ από την θεά Αθηνά", 40);
            getWorld().addObject(message, 550, 220);
            message = new Message("και με αυτό σκότωσε τον Έκτορα.", 40);
            getWorld().addObject(message, 550, 240);
            Start.score=Start.score+20;
            Greenfoot.delay(150);
            message = new Message("Στην συνέχεια έδεσε το σώμα του πίσω από το άρμα του", 40);
            getWorld().addObject(message, 550, 270);
            message = new Message("και το έσυρε γύρω από τα τείχη της Τροίας.", 40);
            getWorld().addObject(message, 550, 290);
            Greenfoot.delay(150);
            message = new Message("Αυτό δεν άρεσε στον θεό Απόλλωνα", 40);
            getWorld().addObject(message, 550, 340);
            Greenfoot.delay(150);
            message = new Message("Πάτησε το Enter για να συνεχίσεις", 40);
            getWorld().addObject(message, 550, 390);
            killedHector=true;
        }
    }
    public void checkForNextLevel(){
        if(Greenfoot.isKeyDown("Enter")){
            if(killedHector){
                sound.stop();
                Greenfoot.setWorld(new AchillesDeath());
            }
        }
    }
}
