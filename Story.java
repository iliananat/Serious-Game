import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story extends World
{
    private GreenfootSound sound=new GreenfootSound("story.mp3");
    private boolean flag=true;

    /**
     * Constructor for objects of class Story.
     * 
     */
    public Story()
    {    
        super(1100, 600, 1); 
        prepare();
    }

    public void act(){
        if(flag){
            sound.playLoop();
            Greenfoot.delay(50);
            getBackground().drawImage(new GreenfootImage("Ο Πάρης ταξιδεύει στην Σπάρτη και παίρνει την ωραία Ελένη.", 36, null, null), 120, 100);
            Greenfoot.delay(100);
            Helen helen = new Helen();
            addObject(helen,273,490);
            Paris paris = new Paris(false,2);
            addObject(paris,155,505);
            Greenfoot.delay(75);
            paris.setLocation(252,505);
            Greenfoot.delay(50);
            removeObject(paris);
            removeObject(helen);
            
            getBackground().drawImage(new GreenfootImage("Αυτό εξοργίζει τον σύζυγο της, Μενέλαο.", 36, null, null), 120, 150);
            Greenfoot.delay(100);
            Menelaos menelaos = new Menelaos();
            addObject(menelaos,700,492);
            Greenfoot.delay(75);
            getBackground().drawImage(new GreenfootImage("Με τον αδερφό του, Αγαμέμνονα,", 36, null, null), 120, 200);
            Greenfoot.delay(75);
            Agamemnon agamemnon = new Agamemnon();
            addObject(agamemnon,800,498);
            Greenfoot.delay(75);
            getBackground().drawImage(new GreenfootImage("συγκεντρώνουν έναν μεγάλο στρατό", 36, null, null), 570, 200);
            getBackground().drawImage(new GreenfootImage("για να πάρουν πίσω την Ελένη.", 36, null, null), 120, 230);
            Greenfoot.delay(120);
            Greek greek1 = new Greek();
            addObject(greek1,900,500);
            Greek greek2 = new Greek();
            addObject(greek2,950,500);
            Greek greek3 = new Greek();
            addObject(greek3,1000,500);
            Greek greek4 = new Greek();
            addObject(greek4,1050,500);
            Greenfoot.delay(100);
            getBackground().drawImage(new GreenfootImage("Έτσι ξεκινάει ο Τρωικός Πόλεμος", 40, null, null), 120, 350);
            Greenfoot.delay(130);
            getBackground().drawImage(new GreenfootImage("Πάτησε Enter για να συνεχίσεις", 36, null, null), 120, 500);
            flag=false;
        }
        if(Greenfoot.isKeyDown("Enter")){
            sound.stop();
            Greenfoot.setWorld(new War());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Paris p=new Paris(false,2);
        p.carriesApple=false;
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
