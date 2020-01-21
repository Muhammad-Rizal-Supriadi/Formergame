import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends World
{

    /**
     * Constructor for objects of class Winner.
     * 
     */
    public GreenfootSound bg1 = new GreenfootSound("winning.mp3");
    public Winner()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 480, 1); 
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
        TryAgain tryAgain = new TryAgain();
        addObject(tryAgain,685,418);
        tryAgain.setLocation(708,431);
        removeObject(tryAgain);
        Main_lagi main_lagi = new Main_lagi();
        addObject(main_lagi,710,417);
    }
}
