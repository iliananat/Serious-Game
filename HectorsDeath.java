import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HectorsDeath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HectorsDeath extends World
{
    private boolean firstTime=true;
    public static GreenfootSound sound=new GreenfootSound("apple.mp3");
    private int timer=1600;
    /**
     * Constructor for objects of class HectorsDeath.
     * 
     */
    public HectorsDeath()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        prepare();
    }
    
    public void prepare(){
        Cloud cloud = new Cloud();
        addObject(cloud,93,50);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,210,197);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,960,61);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,439,103);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,720,205);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,577,308);
        Cloud cloud7 = new Cloud();
        addObject(cloud7,1047,257);
        
        Wall wall = new Wall();
        addObject(wall,73,511);
        Wall wall1 = new Wall();
        addObject(wall1,205,511);
        Wall wall2 = new Wall();
        addObject(wall2,337,511);
        Wall wall3 = new Wall();
        addObject(wall3,469,511);
        Wall wall4 = new Wall();
        addObject(wall4,601,511);
        Wall wall5 = new Wall();
        addObject(wall5,733,511);
        Wall wall6 = new Wall();
        addObject(wall6,865,511);
        Wall wall7 = new Wall();
        addObject(wall7,997,511);
        Wall wall8 = new Wall();
        addObject(wall8,1100,511);

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
        
        HintButton hintButton = new HintButton(3);
        addObject(hintButton,1052,580);
    }

    public void act(){
        showText("Mistakes: "+Start.mistakes, 700, 25);
        showText("Score: "+Start.score, 900, 25);
        if(firstTime){
            sound.playLoop();
            Spear spear = new Spear();
            Greenfoot.delay(50);
            Message message = new Message("Ένα από τα σημαντικότερα γεγονότα ήταν η μονομαχία του Αχιλλέα", 10);
            addObject(message, 550, 80);
            Greenfoot.delay(75);
            Achilles achilles = new Achilles(true);
            addObject(achilles,700,488);
            Greenfoot.delay(75);
            message = new Message("με τον μεγαλύτερο ήρωα των Τρώων, τον Έκτορα.", 8);
            addObject(message, 550, 100);
            Greenfoot.delay(75);
            Hector hector = new Hector();
            addObject(hector,191,490);
            Greenfoot.delay(75);
            message = new Message("Η μονομαχία έλαβε μέρος έξω από τα τείχη της Τροίας.", 6);
            addObject(message, 550, 130);
            Greenfoot.delay(100);
            message = new Message("Η συμβολή της θεάς Αθηνάς θεωρείται καθοριστική.", 5);
            addObject(message, 550, 160);
            Greenfoot.delay(75);
            Athena athena = new Athena();
            addObject(athena,1040,488);
            addObject(spear,1020,488);
            sound.stop();
            firstTime=false;
        }
        showText("Remaining Time: "+timer/100, 500, 25);
        if(Spear.killedHector==false){
            timer--;
            if(timer<=0){
                Spear.sound.stop();
                Greenfoot.playSound("time's up.wav");
                Greenfoot.delay(180);
                Greenfoot.setWorld(new GameOver("time"));
            }
        }
        decreaseLife();
    }
    public void resetLife()
    {
        removeObjects(getObjects(Heart.class)); 
        Heart heart1 = new Heart();
        addObject(heart1, 50,25);
        Heart heart2 = new Heart();
        addObject(heart2, 100,25);
        Heart heart3 = new Heart();
        addObject(heart3, 150,25);
    }
    public void decreaseLife(){
        if(Achilles.life==3){
            resetLife();
        }
        if(Achilles.life==2){
            removeObjects(getObjects(Heart.class)); 
            Heart heart1 = new Heart();
            addObject(heart1, 50,25);
            Heart heart2 = new Heart();
            addObject(heart2, 100,25);
            Heart heart3 = new Heart();
            addObject(heart3, 150,25);
            GreenfootImage img = new GreenfootImage("heartEmpty.png");
            heart3.setImage(img);
        }
        if(Achilles.life==1){
            removeObjects(getObjects(Heart.class)); 
            Heart heart1 = new Heart();
            addObject(heart1, 50,25);
            Heart heart2 = new Heart();
            addObject(heart2, 100,25);
            Heart heart3 = new Heart();
            addObject(heart3, 150,25);
            GreenfootImage img = new GreenfootImage("heartEmpty.png");
            heart2.setImage(img);
            heart3.setImage(img);
        }
        if(Achilles.life==0){
            removeObjects(getObjects(Heart.class)); 
            Heart heart1 = new Heart();
            addObject(heart1, 50,25);
            Heart heart2 = new Heart();
            addObject(heart2, 100,25);
            Heart heart3 = new Heart();
            addObject(heart3, 150,25);
            GreenfootImage img = new GreenfootImage("heartEmpty.png");
            heart1.setImage(img);
            heart2.setImage(img);
            heart3.setImage(img);
            removeObjects(getObjects(Achilles.class));
            Greenfoot.delay(30);
            Spear.sound.stop();
            Greenfoot.delay(50);
            Greenfoot.setWorld(new GameOver("lives"));
        }
    }
}
