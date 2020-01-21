import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lose extends World
{

    /**
     * Constructor for objects of class Lose.
     * 
     */
public GreenfootSound bg1 = new GreenfootSound("game_over.mp3");
    public Lose()
    {    
        
        super(800, 600, 1); 
        prepare();
    }

    public void act(){
       // addEnemy1();
        bg1.setVolume(95);
        bg1.playLoop();
    }
    
    //music and sound
    public void stopped(){
        bg1.setVolume(95);
        bg1.pause();
    }
    public void started(){
        bg1.setVolume(95);
        bg1.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,707,526);
        start.setLocation(721,520);
        removeObject(start);
        TryAgain tryAgain = new TryAgain();
        addObject(tryAgain,669,521);
        Start start2 = new Start();
        addObject(start2,80,536);
        removeObject(start2);
    }
}
