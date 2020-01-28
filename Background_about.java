import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background_about here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background_about extends World
{
      public GreenfootSound bg1 = new GreenfootSound("about_help.mp3");
    /**
     * Constructor for objects of class Background_about.
     * 
     */
    public Background_about()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    public void act(){
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
        Back back = new Back();
        addObject(back,831,563);
        back.setLocation(670,557);
        back.setLocation(128,564);
    }
}
