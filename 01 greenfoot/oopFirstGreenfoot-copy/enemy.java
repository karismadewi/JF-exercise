import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public enemy()
    {
        setRotation(180);
    }
    public int speed=10;
    public void act()
    {
        move(speed);
        if(isAtEdge())
        {
            getWorld().removeObject(this); 
        }
    

        // Add your action code here.
    }
}
