import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Question here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question extends Actor
{
    public static boolean answered;
    public static boolean reviewAnswers;
    private String question;
    private String answer;
    private boolean firstTime=true;
    public Question(String question) {
        this.question = question;
        answer="";
        updateImage();
    }
    public void prepare(){
        answered=false;
        reviewAnswers=false;
    }
    public void act() {
        if(firstTime){
            prepare();
            firstTime=false;
        }
        checkForInput();
        //checkQuestion();
    }
    private void checkForInput() {
        String key = Greenfoot.getKey();
        if (Greenfoot.isKeyDown("Enter")) {
            if(answered==false){
                checkQuestion();
            }
        } else if (key!= null && key.equals("backspace") && answer.length() > 0) {
            answer = answer.substring(0, answer.length() - 1);
            updateImage();
        } else {
            if(key!=null && key.length()==1){
                answer += key;
                updateImage();
            }
        }
    }
    /*
    private void checkForInput() {
        String key = Greenfoot.getKey();
        if (key != null) {
            if (key.equals("enter")) {
                if(answered==false){
                    checkQuestion();
                }
            } else if (key.equals("backspace") && answer.length() > 0) {
                answer = answer.substring(0, answer.length() - 1);
                updateImage();
            } else if (key.length() == 1) {
                answer += key;
                updateImage();
            }
        }
    }
    */
    private void updateImage() {
        String displayText = question + "\n" + answer;
        GreenfootImage image = new GreenfootImage(displayText, 24, Color.BLACK, Color.WHITE);
        setImage(image);
    }
    private void checkQuestion(){
        if(question.equals("Ποιο ήταν το αδύναμο σημείο του;")){
            if(answer.equals("φτέρνα") || answer.equals("φτερνα") || answer.equals("πτέρνα") || answer.equals("πτερνα")){
                if(answered==false){
                    answered=true;
                    Start.score=Start.score+10;
                }
                Message message = new Message("Πολύ σωστά! Το ευαίσθητο σημείο του ήταν η " + answer, 10);
                getWorld().addObject(message, 550, 80);
                message = new Message("γνωστή και ως αχίλλειος πτέρνα", 10);
                getWorld().addObject(message, 550, 95);
                Greenfoot.delay(100);
                message = new Message("Εκεί κατεύθυνε ο θεός Απόλλωνας το βέλος του Πάρη.", 10);
                getWorld().addObject(message, 550, 115);
                Greenfoot.delay(50);
                Bow bow = new Bow();
                getWorld().addObject(bow,217,498);
                Arrow arrow = new Arrow();
                getWorld().addObject(arrow,229,500);
            }else{
                DrawOption opt = new DrawOption(" Αυτό δεν είναι σωστό, προσπάθησε ξανά ");
                getWorld().addObject(opt,550,280);
                Start.score=Start.score-4;
                Greenfoot.delay(60);
                getWorld().removeObject(opt);
                Start.mistakes++;
            }
        }
        
    }
    public boolean getAnswer(){
        return answered;
    }
}
