import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public hero()
    {
        
    }
    public int speed = 6;
    public void act()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-speed);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-speed,getY());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+speed,getY());
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+speed);
        }
              
        
        
        // public void act will runned 30times per second
    }
    
}
