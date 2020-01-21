import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy4 extends Enemy
{
    /**
     * Act - do whatever the Enemy4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] images = new GreenfootImage[9];
    private int currentImage;
    
    public Enemy4(){
        images[0] = new GreenfootImage("br1.png");
        images[1] = new GreenfootImage("br2.png");
        images[2] = new GreenfootImage("br3.png");
        images[3] = new GreenfootImage("br4.png");
        images[4] = new GreenfootImage("br5.png");
        images[5] = new GreenfootImage("br6.png");
        images[6] = new GreenfootImage("br7.png");
        images[7] = new GreenfootImage("br8.png");
        images[8] = new GreenfootImage("br9.png");
        
        currentImage = 0;
    }
    public void act() 
    {
        move(-5);
        if(currentImage == 8){
            currentImage = 0;
        }else{
            currentImage++;
        }
        setImage(images[currentImage]);
        
        if(getX()==0){
            setLocation(2500,getY());
        }
    }    
}
