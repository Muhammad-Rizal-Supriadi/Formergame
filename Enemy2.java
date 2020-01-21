import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public Enemy2(){
       
    }
    public void act() 
    {
        moveEnemy();
         if(getY()==599){
                setLocation(1000,-100);
            }
    }    
}
