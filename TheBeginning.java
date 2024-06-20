import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Troy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheBeginning extends World
{
    private int timer=2600;
    /**
     * Constructor for objects of class Troy.
     * 
     */
    public TheBeginning()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        prepare();
        
        Paris paris = new Paris(true,1);
        addObject(paris,350,444);
        
        Apple apple = new Apple();
        addObject(apple,68,458);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cloud cloud5 = new Cloud();
        addObject(cloud5,951,87);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,119,298);
        Cloud cloud7 = new Cloud();
        addObject(cloud7,533,415);
        Cloud cloud8 = new Cloud();
        addObject(cloud8,385,58);
        

        Spike spike = new Spike();
        addObject(spike,60,592);
        Spike spike2 = new Spike();
        addObject(spike2,185,592);
        Spike spike3 = new Spike();
        addObject(spike3,310,592);
        Spike spike4 = new Spike();
        addObject(spike4,435,592);
        Spike spike5 = new Spike();
        addObject(spike5,560,592);
        Spike spike6 = new Spike();
        addObject(spike6,685,592);
        Spike spike7 = new Spike();
        addObject(spike7,810,592);
        Spike spike8 = new Spike();
        addObject(spike8,935,592);
        Spike spike9 = new Spike();
        addObject(spike9,1060,592);

        Ground ground = new Ground();
        addObject(ground,60,520);
        Ground ground2 = new Ground();
        addObject(ground2,165,520);
        Ground ground3 = new Ground();
        addObject(ground3,314,520);
        Ground ground4 = new Ground();
        addObject(ground4,419,520);
        Ground ground5 = new Ground();
        addObject(ground5,562,520);
        Ground ground6 = new Ground();
        addObject(ground6,705,520);
        Ground ground7 = new Ground();
        addObject(ground7,810,520);
        Ground ground8 = new Ground();
        addObject(ground8,934,520);
        Ground ground9 = new Ground();
        addObject(ground9,1040,520);
        //Apple apple = new Apple();
        //addObject(apple,68,458);
        //Paris paris = new Paris();
        //addObject(paris,350,444);
        Ground ground10 = new Ground();
        addObject(ground10,670,450);
        Ground ground11 = new Ground();
        addObject(ground11,780,385);
        Ground ground12 = new Ground();
        addObject(ground12,890,325);
        Ground ground13 = new Ground();
        addObject(ground13,780,268);
        Ground ground14 = new Ground();
        addObject(ground14,560,385);
        Ground ground15 = new Ground();
        addObject(ground15,450,325);
        Ground ground16 = new Ground();
        addObject(ground16,340,265);
        Ground ground17 = new Ground();
        addObject(ground17,230,205);
        Ground ground18 = new Ground();
        addObject(ground18,130,205);
        Ground ground19 = new Ground();
        addObject(ground19,674,200);
        Aphrodite aphrodite = new Aphrodite();
        addObject(aphrodite,140,115);
        Hera hera = new Hera();
        addObject(hera,1000,422);
        Athena athena = new Athena();
        addObject(athena,670,105);
        HintButton hintButton = new HintButton(1);
        addObject(hintButton,1052,558);
        ground12.setLocation(654,313);
        ground11.setLocation(903,226);
        ground10.setLocation(805,393);
        removeObject(athena);
        removeObject(ground19);
        removeObject(ground10);
        Ground ground20 = new Ground();
        addObject(ground20,1022,144);
        ground11.setLocation(931,202);
        removeObject(ground11);
        Ground ground21 = new Ground();
        addObject(ground21,897,216);
        ground14.setLocation(636,437);
        ground12.setLocation(527,379);
        Ground ground22 = new Ground();
        addObject(ground22,729,381);
        ground13.setLocation(843,316);
        ground21.setLocation(924,255);
        ground20.setLocation(1010,188);
        ground20.setLocation(1083,211);
        ground21.setLocation(1003,251);
        ground13.setLocation(893,314);
        ground22.setLocation(788,384);
        ground14.setLocation(653,447);
        addObject(ground20,1056,201);
        addObject(ground21,983,263);
        Athena athena2 = new Athena();
        addObject(athena2,1051,110);
        
    }
    public void act(){
        showText("Remaining Time: "+timer/100, 500, 25);
        showText("Mistakes: "+Start.mistakes, 700, 25);
        showText("Score: "+Start.score, 900, 25);
        if(Paris.touchAphroditeWithApple==false){
            timer--;
            if(timer<=0){
                Greenfoot.playSound("time's up.wav");
                Greenfoot.delay(180);
                Greenfoot.setWorld(new GameOver("time"));
            }
            decreaseLife();
        }
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
        if(Paris.life==3){
            resetLife();
        }
        if(Paris.life==2){
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
        if(Paris.life==1){
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
        if(Paris.life==0){
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
            Greenfoot.delay(30);
            removeObjects(getObjects(Paris.class));
            Greenfoot.delay(50);
            Greenfoot.setWorld(new GameOver("lives"));
        }
    }
}
