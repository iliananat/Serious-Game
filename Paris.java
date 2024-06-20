import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paris extends Actor
{
    GifImage gifImage=new GifImage("right walk.gif");
    private GreenfootSound sound=new GreenfootSound("apple.mp3");
    private GreenfootSound won=new GreenfootSound("win.wav");
    private boolean firstTime=true;
    public static int goddess;
    private Apple carriedObject;
    public static boolean carriesApple;
    private boolean firstKey;
    private int speed=4;
    private boolean rightdirection=true;
    private int vSpeed = 0;
    public static int life;
    private int acceleration = 1;
    private int jumpHeight = -12;
    private boolean canMove;
    private int level;
    private boolean touchAthena;
    private boolean touchHera;
    private boolean touchAthenaWithApple;
    private boolean touchHeraWithApple;
    private boolean touchAphrodite;
    public static boolean touchAphroditeWithApple;
    /**
     * Act - do whatever the Paris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(firstTime && level==1){
            goddess=0;
            firstKey=false;
            canMove=true;
            carriesApple=false;
            sound.playLoop();
            firstTime=false;
            touchAthena=false;
            touchHera=false;
            touchAthenaWithApple=false;
            touchHeraWithApple=false;
            touchAphrodite=false;
            touchAphroditeWithApple=false;
        }
        /*
        if(canMove){
            checkKeys();
            checkFalling();
            loseLife();
            nextLevel();
            goToNextLevel();
        }
        */
        /*
         if(carriesApple && goddess==1){
            if(Greenfoot.isKeyDown("Enter")){
                sound.stop();
                Greenfoot.setWorld(new Story());
            }
        }
        */
        if(level==1){
            if(carriesApple==false || goddess!=1){
                checkKeys();
                checkFalling();
                loseLife();
                nextLevel();
            }else{
                if(Greenfoot.isKeyDown("Enter")){
                    sound.stop();
                    Greenfoot.setWorld(new Story());
                }
            }
        }
        
    }
    public Paris(boolean canMove, int level){
        this.canMove=canMove;
        this.level=level;
        life=3;
        GreenfootImage img=new GreenfootImage(gifImage.getCurrentImage());
        img.scale(img.getWidth()/4,img.getHeight()/4);
        setImage(img);
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            firstKey=false;
            setLocation(getX() + speed, getY());
            GreenfootImage img=new GreenfootImage(gifImage.getCurrentImage());
            img.scale(img.getWidth()/4,img.getHeight()/4);
            if(rightdirection==false){
                //turn( 180 ); 
                img.mirrorHorizontally();
            }
            setImage(img);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            firstKey=false;
            setLocation(getX() - speed, getY());
            GreenfootImage img=new GreenfootImage(gifImage.getCurrentImage());
            img.scale(img.getWidth()/4,img.getHeight()/4);
            if(rightdirection){
                //turn( 180 );
                img.mirrorHorizontally();
            }
            setImage(img);
        }
        if (Greenfoot.isKeyDown("space") && (onGround() == true))
        {
            firstKey=false;
            vSpeed = jumpHeight;
            fall();
            //Greenfoot.playSound("jump.wav");
        }
        checkForObject();
        
        if (carriedObject != null) {
            carriedObject.setLocation(getX(), getY());
        }
    }
    private void checkForObject() {
        if (carriedObject == null) {
            Actor object = getOneIntersectingObject(Apple.class);
            if (object != null) {
                carriedObject = (Apple) object;
                carriesApple=true;
            }
        }
    }
    private boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0,(getImage().getHeight()/2)-5,Ground.class);
        
        return under != null;
    }
    private void fall()
    {
        setLocation(getX(),getY()+ vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    private void checkFalling()
    {
        if (onGround() == false)
        {
            fall();
        }
    }
    public boolean touchSpike(){
        return(isTouching(Spike.class));
    }
    public void loseLife(){
        if(isTouching(Spike.class)){
            life=life-1;
            sound.stop();
            Greenfoot.playSound("death.wav");
            Greenfoot.delay(100);
            if(life>0){
                sound.playLoop();
                setLocation(350,444);
            }else{
                sound.stop();
            }
        }
    }
    public void nextLevel(){
        Message message1 = new Message("Πάρε πρώτα το μήλο της Έριδος", 2);
        if(isTouching(Aphrodite.class)){
            if(carriesApple){
                goddess=1;
                touchAphroditeWithApple=true;
                Start.score=Start.score+20;
                won.play();
                Message message = new Message("Σωστά! Ο Πάρης έδωσε το μήλο της Έριδος στην θεά Αφροδίτη,", 20);
                getWorld().addObject(message, 570, 60);
                Message message2 = new Message("την θεά του έρωτα και την ομορφότερη από όλες", 20);
                getWorld().addObject(message2, 570, 80);
                Greenfoot.delay(50);
                Actor apple = getOneIntersectingObject(Apple.class);
                getWorld().removeObject(apple);
                Greenfoot.delay(150);
                message = new Message("Η θεά Αφροδίτη ως αντάλλαγμα του δίνει την πιο όμορφη γυναίκα", 20);
                getWorld().addObject(message, 570, 100);
                Greenfoot.delay(150);
                message = new Message("την ωραία Ελένη της Τροίας.", 20);
                getWorld().addObject(message, 570, 120);
                Greenfoot.delay(150);
                message = new Message("Πάτησε το Enter για να συνεχίσεις", 20);
                getWorld().addObject(message, 570, 160);
            }else{
                if(touchAphrodite==false){
                    touchAphrodite=true;
                    Start.mistakes++;
                    Start.score=Start.score-4;
                }
                getWorld().addObject(message1, 550, 100);
            }
        }else if(isTouching(Athena.class)){
            //touchAthena=true;
            if(carriesApple){
                if(touchAthenaWithApple==false){
                    touchAthenaWithApple=true;
                    Start.mistakes++;
                    Start.score=Start.score-4;
                }
                goddess=2;
                Message message = new Message("Η θεά Αθηνά είναι η θεά της σοφίας.", 2);
                getWorld().addObject(message, 550, 60);
                Message message2 = new Message("Ο Πάρης δεν έδωσε το μήλο σε αυτήν", 2);
                getWorld().addObject(message2, 550, 80);
            }else if(carriesApple==false){
                if(touchAthena==false){
                    touchAthena=true;
                    Start.mistakes++;
                    Start.score=Start.score-4;
                }
                getWorld().addObject(message1, 550, 100);
            }
        }else if(isTouching(Hera.class)){
            if(carriesApple){
                if(touchHeraWithApple==false){
                    touchHeraWithApple=true;
                    Start.mistakes++;
                    Start.score=Start.score-4;
                }
                goddess=3;
                Message message = new Message("Η θεά Ήρα είναι η σύζυγος του Δία και θεά του γάμου.", 2);
                getWorld().addObject(message, 550, 100);
                Message message2 = new Message("Ο Πάρης δεν έδωσε το μήλο σε αυτήν", 2);
                getWorld().addObject(message2, 550, 120);
            }else if (carriesApple==false){
                if(touchHera==false){
                    touchHera=true;
                    Start.mistakes++;
                    Start.score=Start.score-4;
                }
                getWorld().addObject(message1, 550, 100);
            }
        }
    }
    public void goToNextLevel(){
        if(Greenfoot.isKeyDown("Enter")){
            if(carriesApple && goddess==1){
                sound.stop();
                Greenfoot.setWorld(new Story());
            }
        }
    }
}
