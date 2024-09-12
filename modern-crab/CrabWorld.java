// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm =  new  Worm();
        addObject(worm, 221, 119);
        Worm worm2 =  new  Worm();
        addObject(worm2, 406, 227);
        Worm worm3 =  new  Worm();
        addObject(worm3, 264, 205);
        Worm worm4 =  new  Worm();
        addObject(worm4, 392, 108);
        Worm worm5 =  new  Worm();
        addObject(worm5, 319, 338);
        Worm worm6 =  new  Worm();
        addObject(worm6, 154, 342);
        Worm worm7 =  new  Worm();
        addObject(worm7, 109, 219);
        Crab crab =  new  Crab();
        addObject(crab, 279, 139);
        Worm worm8 =  new  Worm();
        addObject(worm8, 450, 438);
        Worm worm9 =  new  Worm();
        addObject(worm9, 330, 440);
        Worm worm10 =  new  Worm();
        addObject(worm10, 86, 441);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 428, 412);
    }
}
