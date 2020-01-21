import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ranjau_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ranjau_1 extends Actor
{
    /**
     * Act - do whatever the Ranjau_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Ranjau_1(){
         getImage().scale(getImage().getWidth()*10,getImage().getHeight()/2);
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("left")){
            move(4);
        }
         if(getX()==0)
        {
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(100)+630);
        }
    }    
}
