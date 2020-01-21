import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    private int Nyawa=3;
    public GreenfootSound bg1 = new GreenfootSound("level1.mp3");
    public Level3()
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
         if(Greenfoot.getRandomNumber(60)<1)
         {
              addObject(new Enemy1(), Greenfoot.getRandomNumber(600),0);
         }
    }
    public void addEnemy2(){
         if(Greenfoot.getRandomNumber(60)<1)
         {
              addObject(new Enemy2(), Greenfoot.getRandomNumber(600),0);
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
        awan.setLocation(101,30);
        removeObject(counter);
        groundMid.setLocation(494,516);
        groundMid3.setLocation(705,472);
        removeObject(groundMid4);
        removeObject(groundMid3);
        awan2.setLocation(678,332);
        Ground_Atas ground_Atas = new Ground_Atas();
        addObject(ground_Atas,678,332);
        awan2.setLocation(730,352);
        groundHigh.setLocation(1080,96);
        removeObject(groundHigh);
        groundHigh2.setLocation(1099,98);
        removeObject(groundHigh2);
        removeObject(ground3);
        Ground_Atas ground_Atas2 = new Ground_Atas();
        addObject(ground_Atas2,1084,170);
        ground_Atas2.setLocation(1109,335);
        ground4.setLocation(1362,408);
        removeObject(ground4);
        groundMid8.setLocation(1494,375);
        removeObject(groundMid8);
        awan9.setLocation(1315,380);
        ranjau2.setLocation(1017,511);
        ranjau3.setLocation(1561,466);
        ranjau3.setLocation(1565,487);
        ranjau2.setLocation(1051,509);
        ground5.setLocation(1816,453);
        removeObject(ground5);
        removeObject(groundHigh3);
        Ground_Atas ground_Atas3 = new Ground_Atas();
        addObject(ground_Atas3,1786,446);
        ground_Atas3.setLocation(1799,433);
        ground_Atas3.setLocation(1726,428);
        groundMid5.setLocation(989,554);
        ranjau2.setLocation(1144,499);
        groundMid5.setLocation(1018,549);
        ground_Atas2.setLocation(1365,459);
        coin12.setLocation(1279,374);
        coin13.setLocation(1333,374);
        coin14.setLocation(1397,372);
        groundMid6.setLocation(2071,401);
        removeObject(groundMid6);
        removeObject(groundMid7);
        removeObject(ground6);
        removeObject(ground7);
        ground_Atas3.setLocation(1875,457);
        coin8.setLocation(1907,387);
        coin7.setLocation(1860,380);
        coin6.setLocation(1820,383);
        awan10.setLocation(1623,322);

        addObject(groundMid3,1623,322);
        awan10.setLocation(1627,252);

        addObject(groundMid4,2134,262);
        groundMid4.setLocation(2147,260);
        Ground_Atas ground_Atas4 = new Ground_Atas();
        addObject(ground_Atas4,2398,438);
        ground_Atas4.setLocation(2413,409);
        groundMid.setLocation(494,509);
        removeObject(groundMid);
        Ground ground8 = new Ground();
        addObject(ground8,1679,583);
        ground8.setLocation(1255,595);
        ground8.setLocation(1651,583);
        ground8.setLocation(2131,575);
        Ground ground9 = new Ground();
        addObject(ground9,750,589);
        Ground ground10 = new Ground();
        addObject(ground10,1200,174);
        ground10.setLocation(1151,263);
        MainLagi mainLagi = new MainLagi();
        addObject(mainLagi,83,350);
        mainLagi.setLocation(97,349);
        mainLagi.setLocation(60,345);
        secretDoor.setLocation(2406,276);
        removeObject(secretDoor);
        Pintu3 pintu3 = new Pintu3();
        addObject(pintu3,2417,323);
        mainLagi.setLocation(50,350);
        mainLagi.setLocation(41,351);
        mainLagi.setLocation(40,356);
        removeObject(ranjau);
        removeObject(ranjau2);
        removeObject(ranjau3);
        Ranjau_2 ranjau_2 = new Ranjau_2();
        addObject(ranjau_2,383,578);
        ranjau_2.setLocation(398,584);
        ranjau_2.setLocation(619,620);
        ranjau_2.setLocation(598,592);
    }
    
    public int getNyawa(){
        return Nyawa;
    }
    public void updNyawa(){
        Nyawa--;
    }
}
