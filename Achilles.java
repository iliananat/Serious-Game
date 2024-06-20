import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Achilles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Achilles extends Actor
{
    GifImage gifImage=new GifImage("achilles.gif");
    private int speed=4;
    private boolean rightdirection=true;
    private Spear carriedObject;
    public static boolean carriesSpear=false;
    private boolean canMove;
    private boolean touchHector=false;
    public static int life;
    private long lastExecutionTime=0;
    /**
     * Act - do whatever the Achilles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //takeSpear();
        if(canMove){
            checkKeys();
        }
        spearWarning();
        
    }
    public Achilles(boolean canMove){
        this.canMove=canMove;
        life=3;
        GreenfootImage img=new GreenfootImage(gifImage.getCurrentImage());
        img.scale(img.getWidth()/6,img.getHeight()/6);
        setImage(img);
    }
    public void spearWarning(){
        Actor hector = getOneIntersectingObject(Hector.class);
        if(hector!=null && carriesSpear==false){
            Message message = new Message("Πάρε πρώτα το δόρυ από την θεά Αθηνά", 4);
            getWorld().addObject(message, 500, 210);
            addMistake();
            loseLife();
            //if(touchHector==false){}
            //Start.mistakes++;
        }
    }
    private void addMistake(){
        long currentTime=System.currentTimeMillis();
        if(currentTime-lastExecutionTime>=3000){
            Start.mistakes++;
            Start.score=Start.score-4;
            lastExecutionTime=currentTime;
        }
    }
    public void loseLife(){
        if(isTouching(Hector.class)){
            life=life-1;
            Spear.sound.stop();
            Greenfoot.playSound("death.wav");
            Greenfoot.delay(100);
            if(life>0){
                Spear.sound.playLoop();
                setLocation(700,488);
            }else{
                Spear.sound.stop();
            }
        }
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
            GreenfootImage img=new GreenfootImage(gifImage.getCurrentImage());
            img.scale(img.getWidth()/6,img.getHeight()/6);
            if(rightdirection==false){
                img.mirrorHorizontally();
            }
            setImage(img);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
            GreenfootImage img=new GreenfootImage(gifImage.getCurrentImage());
            img.scale(img.getWidth()/6,img.getHeight()/6);
            if(rightdirection){
                img.mirrorHorizontally();
            }
            setImage(img);
        }
        checkForObject();
        
        if (carriedObject != null) {
            carriedObject.setLocation(getX(), getY());
        }
    }
    private void checkForObject() {
        if (carriedObject == null) { 
            Actor object = getOneIntersectingObject(Spear.class);
            if (object != null) {
                carriedObject = (Spear) object;
                carriesSpear=true;
            }
        }
    }
}
