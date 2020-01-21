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
        addObject(mainLagi,87,349);
        mainLagi.setLocation(88,348);
        Ground ground = new Ground();
        addObject(ground,97,547);
        ground.setLocation(101,569);
        Ground ground2 = new Ground();
        addObject(ground2,441,569);
        ground2.setLocation(497,567);
        GroundMid groundMid = new GroundMid();
        addObject(groundMid,826,550);
        groundMid.setLocation(809,538);
        Ground_Atas ground_Atas = new Ground_Atas();
        addObject(ground_Atas,1070,473);
        ground_Atas.setLocation(1311,441);
        removeObject(ground_Atas);
        GroundMid groundMid2 = new GroundMid();
        addObject(groundMid2,1074,547);
        groundMid2.setLocation(1058,542);
        addObject(ground_Atas,1168,470);
        ground_Atas.setLocation(1089,460);
        ground_Atas.setLocation(1144,568);
        SecretDoor secretDoor = new SecretDoor();
        addObject(secretDoor,1156,503);
        Coin coin = new Coin();
        addObject(coin,247,409);
        Coin coin2 = new Coin();
        addObject(coin2,304,356);
        Coin coin3 = new Coin();
        addObject(coin3,370,414);
        coin3.setLocation(354,414);
        Coin coin4 = new Coin();
        addObject(coin4,610,409);
        Coin coin5 = new Coin();
        addObject(coin5,658,359);
        Coin coin6 = new Coin();
        addObject(coin6,725,319);
        Coin coin7 = new Coin();
        addObject(coin7,800,366);
        Coin coin8 = new Coin();
        addObject(coin8,1041,237);
        coin8.setLocation(1066,274);
        Coin coin9 = new Coin();
        addObject(coin9,1068,343);
        coin9.setLocation(1065,341);
        Coin coin10 = new Coin();
        addObject(coin10,1069,402);
        coin10.setLocation(1063,406);
        secretDoor.setLocation(1154,497);
        removeObject(secretDoor);
        Player player = new Player();
        addObject(player,90,417);
        mainLagi.setLocation(79,354);
        mainLagi.setLocation(30,369);
        SecretDoor secretDoor2 = new SecretDoor();
        addObject(secretDoor2,1135,495);
        Ranjau ranjau = new Ranjau();
        addObject(ranjau,335,578);
        ranjau.setLocation(349,586);
        ranjau.setLocation(677,594);
        ranjau.setLocation(661,590);
        removeObject(ranjau);
        ground2.setLocation(523,577);
        Ranjau_1 ranjau_1 = new Ranjau_1();
        addObject(ranjau_1,523,595);
        ground2.setLocation(534,583);
        ground2.setLocation(534,590);
        ground2.setLocation(475,590);
        ranjau_1.setLocation(468,584);
        ground2.setLocation(464,586);
        ranjau_1.setLocation(662,595);
        removeObject(ranjau_1);
        groundMid.setLocation(813,595);
        addObject(ranjau_1,813,595);
        groundMid.setLocation(813,595);
        groundMid.setLocation(824,591);
    }
    
    public int getNyawa(){
        return Nyawa;
    }
    public void updNyawa(){
        Nyawa--;
    }
}
