import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CorrectAnswer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CorrectAnswer extends Actor
{
    private boolean firstTime=true;
    //private GreenfootSound sound=new GreenfootSound("Troy begins.mp3");
    public static boolean pressed=false;
    /**
     * Act - do whatever the CorrectAnswer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkForClick();
        if(pressed){
            if(Greenfoot.isKeyDown("Enter")){
                War.sound.stop();
                Greenfoot.setWorld(new HectorsDeath());
            }
        }
    }
    public CorrectAnswer(){
        GreenfootImage img=new GreenfootImage("border.png");
        img.scale(img.getWidth()/30,img.getHeight()/40);
        setImage(img);
    }
    public void checkForClick(){
        if(Greenfoot.mouseClicked(this)){
            //Message message = new Message("Σωστά! Ο Τρωικός Πόλεμος διήρκεσε 10 χρόνια", 20);
            //getWorld().addObject(message, 820, 310);
            getWorld().getBackground().drawImage(new GreenfootImage(" Σωστά! Ο Τρωικός Πόλεμος διήρκεσε 10 χρόνια ",24,Color.WHITE, Color.DARK_GRAY),610,260);
            Greenfoot.delay(75);
            Message message = new Message("Κατά την διάρκεια του πολέμου αναδείχθηκαν πολλοί", 20);
            getWorld().addObject(message, 820, 330);
            message = new Message("ήρωες όπως ο Αχιλλέας, ο Έκτορας και ο Οδυσσέας", 20);
            getWorld().addObject(message, 820, 350);
            Greenfoot.delay(75);
            message = new Message("Πάτησε το Enter για να συνεχίσεις", 20);
            getWorld().addObject(message, 820, 390);
            if(pressed==false){
                Start.score=Start.score+20;
                pressed=true;
            }
        }
    }
}
