import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HintButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HintButton extends Actor
{
    private int level;
    private int timesClicked;
    /**
     * Act - do whatever the HintButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkForClick();
    }
    public void prepare(){
        //timesClicked=0;
    }
    public HintButton(int level){
        this.level=level;
        GreenfootImage img=new GreenfootImage("hint.png");
        img.scale(img.getWidth()/5,img.getHeight()/5);
        setImage(img);
        img.drawImage(new GreenfootImage("Βοήθεια", 22, null, null), 18, 40);
        timesClicked=0;
        //img.drawString("Βοήθεια", _int_, _int_)
    }
    public void checkForClick(){
        if(Greenfoot.mouseClicked(this)){
            timesClicked++;
            int t=timesClicked%2;
            if(level==1){
                if(t==1){
                    String hint="Βοήθησε τον Πάρη να δώσει το μήλο της Έριδος στην ομορφότερη Θεά"+"\n"+"Για να μετακινηθείς χρησιμοποίησε τα πλήκτρα βέλους (arrow keys)";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 550, 70);
                }else{
                    String hint="Πάρε το μήλο και δώσε το στην θεά Αφροδίτη";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 550, 110);
                }
            }else if(level==2){
                if(t==1){
                    String hint="Χρησιμοποίησε το ποντίκι για να επιλέξεις"+"\n"+"την σωστή απάντηση";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 822, 70);
                }else{
                    String hint="Ο Τρωικός Πόλεμος διήρκησε όσο ο μικρότερος"+"\n"+"διψήφιος αριθμός";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 822, 110);
                }
            }else if(level==3){
                if(t==1){
                    String hint="Ζήτα την βοήθεια της θεάς Αθηνάς για να σκοτώσεις τον Έκτορα"+"\n"+"Για να μετακινηθείς χρησιμοποίησε τα πλήκτρα βέλους (arrow keys)";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 550, 70);
                }else{
                    String hint="Πάρε το δόρυ από την θεά Αθηνά και με αυτό σκότωσε τον Έκτορα";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 550, 110);
                }
            }else if(level==4){
                if(t==1){
                    String hint="Το μοναδικό μη αθάνατο σημείο του Αχιλλέα."+"\n"+"Χρησιμοποίησε το πληκτρολόγιο για να γράψεις";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 550, 70);
                }else{
                    String hint="Χρησιμοποιείται συχνά η φράση 'Αχίλλειος ______' για να δείξει"+"\n"+"την αδυναμία ενός ισχυρού ανθρώπου ή πράγματος";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 550, 110);
                }
            }else if(level==5){
                if(t==1){
                    String hint="Χρησιμοποίησε τα πλήκτρα βέλους (arrow keys)"+"\n"+"για να κατευθύνεις το βέλος στον Αχιλλέα";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 550, 70);
                }else{
                    String hint="Βρες το κατάλληλο σημείο ώστε"+"\n"+"να πετύχεις την φτέρνα του Αχιλλέα";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 550, 110);
                }
            }else if(level==6){
                if(t==1){
                    String hint="Το μέσο που χρησιμοποιήσαν οι Έλληνες για να μπουν στην Τροία."+"\n"+"Χρησιμοποιήσε το ποντίκι για να το επιλέξεις";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 550, 70);
                }else{
                    String hint="Το τέχνασμα αυτό ονομάζεται Δούρειος Ίππος"+"\n"+"και οι Έλληνες κρύφτηκαν μέσα σε αυτό";
                    Hint message = new Hint(hint, 3);
                    getWorld().addObject(message, 550, 110);
                }
            }
        }
    }
}
