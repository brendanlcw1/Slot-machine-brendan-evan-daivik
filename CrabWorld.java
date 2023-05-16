import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

/**
 * The CrabWorld is the place where crabs and other creatures live. 
 * It creates the initial population.
 */
public class CrabWorld extends World
{
    private int x1 = 97;
    private int y = 370;
    private int x2 = 300;
    private int x3 = 503;
    private Value[] slots;
    
    public CrabWorld() 
    {
        super(600, 700, 1);
        slots = new Value[3];
        prepare();
    }
    
    public void spin() {
        for (Value i: slots) {
            
        }
    }
    
    private void prepare()
    {        
        slots[0] = new Value(x1, y);
        slots[1] = new Value(x2, y);
        slots[2] = new Value(x3, y);
        for (Value i: slots) {
            addObject(i, i.getX(), i.getY());
        }
    }
    
    
}