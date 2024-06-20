import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheWedding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheWedding extends World
{
    private GreenfootSound sound=new GreenfootSound("apple.mp3");
    private GreenfootSound sound2=new GreenfootSound("story.mp3");
    private boolean flag=true;
    /**
     * Constructor for objects of class TheWedding.
     * 
     */
    public TheWedding()
    {    
        super(1100, 600, 1); 
        prepare();
    }
    public void act(){
        if(flag){
            sound.playLoop();
            Greenfoot.delay(50);
            getBackground().drawImage(new GreenfootImage("Όλοι είναι καλεσμένοι στο γεγονός της χρονιάς, ", 30, null, null), 100, 40);
            Greenfoot.delay(75);
            //getBackground().drawImage(new GreenfootImage(" ο γάμος τους Πηλέα και της Θέτιδας", 36, null, null), 170, 100);
            //Greenfoot.delay(50);
            
            getBackground().drawImage(new GreenfootImage("τον γάμο του Πηλέα και της Θέτιδας", 30, null, null), 635, 40);
            Greenfoot.delay(75);
            Wedding wedding=new Wedding();
            addObject(wedding, 570, 485);
            Greenfoot.delay(75);
            getBackground().drawImage(new GreenfootImage("Όλοι εκτός από την θεά Έριδα.", 30, null, null), 100, 80);
            Greenfoot.delay(150);
            Eris eris=new Eris();
            addObject(eris, 100, 485);
            Greenfoot.delay(75);
            getBackground().drawImage(new GreenfootImage("Θέλοντας να τους εκδικηθεί που δεν την κάλεσαν,", 30, null, null), 100, 120);
            getBackground().drawImage(new GreenfootImage("ρίχνει το μήλο της στο γάμο", 30, null, null), 653, 120);
            Greenfoot.delay(120);
            Apple apple=new Apple();
            addObject(apple, 200, 542);
            Greenfoot.delay(75);
            removeObject(wedding);
            removeObject(eris);
            sound2.playLoop();
            sound.stop();
            getBackground().drawImage(new GreenfootImage("Αυτό ξεκίνησε την διαμάχη ανάμεσα στις θεές", 30, null, null), 100, 160);
            Greenfoot.delay(130);
            getBackground().drawImage(new GreenfootImage("Ήρα", 36, null, null), 380, 330);
            Greenfoot.delay(50);
            Hera hera=new Hera();
            addObject(hera, 415, 482);
            Greenfoot.delay(75);
            getBackground().drawImage(new GreenfootImage("Αφροδίτη", 36, null, null), 640, 330);
            Greenfoot.delay(50);
            Aphrodite aphrodite=new Aphrodite();
            addObject(aphrodite, 715, 487);
            Greenfoot.delay(75);
            getBackground().drawImage(new GreenfootImage("Αθηνά", 36, null, null), 900, 330);
            Greenfoot.delay(50);
            Athena athena=new Athena();
            addObject(athena, 950, 483);
            Greenfoot.delay(75);
            getBackground().drawImage(new GreenfootImage("Στην διαμάχη καλείται να δώσει τέλος ο Πάρης", 30, null, null), 100, 200);
            Greenfoot.delay(50);
            Paris paris=new Paris(false,0);
            addObject(paris, 100, 505);
            Greenfoot.delay(100);
            getBackground().drawImage(new GreenfootImage("Πάτησε το Enter για να συνεχίσεις", 30, null, null), 100, 260);
            flag=false;
        }
        if(Greenfoot.isKeyDown("Enter")){
            sound2.stop();
            Greenfoot.setWorld(new TheBeginning());
        }
    }
    public void prepare(){
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
}
