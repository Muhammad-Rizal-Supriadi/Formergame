import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int Nyawa=3;
    Counter counter = new Counter();
    public GreenfootSound bg1 = new GreenfootSound("level1.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(1200, 600, 1); 
        prepare();
    }
    
    public Counter getCounter()
    {
        return counter;
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
    
    public void addEnemy1(){
         if(Greenfoot.getRandomNumber(60)<1)
         {
              addObject(new Enemy1(), Greenfoot.getRandomNumber(600),0);
         }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        MainLagi mainLagi = new MainLagi();
        addObject(mainLagi,30,360);
        Ground ground = new Ground();
        addObject(ground,95,571);
        GroundMid groundMid = new GroundMid();
        addObject(groundMid,484,559);
        groundMid.setLocation(440,538);
        Ground ground2 = new Ground();
        addObject(ground2,673,578);
        ground2.setLocation(763,565);
        ground2.setLocation(764,572);
        GroundMid groundMid2 = new GroundMid();
        addObject(groundMid2,1088,546);
        Ground_Atas ground_Atas = new Ground_Atas();
        addObject(ground_Atas,1169,573);
        ground_Atas.setLocation(1184,576);
        SecretDoor secretDoor = new SecretDoor();
        addObject(secretDoor,1162,511);
        Coin coin = new Coin();
        addObject(coin,227,455);
        Coin coin2 = new Coin();
        addObject(coin2,268,409);
        Coin coin3 = new Coin();
        addObject(coin3,315,361);
        Coin coin4 = new Coin();
        addObject(coin4,385,345);
        Coin coin5 = new Coin();
        addObject(coin5,446,386);
        Coin coin6 = new Coin();
        addObject(coin6,457,431);
        coin6.setLocation(448,290);
        Coin coin7 = new Coin();
        addObject(coin7,893,333);
        Coin coin8 = new Coin();
        addObject(coin8,956,322);
        Coin coin9 = new Coin();
        addObject(coin9,1027,332);
        Coin coin10 = new Coin();
        addObject(coin10,858,395);
        Coin coin11 = new Coin();
        addObject(coin11,1073,398);
        Player player = new Player();
        addObject(player,97,465);
        Ranjau_1 ranjau_1 = new Ranjau_1();
        addObject(ranjau_1,308,581);
        ranjau_1.setLocation(630,595);
       
    }
    
    public int getNyawa(){
        return Nyawa;
    }
    public void updNyawa(){
        Nyawa--;
    }
}
