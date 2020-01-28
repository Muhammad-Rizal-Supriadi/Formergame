import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    private int Nyawa=3;
    public GreenfootSound bg1 = new GreenfootSound("level1.mp3");
    public Level2()
    {    
        super(2500, 600, 1); 
        prepare();
    }
     public void act(){
        addEnemy1();
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
     
    private void prepare()
    {

        MainLagi mainLagi = new MainLagi();
        addObject(mainLagi,32,377);
        Ground ground = new Ground();
        addObject(ground,108,570);
        GroundMid groundMid = new GroundMid();
        addObject(groundMid,463,540);
        GroundMid groundMid2 = new GroundMid();
        addObject(groundMid2,737,541);
        GroundMid groundMid3 = new GroundMid();
        addObject(groundMid3,745,460);
        groundMid3.setLocation(738,455);
        GroundMid groundMid4 = new GroundMid();
        addObject(groundMid4,956,570);

        GroundHigh groundHigh = new GroundHigh();
        addObject(groundHigh,1091,62);
        Ground ground2 = new Ground();
        addObject(ground2,1040,155);
        Ground ground3 = new Ground();
        addObject(ground3,1391,408);

        Ground ground4 = new Ground();
        addObject(ground4,1907,406);
        GroundMid groundMid5 = new GroundMid();
        addObject(groundMid5,2293,540);
        Ground_Atas ground_Atas = new Ground_Atas();
        addObject(ground_Atas,2460,208);
        Ground_Atas ground_Atas2 = new Ground_Atas();
        addObject(ground_Atas2,2392,339);
        Pintu2 pintu2 = new Pintu2();
        addObject(pintu2,2468,141);
        Coin coin = new Coin();
        addObject(coin,488,348);
        Coin coin2 = new Coin();
        addObject(coin2,560,286);
        Coin coin3 = new Coin();
        addObject(coin3,656,258);
        Coin coin4 = new Coin();
        addObject(coin4,725,302);
        Coin coin5 = new Coin();
        addObject(coin5,981,53);
        Coin coin6 = new Coin();
        addObject(coin6,927,84);
        Coin coin7 = new Coin();
        addObject(coin7,1546,243);
        Coin coin8 = new Coin();
        addObject(coin8,1636,188);
        Coin coin9 = new Coin();
        addObject(coin9,1734,204);
        Coin coin10 = new Coin();
        addObject(coin10,1790,271);
        Coin coin11 = new Coin();
        addObject(coin11,2334,209);
        Coin coin12 = new Coin();
        addObject(coin12,2254,300);
        Coin coin13 = new Coin();
        addObject(coin13,2259,369);
        Coin coin14 = new Coin();
        addObject(coin14,2341,129);
        Ranjau ranjau = new Ranjau();
        addObject(ranjau,618,590);
        Player player = new Player();
        addObject(player,113,489);
        Ground_Atas ground_Atas3 = new Ground_Atas();
        addObject(ground_Atas3,1659,543);
    }
    
    public int getNyawa(){
        return Nyawa;
    }
    public void updNyawa(){
        Nyawa--;
    }
}
