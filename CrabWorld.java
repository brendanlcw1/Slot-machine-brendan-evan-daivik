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
    private double money;
    int randInt;
    
    public CrabWorld() 
    {
        super(600, 700, 1);
        slots = new Value[3];
        prepare();
        int input = Integer.parseInt(Greenfoot.ask("Enter your starting value (as an integer): "));
        money = input; 
        
    }
    public double getMoney()
    {
        return money;
    }
    public void printMoney()
    {
        showText("$"+money, getWidth() / 2, 10);
    }
    public void setMoney(double cash)
    {
        money = ((double)((int)(cash*100.0)))/100.0;
    }
    
    public void updateMoney() {
        if (slots[0].getIdx() == slots[1].getIdx() || slots[1].getIdx() == slots[2].getIdx()) {
            setMoney(money*1.13);
        } else if (slots[0].getIdx() == slots[1].getIdx() && slots[1].getIdx()==slots[2].getIdx()) {
            setMoney(money*1.4);
        } else {
            setMoney(money*0.9);
        }
    }
    
  public void act() {
       
         
         spin();
         updateMoney();
         printMoney();
        
        
        
    }

    
   public void spin() {
        for (Value i: slots) {
            
            randInt = (int) (Math.random() * 4) ;
            for(int j = 0; j < randInt; j++){
            
            i.forward();
            }
            
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
