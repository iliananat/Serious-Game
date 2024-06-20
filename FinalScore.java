import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalScore extends World
{
    private GreenfootSound sound=new GreenfootSound("final score.mp3");
    /**
     * Constructor for objects of class FinalScore.
     * 
     */
    public FinalScore()
    {    
        super(1083, 620, 1);
        GreenfootImage bg = new GreenfootImage("final score.jpg");
        bg.scale(bg.getWidth()/3, bg.getHeight()/3);
        setBackground(bg);
        
        prepare();
    }
    public void act(){
        feedback();
        Greenfoot.delay(100);
        checkKeyPressed();
    }
    public void prepare(){
        sound.playLoop();
        getBackground().drawImage(new GreenfootImage(" ΣΚΟΡ =  " +Start.score+" ", 60, Color.WHITE, null),450,100);
        getBackground().drawImage(new GreenfootImage(" Λάθη = "+Start.mistakes+" ", 60, Color.RED, null),450,160);
    }
    public void feedback(){
        if(Start.score==100){
            getBackground().drawImage(new GreenfootImage(" Συγχαρητήρια, ξέρεις τα πάντα "+"\n"+
                                            " για τον Τρωικό Πόλεμο "+"\n"+"\n"+
                                            " Πάτησε το Enter για να παίξεις ξανά ", 40, Color.WHITE, Color.BLACK),290,300);
        }else if(Start.score>=92){
            getBackground().drawImage(new GreenfootImage(" Τα πήγες σχεδόν τέλεια " +"\n"+
                                            " Μπορείς να ξαναπαίξεις για να ανεβάσεις το σκορ σου "+"\n"+"\n"+
                                            " Πάτησε το Enter για να παίξεις ξανά ", 40, Color.WHITE, Color.BLACK),140,300);
        }else if(Start.score>=80){
            getBackground().drawImage(new GreenfootImage(" Αρκετά καλή προσπάθεια " +"\n"+
                                            " Μπορείς να ξαναπαίξεις για να ανεβάσεις το σκορ σου "+"\n"+"\n"+
                                            " Πάτησε το Enter για να παίξεις ξανά ", 40, Color.WHITE, Color.BLACK),140,300);
        }else{
            getBackground().drawImage(new GreenfootImage(" Χμμ μάλλον σε δυσκόλεψε λίγο το παιχνίδι " +"\n"+
                                            " Μπορείς να ξαναπαίξεις για να ανεβάσεις το σκορ σου "+"\n"+"\n"+
                                            " Πάτησε το Enter για να παίξεις ξανά ", 40, Color.WHITE, Color.BLACK),140,300);
        }
    }
    public void checkKeyPressed(){
        if(Greenfoot.isKeyDown("Enter")){
            sound.stop();
            Greenfoot.setWorld(new Start());
        }
    }
}
