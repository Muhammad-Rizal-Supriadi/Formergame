import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
public class Player extends Actor
{
    private GreenfootImage myImage = getImage();
    private String[] imageNames = {"vector1.png","vector2.png","vector3.png","vector4.png","vector5.png","vector6.png"};
    private int currentImage = 0;
    int xPos;
    int yPos;
    
    public void addedToWorld(World w){
        xPos = getX();
        yPos = getY();
    }
    
    private int NyawaPlayer = 3;
    private int Skore = 0;
    private int vSpeed = 3;
    private int acceleration = 1;
    private int jumpHeight= -23;
    private int collect = 0;
    boolean TenCoinsCollected = false;
    boolean canFire = true;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player(){
        getImage().scale(getImage().getWidth()/4,getImage().getHeight()/4);
    }
    public void act() 
    {
        animateOnMove();
       moveAround();
       //fall();
       checkFalling();
       collect();
       SecondLevel();
       tampil();
       nyawa();
       //tampil2();
       //kenaMusuh();
       ThirdLevel();
       //Death();
       //Death2();
       FourLevel();
       Finnish();
       FiveLevel();
       fireProjectile();
       if(Greenfoot.isKeyDown("left")){
           setLocation(getX()-1,getY());
       }
       if(Greenfoot.isKeyDown("right")){
           setLocation(getX()+1,getY());
       }
    }  
    
    private void animateOnMove(){
        if(getX()!=xPos || getY()!=yPos)
        {
            currentImage++;
            if(currentImage >= imageNames.length)
                currentImage=0;
                
            GreenfootImage newImage = new GreenfootImage(imageNames[currentImage]);
            
            if(getX()<xPos)
                newImage.mirrorHorizontally();
                
             setImage(newImage);
             myImage=getImage();
        }
        xPos = getX();
        yPos = getY();
    }
    
    private void fall(){
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    public void moveAround(){
       
        if(Greenfoot.isKeyDown("space")&&(onGround()==true)){
            vSpeed = jumpHeight;
            fall();
        }
         if(Greenfoot.isKeyDown("space")&&(onGround2()==true)){
            vSpeed = jumpHeight;
            fall();
        }
         if(Greenfoot.isKeyDown("space")&&(onGround3()==true)){
            vSpeed = jumpHeight;
            fall();
        }
        if(Greenfoot.isKeyDown("space")&&(onGroundAtas()==true)){
            vSpeed = jumpHeight;
            fall();
        }
         if(Greenfoot.isKeyDown("space")&&(MainLagi()==true)){
            vSpeed = jumpHeight;
            fall();
        }
    }
    boolean onGround(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return under != null;
    }
     boolean onGround2(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, GroundMid.class);
        return under != null;
    }
     boolean onGround3(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, GroundHigh.class);
        return under != null;
    }
    boolean onGroundAtas(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground_Atas.class);
        return under != null;
    }
     boolean MainLagi(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, MainLagi.class);
        return under != null;
    }
    private void checkFalling(){
        if(onGround()== false || onGround2()==false || onGround3()==false || onGroundAtas()==false || MainLagi()==false){
            fall();
        }
        if(onGround()== true || onGround2()==true || onGround3()==true || onGroundAtas()==true || MainLagi()==true){
            vSpeed = 0;
        }
       
    }
    public void collect(){
        Actor coin = getOneIntersectingObject(Coin.class);
        if(coin!=null)
        {
            getWorld().removeObject(coin);
            Skore = Skore + 10;
            Greenfoot.playSound("coin.mp3");
        }
        if(collect==4 && TenCoinsCollected==false)
        {
            getWorld().addObject(new SecretDoor(), 100, 500);
            TenCoinsCollected = true;
        }
    }
    
     private void tampil(){
        //MyWorld mywl = (MyWorld)getWorld();
        //Level2 myw2 = (Level2)getWorld();
        //getWorld().showText("posisi x="+ getX() +"dan posisi y="+ getY(), 150, 50);
       // getWorld().showText("nyawa="+mywl.getNyawa(), 100, 100);
        getWorld().showText("nyawa=" +NyawaPlayer, 100, 100);
        
        getWorld().showText("Skore=" +Skore, 100, 150);
    }
    
 
    public void SecondLevel(){
        Actor secretDoor = getOneIntersectingObject(SecretDoor.class);
        if(secretDoor!=null)
        {
            Greenfoot.setWorld(new Level2());
            ((MyWorld)getWorld()).bg1.stop();
        }
    }
    
    public void ThirdLevel(){
        Actor Pintu2 = getOneIntersectingObject(Pintu2.class);
        if(Pintu2!=null)
        {
            Greenfoot.setWorld(new Level3());
            ((Level2)getWorld()).bg1.stop();
        }
    }
    
    public void FourLevel(){
        Actor Pintu3 = getOneIntersectingObject(Pintu3.class);
        if(Pintu3!=null)
        {
            Greenfoot.setWorld(new Level4());
            ((Level3)getWorld()).bg1.stop();
        }
    }
    
    public void FiveLevel(){
        Actor Pintu4 = getOneIntersectingObject(Pintu4.class);
        if(Pintu4!=null)
        {
            Greenfoot.setWorld(new Level5());
            ((Level4)getWorld()).bg1.stop();
        }
    }
    
     public void Finnish(){
        Actor Finish = getOneIntersectingObject(Finish.class);
        if(Finish!=null)
        {
            Greenfoot.setWorld(new Winner());
             ((Level5)getWorld()).bg1.stop();
        }
    }
    
    public void fireProjectile(){
        if(Greenfoot.isKeyDown("shift") && canFire == true)
        {
            getWorld().addObject(new Projectile(),getX(),getY()-30);
            canFire = false;
        }else if(!Greenfoot.isKeyDown("shift"))
        {
            canFire = true;
        }
    }
    
    public void nyawa(){
        if(isTouching(Enemy1.class)){
            Greenfoot.playSound("mati.mp3");
             setLocation(20,274);
            NyawaPlayer = NyawaPlayer -1 ;
            if(NyawaPlayer < 1){
                Greenfoot.setWorld(new Lose());
                ((Level2)getWorld()).bg1.stop();
            }
        }
         if(isTouching(Ranjau.class)){
            Greenfoot.playSound("mati.mp3");
            setLocation(20,274);
            NyawaPlayer = NyawaPlayer -1 ;
            if(NyawaPlayer < 1){
                Greenfoot.setWorld(new Lose());
                ((Level2)getWorld()).bg1.stop();
            }
        }
        if(isTouching(Ranjau_1.class)){
             Greenfoot.playSound("mati.mp3");
            setLocation(20,274);
            NyawaPlayer = NyawaPlayer -1 ;
            if(NyawaPlayer < 1){
                Greenfoot.setWorld(new Lose());
                ((MyWorld)getWorld()).bg1.stop();
            }
        }
        if(isTouching(Ranjau_2.class)){
             Greenfoot.playSound("mati.mp3");
            setLocation(20,274);
            NyawaPlayer = NyawaPlayer -1 ;
            if(NyawaPlayer < 1){
                Greenfoot.setWorld(new Lose());
                ((Level3)getWorld()).bg1.stop();
            }
        }
        if(isTouching(Ranjau_3.class)){
             Greenfoot.playSound("mati.mp3");
            setLocation(20,274);
            NyawaPlayer = NyawaPlayer -1 ;
            if(NyawaPlayer < 1){
                Greenfoot.setWorld(new Lose());
                ((Level4)getWorld()).bg1.stop();
            }
        }
         if(isTouching(Ranjau_4.class)){
              Greenfoot.playSound("mati.mp3");
            setLocation(20,274);
            NyawaPlayer = NyawaPlayer -1 ;
            if(NyawaPlayer < 1){
                Greenfoot.setWorld(new Lose());
                ((Level5)getWorld()).bg1.stop();
            }
        }
         if(isTouching(Enemy2.class)){
              Greenfoot.playSound("mati.mp3");
            //setLocation(148,570);
             setLocation(20,274);
            NyawaPlayer = NyawaPlayer -1 ;
            if(NyawaPlayer < 1){
                Greenfoot.setWorld(new Lose());
                ((Level3)getWorld()).bg1.stop();
            }
        }
        if(isTouching(Enemy3.class)){
             Greenfoot.playSound("mati.mp3");
             setLocation(20,274);
            NyawaPlayer = NyawaPlayer -1 ;
            if(NyawaPlayer < 1){
                Greenfoot.setWorld(new Lose());
                ((Level4)getWorld()).bg1.stop();
            }
        }
        if(isTouching(Enemy4.class)){
             Greenfoot.playSound("mati.mp3");
             setLocation(20,274);
            NyawaPlayer = NyawaPlayer -1 ;
            if(NyawaPlayer < 1){
                Greenfoot.setWorld(new Lose());
                ((Level5)getWorld()).bg1.stop();
            }
        }
        if(isTouching(Enemy5.class)){
             Greenfoot.playSound("mati.mp3");
             setLocation(20,274);
            NyawaPlayer = NyawaPlayer -1 ;
            if(NyawaPlayer < 1){
                Greenfoot.setWorld(new Lose());
                ((Level4)getWorld()).bg1.stop();
            }
        }
    }
    
    private void endGame(){
        Greenfoot.stop();
    }
    
    public void kenaMusuh(){
        if(isTouching(Enemy1.class)){
            MyWorld mywl = (MyWorld)getWorld();
            mywl.updNyawa();
            
            if(mywl.getNyawa()<1){
                Greenfoot.setWorld(new Lose());
            }   
            setLocation(148,600);
        }
    }
    
    public void Death()
    {
        if(getY() >= 530 && NyawaPlayer >=1)
        {
            NyawaPlayer--;
            setLocation(20,274);
        }
        
        if(NyawaPlayer == 0)
            {
              Greenfoot.setWorld(new Lose());
              ((MyWorld)getWorld()).bg1.stop();
             // ((Level2)getWorld()).bg1.stop();
              //Greenfoot.stop();
               //Greenfoot.playSound("gameover.mp3");
              // getWorld().addObject(new YouLose(), getWorld().getWidth() /  2, getWorld().getHeight() / 2);
            //getWorld().showText("Skore=" +Skore, 100, 150);
            }
    }
    
   
    public void Death2()
    {
        if(getY() >= 530 && NyawaPlayer >=1)
        {
            NyawaPlayer--;
            setLocation(20,274);
        }
      
        
        if(NyawaPlayer == 0)
            {
              Greenfoot.setWorld(new Lose());
              ((Level2)getWorld()).bg1.stop();
             // ((Level2)getWorld()).bg1.stop();
              //Greenfoot.stop();
               //Greenfoot.playSound("gameover.mp3");
              // getWorld().addObject(new YouLose(), getWorld().getWidth() /  2, getWorld().getHeight() / 2);
            //getWorld().showText("Skore=" +Skore, 100, 150);
            }
    }
   
}
