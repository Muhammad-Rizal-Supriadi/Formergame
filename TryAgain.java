import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryAgain extends Actor
{
    /**
     * Act - do whatever the TryAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TryAgain(){
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
    }
    public void act() 
    {
       if(Greenfoot.mousePressed(this)){
           getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)Math.round(getImage().getHeight()*0.9));
       }
       if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new BackgroundAwal());
           ((Lose)getWorld()).bg1.stop();
           //((MyWorld)getWorld()).bg1.stop();
       }
    }    
}
