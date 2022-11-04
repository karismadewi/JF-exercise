import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class littleLadybug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class littleLadybug extends Actor
{
    /**
     * Act - do whatever the littleLadybug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void turnAtEdge()
    {
        turn(180);
    } //end if
    
    private boolean atRightEdge()
    {
        if(getX()>getWorld().getWidth()-20)
        return true;
        else
        return false;
    } //end method 
    public void act()
    {
        move(1);
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        turnAtEdge();
       /* if(atRightEdge()){
            setLocation(6, getY());
        }
        else if(atBottomEdge()){
            
        } */
    }
}
