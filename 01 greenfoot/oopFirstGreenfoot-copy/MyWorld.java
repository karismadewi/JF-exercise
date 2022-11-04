import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public hero hero = new hero();
    private void prepare()
    {
        addObject(hero,74,359);/*if the hero just one, just create a new object, outside the private void prepare 
        example : public hero hero = new hero(); */

        enemy enemy = new enemy();
        addObject(enemy,1166,343);
        enemy.setLocation(1136,360);
    }
    
     public int count=0;
    public void act()
    {
        for(int i=0; i<1; i++)
        {
        int y = Greenfoot.getRandomNumber(getHeight()-1);  
        int x = Greenfoot.getRandomNumber(getWidth()-1);
        
        addObject(new enemy(),x,y); 
        
        }
        
        
        
    }
 
}
