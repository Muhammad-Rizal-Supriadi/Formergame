import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{

    /**
     * Constructor for objects of class Level4.
     * 
     */
    private int Nyawa=3;
     public GreenfootSound bg1 = new GreenfootSound("level1.mp3");
    public Level4()
    {    
        super(2500, 600, 1); 
        prepare();
    }
     public void act(){
        //addEnemy1();
        addEnemy2();
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
         if(Greenfoot.getRandomNumber(100)<1)
         {
              addObject(new Enemy1(), Greenfoot.getRandomNumber(600),0);
         }
    }
     public void addEnemy2(){
         if(Greenfoot.getRandomNumber(100)<1)
         {
              addObject(new Enemy3(), Greenfoot.getRandomNumber(600),0);
         }
    }
     
    private void prepare()
    {

        Ground ground = new Ground();
        addObject(ground,54,544);
        ground.setLocation(130,574);
        Ground ground2 = new Ground();
        addObject(ground2,340,548);
        ground2.setLocation(381,559);
        ground2.setLocation(381,559);
        removeObject(ground2);
        Player player = new Player();
        addObject(player,143,500);
        player.setLocation(148,518);
        GroundMid groundMid = new GroundMid();
        addObject(groundMid,494,509);
        groundMid.setLocation(485,538);
        GroundMid groundMid2 = new GroundMid();
        addObject(groundMid2,594,519);
        groundMid2.setLocation(485,538);
        Ranjau ranjau = new Ranjau();
        addObject(ranjau,327,479);
        ranjau.setLocation(333,528);
        ranjau.setLocation(353,508);
        Coin coin = new Coin();
        addObject(coin,511,234);
        coin.setLocation(490,100);
        GroundHigh groundHigh = new GroundHigh();
        addObject(groundHigh,1100,67);
        GroundHigh groundHigh2 = new GroundHigh();
        addObject(groundHigh2,1100,154);
        Ground ground3 = new Ground();
        addObject(ground3,215,258);
        ground3.setLocation(1040,190);
        coin.setLocation(950,110);
        GroundMid groundMid3 = new GroundMid();
        addObject(groundMid3,713,500);
        groundMid3.setLocation(732,534);
        GroundMid groundMid4 = new GroundMid();
        addObject(groundMid4,728,395);
        groundMid4.setLocation(732,466);
        GroundMid groundMid5 = new GroundMid();
        addObject(groundMid5,934,430);
        groundMid5.setLocation(905,599);
        Ground ground4 = new Ground();
        addObject(ground4,1449,264);
        ground4.setLocation(1478,289);
        ground4.setLocation(1360,400);
        Awan awan = new Awan();
        addObject(awan,248,92);
        awan.setLocation(217,107);
        Awan awan2 = new Awan();
        addObject(awan2,586,235);
        awan2.setLocation(575,257);
        Awan awan3 = new Awan();
        addObject(awan3,842,72);
        awan3.setLocation(872,73);
        removeObject(awan2);

        addObject(awan2,608,257);
        awan2.setLocation(607,248);

        GroundHigh groundHigh3 = new GroundHigh();
        addObject(groundHigh3,1792,464);
        groundHigh3.setLocation(1861,536);
        Ground ground5 = new Ground();
        addObject(ground5,1966,389);
        ground5.setLocation(1963,440);
        GroundMid groundMid6 = new GroundMid();
        addObject(groundMid6,2075,343);
        groundMid6.setLocation(2064,406);
        GroundMid groundMid7 = new GroundMid();
        addObject(groundMid7,2063,277);
        groundMid7.setLocation(2064,337);
        Ground ground6 = new Ground();
        addObject(ground6,2135,259);
        ground6.setLocation(2148,304);
        ground6.setLocation(2160,305);
        Ground ground7 = new Ground();
        addObject(ground7,2373,317);
        ground7.setLocation(2380,305);
        SecretDoor secretDoor = new SecretDoor();
        addObject(secretDoor,2466,228);
        GroundMid groundMid8 = new GroundMid();
        addObject(groundMid8,1605,321);
        groundMid8.setLocation(1459,306);
        groundMid8.setLocation(1502,368);
        groundHigh3.setLocation(1834,530);
        groundHigh3.setLocation(1806,528);
        ground5.setLocation(1872,438);
        groundHigh3.setLocation(1852,527);
        groundHigh3.setLocation(1835,538);
        ground5.setLocation(1849,442);
        Ranjau ranjau2 = new Ranjau();
        addObject(ranjau2,1052,478);
        ranjau2.setLocation(1033,544);
        Ranjau ranjau3 = new Ranjau();
        addObject(ranjau3,1134,476);
        ranjau3.setLocation(1153,486);
        secretDoor.setLocation(2463,232);
        secretDoor.setLocation(2456,95);
        Coin coin2 = new Coin();
        addObject(coin2,483,204);
        coin2.setLocation(473,321);
        awan2.setLocation(571,241);
        Coin coin3 = new Coin();
        addObject(coin3,571,241);
        awan2.setLocation(537,264);
        awan2.setLocation(634,221);
        Coin coin4 = new Coin();
        addObject(coin4,634,221);
        awan2.setLocation(613,233);
        awan2.setLocation(714,267);
        Coin coin5 = new Coin();
        addObject(coin5,714,267);
        awan2.setLocation(695,291);
        coin3.setLocation(541,264);
        Coin coin6 = new Coin();
        addObject(coin6,1735,369);
        Coin coin7 = new Coin();
        addObject(coin7,1790,365);
        Coin coin8 = new Coin();
        addObject(coin8,1850,359);
        coin8.setLocation(1851,363);
        Coin coin9 = new Coin();
        addObject(coin9,1606,106);
        Coin coin10 = new Coin();
        addObject(coin10,1679,103);
        Coin coin11 = new Coin();
        addObject(coin11,1644,150);
        coin11.setLocation(1639,156);
        Coin coin12 = new Coin();
        addObject(coin12,1263,307);
        Coin coin13 = new Coin();
        addObject(coin13,1332,307);
        coin13.setLocation(1326,306);
        Coin coin14 = new Coin();
        addObject(coin14,1387,297);
        coin14.setLocation(1390,308);
        Counter counter = new Counter();
        addObject(counter,78,49);
        Awan awan4 = new Awan();
        addObject(awan4,2220,113);
        Awan awan5 = new Awan();
        addObject(awan5,1929,113);
        Awan awan6 = new Awan();
        addObject(awan6,1857,279);
        coin9.setLocation(1596,94);
        Awan awan7 = new Awan();
        addObject(awan7,1596,94);
        Awan awan8 = new Awan();
        addObject(awan8,1343,143);
        Awan awan9 = new Awan();
        addObject(awan9,1104,324);
        Awan awan10 = new Awan();
        addObject(awan10,1575,266);
        awan3.setLocation(772,113);
        Awan awan11 = new Awan();
        addObject(awan11,772,113);
        awan9.setLocation(1033,346);
        groundMid8.setLocation(1502,362);
        removeObject(groundMid8);
        ground6.setLocation(2135,319);
        removeObject(ground6);
        groundMid6.setLocation(2047,361);
        removeObject(groundMid7);
        removeObject(groundMid6);
        addObject(ground6,1940,184);
        awan5.setLocation(1997,186);
        awan5.setLocation(2042,190);
        awan5.setLocation(2042,190);
        removeObject(counter);
        awan5.setLocation(2044,253);
        awan5.setLocation(2022,247);
        removeObject(ground6);
        awan5.setLocation(2088,305);
        GroundHigh groundHigh4 = new GroundHigh();
        addObject(groundHigh4,2088,305);
        removeObject(groundHigh4);
        GroundMid groundMid9 = new GroundMid();
        addObject(groundMid9,2138,456);
        groundMid9.setLocation(2042,229);
        removeObject(secretDoor);
        Pintu4 pintu4 = new Pintu4();
        addObject(pintu4,2441,128);
        MainLagi mainLagi = new MainLagi();
        addObject(mainLagi,17,347);
        mainLagi.setLocation(60,353);
        removeObject(ranjau);
        removeObject(ranjau3);
        removeObject(ranjau2);
        mainLagi.setLocation(17,368);
        mainLagi.setLocation(19,365);
        mainLagi.setLocation(40,364);
        Ranjau_3 ranjau_3 = new Ranjau_3();
        addObject(ranjau_3,586,585);
        ranjau_3.setLocation(608,589);
        Enemy5 enemy5 = new Enemy5();
        addObject(enemy5,833,201);
        awan10.setLocation(1625,304);
        Enemy5 enemy52 = new Enemy5();
        addObject(enemy52,1625,304);
        Enemy5 enemy53 = new Enemy5();
        addObject(enemy53,1229,470);
        Enemy5 enemy54 = new Enemy5();
        addObject(enemy54,2412,386);
        groundMid5.setLocation(914,464);
        groundMid5.setLocation(912,477);
        awan9.setLocation(969,416);
    }
    
    public int getNyawa(){
        return Nyawa;
    }
    public void updNyawa(){
        Nyawa--;
    }
}
