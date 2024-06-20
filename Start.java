import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    private GreenfootSound sound=new GreenfootSound("Start screen.mp3");
    private boolean firstTime=true;
    public static int score;
    public static int mistakes;
    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        super(1000, 680, 1);
        GreenfootImage bg = new GreenfootImage("start blurry.jpg");
        bg.scale(bg.getWidth()/2, bg.getHeight()/2);
        setBackground(bg);
        prepare();
    }
    private void prepare(){
        firstTime=true;
        mistakes=0;
        score=0;
        sound.playLoop();
        getBackground().drawImage(new GreenfootImage(" ΤΡΟΙΑ ",90,Color.WHITE, new Color(100,100,100,200)),400,50);
        getBackground().drawImage(new GreenfootImage(" Πάτησε το Enter για να ξεκινήσεις την περιπέτεια "+"\n"+
                        " Πάτησε το spacebar για να δεις τις οδηγίες ",38,Color.ORANGE, new Color(100,230,120,200)),160,242);
        /*
        GreenfootImage bg = getBackground();
        Font font = bg.getFont();
        bg.setColor(Color.WHITE);
        bg.setFont(font.deriveFont(90));
        bg.drawString("START GAME", 100, 100);
        bg.setFont(font.deriveFont(28));
        bg.drawString("PRESS ENTER TO CONTINUE", 100, 140);
        bg.drawString("PRESS SPACEBAR TO SEE INSTRUCTIONS", 100, 180);
        */
    }
    public static void main(String[] args){
    }
    
    public void act(){
        /*
        if(firstTime){
            sound.playLoop();
            firstTime=false;
        }
        */
        nextLevel();
        if(Greenfoot.isKeyDown("space") && firstTime){
            firstTime=false;
            showInstructions();
        }
    }
    private void nextLevel(){
        if(Greenfoot.isKeyDown("Enter")){
            sound.stop();
            Greenfoot.setWorld(new TheWedding());
        }
    }
    private void showInstructions(){
        for(int i=0;i<2;i++){
            getBackground().drawImage(new GreenfootImage("Ετοιμάσου να ζήσεις από κοντά τον Τρωικό Πόλεμο."+"\n"+
                        "Κάθε επίπεδο αναλογεί και σε ένα σημαντικό συμβάν του πολέμου."+"\n"+
                        "Αν κολλήσεις, πάτησε το κουμπί"+"\n"+
                        "Έχεις 2 βοήθειες σε κάθε γρίφο."+"\n"+"\n"+
                        "Καλή διασκέδαση!",30,Color.BLACK, new Color(200,200,200,100)),130,400);
        }
        //getBackground().drawImage(new GreenfootImage("Αν κολλήσεις, πάτησε το κουμπί", 24, Color.WHITE, Color.GRAY), 100,280);
        HintButton button=new HintButton(0);
        addObject(button,736,474);
        //getBackground().drawImage(new GreenfootImage("Σε κάθε επίπεδο έχεις 2 βοήθειες", 24, Color.WHITE, Color.GRAY), 100,310);
        //getBackground().drawImage(new GreenfootImage("Καλή διασκέδαση!", 24, Color.WHITE, Color.GRAY), 100,340);
    }
}
