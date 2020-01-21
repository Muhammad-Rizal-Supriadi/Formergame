import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    private int Skore = 0;
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        projectileMove();
        tembak();
        tembak2();
        tembak3();
        tembak4();
    }    
    
    public void projectileMove()
    {
        setLocation(getX(),getY()-5);
         if(getY()==0){
                setLocation(1000,-40);
            }
    }
    
    public void tembak(){
        Actor enemy = getOneIntersectingObject(Enemy1.class);
        if(enemy!=null)
        {
            getWorld().removeObject(enemy);
            Skore = Skore + 10;
        }
    }
    public void tembak2(){
        Actor enemy = getOneIntersectingObject(Enemy2.class);
        if(enemy!=null)
        {
            getWorld().removeObject(enemy);
            Skore = Skore + 10;
        }
    }
    public void tembak3(){
        Actor enemy = getOneIntersectingObject(Enemy3.class);
        if(enemy!=null)
        {
            getWorld().removeObject(enemy);
            Skore = Skore + 10;
        }
    }
     public void tembak4(){
        Actor enemy = getOneIntersectingObject(Enemy4.class);
        if(enemy!=null)
        {
            getWorld().removeObject(enemy);
            Skore = Skore + 10;
        }
    }
   
}
