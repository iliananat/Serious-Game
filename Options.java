import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Options here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Options extends Actor
{
    private int option;
    /**
     * Act - do whatever the Options wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkForClick();
    }
    public Options(String option, int x, int y){
        GreenfootImage img=new GreenfootImage("border.png");
        img.scale(img.getWidth()/30,img.getHeight()/40);
        img.setColor(Color.BLACK);
        img.drawString(option,x,y);
        Message message = new Message(option, 50);
        //getWorld().addObject(message, x, y);
        setImage(img);
        /*
         * img.setColor(Color.DARK_GRAY);
        img.drawString(option, x, y);
        setImage(img);
         */
    }
    public Options(){
        GreenfootImage img=new GreenfootImage("border.png");
        img.scale(img.getWidth()/30,img.getHeight()/40);
        setImage(img);
    }
    public Options(int opt){
        option=opt;
        GreenfootImage img=new GreenfootImage("border.png");
        img.scale(img.getWidth()/30,img.getHeight()/40);
        setImage(img);
    }
    public void checkForClick(){
        if(Greenfoot.mouseClicked(this)){
            Start.mistakes++;
            //Message message = new Message("Λάθος απάντηση. Προσπάθησε ξανά", 3);
            //getWorld().addObject(message, 820, 260);
            getWorld().getBackground().drawImage(new GreenfootImage(" Λάθος απάντηση. Προσπάθησε ξανά ",24,Color.WHITE, Color.DARK_GRAY),650,260);
        }
    }
}
