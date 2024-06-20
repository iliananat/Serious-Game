import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class War here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class War extends World
{
    private boolean firstTime=true;
    public static GreenfootSound sound=new GreenfootSound("Troy begins.mp3");
    /**
     * Constructor for objects of class War.
     * 
     */
    public War()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        prepare();
    }
    
    public void prepare(){
        GreenfootImage grey=new GreenfootImage("light grey.png");
        grey.scale(grey.getWidth(), grey.getHeight());
        getBackground().drawImage(grey, -50, 0);

        GreenfootImage sky=new GreenfootImage("sky.jpg");
        sky.scale(sky.getWidth(), sky.getHeight());
        getBackground().drawImage(sky, 550, 0);

        getBackground().drawImage(new GreenfootImage("Τρώες", 36, null, null), 225, 50);
        getBackground().drawImage(new GreenfootImage("Έλληνες", 36, null, null), 775, 50);

        Ground ground = new Ground();
        addObject(ground,53,580);
        Ground ground2 = new Ground();
        addObject(ground2,159,580);
        Ground ground3 = new Ground();
        addObject(ground3,265,580);
        Ground ground4 = new Ground();
        addObject(ground4,371,580);
        Ground ground5 = new Ground();
        addObject(ground5,477,580);
        Ground ground6 = new Ground();
        addObject(ground6,583,580);
        Ground ground7 = new Ground();
        addObject(ground7,689,580);
        Ground ground8 = new Ground();
        addObject(ground8,795,580);
        Ground ground9 = new Ground();
        addObject(ground9,901,580);
        Ground ground10 = new Ground();
        addObject(ground10,1007,580);
        Ground ground11 = new Ground();
        addObject(ground11,1113,580);
        
        HintButton hintButton = new HintButton(2);
        addObject(hintButton,1052,580);
    }

    public void act(){
        showText("Mistakes: "+Start.mistakes, 700, 25);
        showText("Score: "+Start.score, 900, 25);
        if(firstTime){
            sound.playLoop();
            Options options = new Options();
            Options options2 = new Options();
            Options options3 = new Options();
            CorrectAnswer options4 = new CorrectAnswer();
            Options options5 = new Options();
            Greenfoot.delay(50);
            Message message = new Message("Οι Έλληνες με αρχηγούς τον Μενέλαο και τον Αγαμέμνονα", 10);
            addObject(message, 822, 100);
            Message message2 = new Message("καταφτάνουν στην Τροία.", 10);
            addObject(message2, 822, 120);
            Greenfoot.delay(30);
            Menelaos menelaos = new Menelaos();
            addObject(menelaos,648,492);
            Agamemnon agamemnon = new Agamemnon();
            addObject(agamemnon,705,497);
            Greenfoot.delay(45);
            Greek greek = new Greek();
            addObject(greek,1060,500);
            Greek greek1 = new Greek();
            addObject(greek1,1005,500);
            Greek greek2 = new Greek();
            addObject(greek2,840,500);
            Greek greek3 = new Greek();
            addObject(greek3,900,500);
            Greek greek4 = new Greek();
            addObject(greek4,950,500);
            Greenfoot.delay(75);
            Message message3 = new Message("Εκεί πολιορκούν την πόλη για πολλά χρόνια", 10);
            addObject(message3, 822, 150);
            Greenfoot.delay(30);
            Paris paris = new Paris(false,3);
            addObject(paris,454,505);
            Greenfoot.delay(45);
            Troy troy = new Troy();
            addObject(troy,40,502);
            Troy troy1 = new Troy();
            addObject(troy1,100,502);
            Troy troy2 = new Troy();
            addObject(troy2,150,502);
            Troy troy3 = new Troy();
            addObject(troy3,200,502);
            Troy troy4 = new Troy();
            addObject(troy4,250,502);
            Troy troy5 = new Troy();
            addObject(troy5,300,502);
            Greenfoot.delay(75);
            Message message4 = new Message("Πόσα χρόνια την πολιόρκησαν;", 40);
            addObject(message4, 822, 180);
        
            //create options
            //option 1
            
            addObject(options,675,220);
            Message opt1 = new Message("5", 50);
            addObject(opt1, 675, 220);
            //option 2
           
            addObject(options2,750,220);
            Message opt2 = new Message("7", 50);
            addObject(opt2, 750, 220);
            //option 3
           
            addObject(options3,825,220);
            Message opt3 = new Message("8", 50);
            addObject(opt3, 825, 220);
            //option 4
           
            addObject(options4,900,220);
            Message opt4 = new Message("10", 50);
            addObject(opt4, 900, 220);
            //option 5
            
            addObject(options5,975,220);
            Message opt5 = new Message("12", 50);
            addObject(opt5, 975, 220);
            firstTime=false;
        }

    }
    public void checkKeyPressed(){
        
    }
}
