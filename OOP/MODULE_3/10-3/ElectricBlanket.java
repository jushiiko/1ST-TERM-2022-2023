public class ElectricBlanket extends Blanket
{
    private int settings;
    private boolean hasAutoShutoff;
    private final int MAX_SETTINGS = 5;
    private double shutoffPremium;
    private final double S_PRICE = 5.75;
    public ElectricBlanket()
    {
        // write your code here
        this.settings=1;
        this.hasAutoShutoff=false;
    }
    public int getSettings()
    {
        // write your code here
        return settings;
    }
    public boolean getHasAutoShutoff()
    {
        // write your code here
        return hasAutoShutoff;
    }
    public void setSettings(int s)
    {
        // write your code here
        
        this.settings = s;
        if(settings<1 || settings>5){
            settings=1;
        }
        

    }
    public void setHasAutoShutoff(boolean h)
    {
        // write your code here
        this.hasAutoShutoff=h;
        if(hasAutoShutoff==false){
            
        }else{
            price +=5.75;
        }
        
    }
    public String toString()
    {
        // write your code here
        ElectricBlanket b = new ElectricBlanket();
         String b1 = b.toString();
         return b1;
    }
} 
