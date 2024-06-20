import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AchillesDeath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AchillesDeath extends World
{
    private int timer=2100;
    private GreenfootSound achillesDeath=new GreenfootSound("apple.mp3");
    private HintButton hintButton;
    private static boolean firstTime;
    private static boolean questionAnswered;
    /**
     * Constructor for objects of class AchillesDeath.
     * 
     */
    public AchillesDeath()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        prepare();
    }
    
    public void prepare(){
        firstTime=true;
        questionAnswered=false;
        Cloud cloud = new Cloud();
        addObject(cloud,907,149);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,497,63);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,690,275);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,73,60);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,294,177);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,34,240);
        
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
        
    }

    public void act(){
        showText("Mistakes: "+Start.mistakes, 700, 25);
        showText("Score: "+Start.score, 900, 25);
        if(firstTime){
            achillesDeath.playLoop();
            hintButton = new HintButton(4);
            addObject(hintButton,1052,580);
            Greenfoot.delay(50);
            Message message = new Message("Επόμενη μονομαχία ήταν αυτή ανάμεσα στον Αχιλλέα", 10);
            addObject(message, 550, 80);
            Greenfoot.delay(75);
            Achilles achilles = new Achilles(false);
            addObject(achilles,900,488);
            //φτέρνα
            AcceptedArea accArea = new AcceptedArea();
            addObject(accArea,890,565);
            Greenfoot.delay(75);
            message = new Message("και τον Πάρη.", 10);
            addObject(message, 550, 100);
            Greenfoot.delay(75);
            Paris paris = new Paris(false,5);
            addObject(paris,191,506);
            Greenfoot.delay(75);
            message = new Message("Ο Αχιλλέας είχε ένα αδύναμο σημείο, το οποίο γνώριζε ο θεός Απόλλωνας.", 10);
            addObject(message, 550, 130);
            Greenfoot.delay(75);
            Apollo apollo = new Apollo();
            addObject(apollo,60,486);
            Greenfoot.delay(50);
            message = new Message("Με την βοήθεια του ο Πάρης σκότωσε τον Αχιλλέα.", 10);
            addObject(message, 550, 160);
            Greenfoot.delay(100);
            Question question = new Question("Ποιο ήταν το αδύναμο σημείο του;");
            addObject(question, 550, 200);
            //addObject(spear,1020,488);
            firstTime=false;
        }
        if(Question.answered && questionAnswered==false){
            achillesDeath.stop();
            removeObject(hintButton);
            HintButton hintButton1 = new HintButton(5);
            addObject(hintButton1,1052,580);
            questionAnswered=true;
        }
    }
}
