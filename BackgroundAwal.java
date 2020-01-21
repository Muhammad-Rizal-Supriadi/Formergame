import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackgroundAwal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundAwal extends World
{

    /**
     * Constructor for objects of class BackgroundAwal.
     * 
     */
    //Game-menu.mp3
    public GreenfootSound bg1 = new GreenfootSound("Game-Menu.mp3");
    public BackgroundAwal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    public void act(){
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

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,651,341);
        Exit exit = new Exit();
        addObject(exit,604,478);
        exit.setLocation(662,460);
        exit.setLocation(457,500);
        Help help = new Help();
        addObject(help,213,416);
        help.setLocation(191,471);
        exit.setLocation(457,492);
        exit.setLocation(459,482);
        removeObject(exit);
        start.setLocation(742,530);
        help.setLocation(53,541);
        help.setLocation(57,531);
        help.setLocation(62,540);
        help.setLocation(62,540);
        Gaya1 gaya1 = new Gaya1();
        addObject(gaya1,105,123);
        start.setLocation(394,553);
        Gaya2 gaya2 = new Gaya2();
        addObject(gaya2,266,131);
        gaya2.setLocation(262,167);
        gaya2.setLocation(262,184);
        gaya1.setLocation(109,200);
        gaya2.setLocation(287,185);
        Gaya3 gaya3 = new Gaya3();
        addObject(gaya3,433,195);
        gaya3.setLocation(431,233);
        Gaya4 gaya4 = new Gaya4();
        addObject(gaya4,524,307);
        gaya4.setLocation(544,314);
        Gaya5 gaya5 = new Gaya5();
        addObject(gaya5,647,378);
        gaya5.setLocation(644,414);
        Gaya6 gaya6 = new Gaya6();
        addObject(gaya6,724,502);
        gaya6.setLocation(720,500);
        gaya2.setLocation(273,159);
        gaya3.setLocation(407,231);
        gaya4.setLocation(535,310);
        gaya6.setLocation(698,514);
        help.setLocation(80,553);
        About about = new About();
        addObject(about,616,547);
        gaya6.setLocation(745,368);
        about.setLocation(714,530);
        about.setLocation(875,523);
        about.setLocation(908,545);
        start.setLocation(526,551);
        gaya2.setLocation(295,114);
        gaya3.setLocation(454,178);
        gaya4.setLocation(605,285);
        gaya6.setLocation(882,282);
        gaya5.setLocation(749,392);
        about.setLocation(907,543);
        about.setLocation(907,540);
    }
}
