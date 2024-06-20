import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    private int timer=2000;
    private boolean killedAchilles=false;
    private boolean firstTime=true;
    private GreenfootSound achillesDeath=new GreenfootSound("The Death of Achilles.mp3");
    private GreenfootSound won=new GreenfootSound("win.wav");
    private long lastExecutionTime=0;
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(firstTime){
            achillesDeath.playLoop();
            firstTime=false;
        }
        getWorld().showText("Remaining Time: "+timer/100, 500, 25);
        getWorld().showText("Mistakes: "+Start.mistakes, 700, 25);
        checkKeys();
        if(killedAchilles==false){
            killAchilles();
            timer--;
            if(timer<=0){
                Greenfoot.playSound("time's up.wav");
                Greenfoot.delay(100);
                Greenfoot.setWorld(new AchillesDeath());
            }
        }else{
            nextLevel();
        }
    }
    public Arrow(){
        GreenfootImage img=new GreenfootImage("arrow final.png");
        img.scale(img.getWidth()/12, img.getHeight()/12);
        setImage(img);
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 5, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 5);
        }
    }
    public void killAchilles(){
        Actor acceptedarea = getOneIntersectingObject(AcceptedArea.class);
        Actor achilles = getOneIntersectingObject(Achilles.class);
        if(achilles!=null){
            if(acceptedarea!=null){
                won.play();
                getWorld().getBackground().drawImage(new GreenfootImage(" Πολύ σωστά! Έτσι σκοτώθηκε ο Αχιλλέας ",24,Color.WHITE, Color.DARK_GRAY),380,370);
                //Message message = new Message("Σωστά! Έτσι σκοτώθηκε ο Αχιλλέας", 5);
                //getWorld().addObject(message,550,370);
                getWorld().removeObject(achilles);
                Start.score=Start.score+10;
                Greenfoot.delay(100);
                Message message = new Message("Πάτησε το Enter για να συνεχίσεις", 20);
                getWorld().addObject(message,550,440);
                killedAchilles=true;
            }else{
                getWorld().getBackground().drawImage(new GreenfootImage(" Αυτό δεν είναι σωστό, προσπάθησε ξανά ",24,Color.WHITE, Color.DARK_GRAY),380,370);
                addMistake();
                //Message message = new Message("Αυτό δεν είναι σωστό, προσπάθησε ξανά", 5);
                //getWorld().addObject(message, 550, 330);
            }
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
    private void nextLevel(){
        if(Greenfoot.isKeyDown("Enter")){
            achillesDeath.stop();
            Greenfoot.setWorld(new TheEnd());
        }
    }
}
