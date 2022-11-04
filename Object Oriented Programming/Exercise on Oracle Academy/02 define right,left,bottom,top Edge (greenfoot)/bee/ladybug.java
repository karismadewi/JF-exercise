import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ladybug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ladybug extends Actor
{
    /**
     * Act - do whatever the ladybug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean atTopEdge()
    {
        if(getY() < 6)
        return true;
        else
        return false;
    }
    
    private boolean atLeftEdge()
    {
        if(getX() < 6)
        return true;
        else
        return false; 
    }
    
    private boolean atRightEdge()
    {
        if(getX() > getWorld().getWidth() -20)
        return true;
        else 
        return false;
    }
    
    private boolean atBottomEdge()
    {
        if(getY() > getWorld().getHeight()-20)
            return true;
        else
            return false; 
    }
    public void act()
    {
        move(1);
        if(atRightEdge()){
            setLocation(6, getY());
        }
        else if(atLeftEdge()){
            setLocation(getWorld().getWidth()-20, getY());
        }
        else if(atTopEdge()){
            setLocation(getX(), getWorld().getHeight()-20);
        }
        else if (atBottomEdge()){
            setLocation(getX(), 6);
        }
        // Add your action code here.
    }
}
