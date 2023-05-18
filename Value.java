import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Value here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Value extends Actor
{
    private int idx;
    private int x;
    private int y;
    
    private String[] images = {"images\\goldDrag.png", "images\\dragonGold.png", "images\\jackpot.png", "images\\wild.png"};
    
    /**
     * Act - do whatever the Value wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Value(int x, int y) {
        super();
        this.x=x;
        this.y=y;
        idx = (int) (Math.random() * 4);
        setImage(images[idx]);
    }
    
    public int getIdx() {
        return idx;
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
    public void forward() {
        if (idx == 3) idx = 0;
        else {
            idx++;
        }
        setImage(images[idx]);
    }
    
}
