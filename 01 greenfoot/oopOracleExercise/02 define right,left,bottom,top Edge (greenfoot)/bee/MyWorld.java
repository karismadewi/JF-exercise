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
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ladybug ladybug = new ladybug();
        addObject(ladybug,97,104);
        ladybug ladybug2 = new ladybug();
        addObject(ladybug2,357,107);
        ladybug ladybug3 = new ladybug();
        addObject(ladybug3,155,271);
        ladybug ladybug4 = new ladybug();
        addObject(ladybug4,403,271);
        ladybug3.setLocation(174,281);
        ladybug2.turn(90);
        ladybug3.turn(-90);
        ladybug4.turn(180); 
    }
}
