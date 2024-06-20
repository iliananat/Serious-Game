import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeleteThis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheEnd extends World
{
    private GreenfootSound sound=new GreenfootSound("story.mp3");
    private boolean firstTime=true;
    private Troy troy = new Troy();
    private Troy troy2 = new Troy();
    private Troy troy3 = new Troy();
    private TrojanHorse horse=new TrojanHorse();
    private Tunnel tunnel=new Tunnel();
    private DrawOption opt1 = new DrawOption(" Μεταμφιέστηκαν σε Τρώες ");
    private DrawOption opt2 = new DrawOption(" Κρύφτηκαν σε ένα μεγάλο ξύλινο άλογο ");
    private DrawOption opt3 = new DrawOption(" Έσκαψαν ένα υπόγειο τούνελ ");
    private Message options;
    private boolean correctAnswer=false;
    /**
     * Constructor for objects of class TheEnd
     * 
     */
    public TheEnd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        prepare();
    }
    
    public void prepare(){
        Cloud cloud = new Cloud();
        addObject(cloud,48,229);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,342,45);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,586,145);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,836,95);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,1084,259);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,1040,4);
        Cloud cloud7 = new Cloud();
        addObject(cloud7,343,221);

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

        HintButton hintButton = new HintButton(6);
        addObject(hintButton,1052,580);
    }

    public void act(){
        showText("Mistakes: "+Start.mistakes, 700, 25);
        showText("Score: "+Start.score, 900, 25);
        if(firstTime){
            sound.playLoop();
            Greenfoot.delay(50);
            Message message = new Message("Στο φινάλε του Πολέμου, ο Οδυσσέας", 8);
            addObject(message, 550, 80);
            Greenfoot.delay(100);
            Odysseus odysseus = new Odysseus();
            addObject(odysseus,1025,480);
            Greenfoot.delay(75);
            message = new Message("καταστρώνει ένα σχέδιο και καταφέρνει να βάλει", 7);
            addObject(message, 550, 100);
            message = new Message("κρυφά τους Έλληνες στην Τροία", 7);
            addObject(message, 550, 120);
            Greenfoot.delay(120);
            message = new Message("Με ποιον τρόπο μπήκαν στην Τροία;", 6);
            addObject(message, 550, 150);
            
            Greenfoot.delay(100);
            addObject(troy,100,350);
            addObject(troy2,150,350);
            addObject(troy3,200,350);
            addObject(opt1,150,450);

            //message=new Message("Μεταμφιέστηκαν σε Τρώες", 3);
            //addObject(message,150,450);
            
            
            Greenfoot.delay(100);
            addObject(horse,490,300);
            addObject(opt2,490,450);
            
            Greenfoot.delay(100);
            addObject(tunnel,842,350);
            addObject(opt3,842,450);
            firstTime=false;
        }else{
            checkAnswer();
            if(correctAnswer){
                nextLevel();
            }
        }
    }
    public void checkAnswer(){
        if(Greenfoot.mouseClicked(horse)){
                removeObject(tunnel);
                removeObject(troy);
                removeObject(troy2);
                removeObject(troy3);
                removeObject(opt1);
                removeObject(opt3);
                checkNextLevel();
            }else if(Greenfoot.mouseClicked(tunnel) || Greenfoot.mouseClicked(troy) || Greenfoot.mouseClicked(troy2) || Greenfoot.mouseClicked(troy3)){
                DrawOption opt = new DrawOption(" Αυτό δεν είναι σωστό, προσπάθησε ξανά ");
                addObject(opt,550,500);
                Start.mistakes++;
                Start.score=Start.score-4;
                //Message message=new Message("Αυτό δεν είναι σωστό, προσπάθησε ξανά",5);
                //addObject(message,550,500);
                Greenfoot.delay(200);
                removeObject(opt);
                
            }
    }
    private void checkNextLevel(){
        Start.score=Start.score+20;
        Message message = new Message("Σωστά! Οι Έλληνες κρύφτηκαν μέσα στον Δούρρειο Ίππο και το έδωσαν σαν δώρο στους Τρώες", 3);
        addObject(message,550,80);
        Greenfoot.delay(150);
        message=new Message("Το βράδυ βγήκαν από το ξύλινο άλογο και τους επιτέθηκαν.", 3);
        addObject(message,550,110);
        Greenfoot.delay(150);
        message=new Message("Έτσι τελείωσε ο Τρωικός πόλεμος", 3);
        addObject(message,550,140);
        Greenfoot.delay(150);
        message=new Message("Πάτησε το Enter για να συνεχίσεις", 3);
        addObject(message,550, 500);
        correctAnswer=true;
    }
    private void nextLevel(){
        if(Greenfoot.isKeyDown("Enter")){
            sound.stop();
            Greenfoot.setWorld(new FinalScore());
        }
    }
}
