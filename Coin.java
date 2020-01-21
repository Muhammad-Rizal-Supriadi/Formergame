import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    private GreenfootImage[] images = new GreenfootImage[6];
    private int currentImage;
    
     public Coin(){
        getImage().scale(getImage().getWidth()/4,getImage().getHeight()/4);
        images[0] = new GreenfootImage("coin1.png");
        images[1] = new GreenfootImage("coin2.png");
        images[2] = new GreenfootImage("coin3.png");
        images[3] = new GreenfootImage("coin4.png");
        images[4] = new GreenfootImage("coin5.png");
        images[5] = new GreenfootImage("coin6.png");
        
        currentImage = 0;
    }
    private void animate(){
        //page 39 modul 3.10
        if(currentImage == 3){
            currentImage = 0;
        }else{
            currentImage++;
        }
        setImage(images[currentImage]);
    }
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animate();
        //Getscore();
          if(Greenfoot.isKeyDown("right")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("left")){
            move(4);
        }
        if(getX()==0)
        {
            getWorld().removeObject(this);
        }
    }    
    
    public void Getscore(){
        /*Actor Player = getOneIntersectingObject(Player.class);
        if(Player != null)
        {
            //getWorld().removeObject(Player);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }*/
        Actor coin = getOneIntersectingObject(Player.class);
        if(coin!=null)
        {
            getWorld().removeObject(coin);
             World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
    }
}
