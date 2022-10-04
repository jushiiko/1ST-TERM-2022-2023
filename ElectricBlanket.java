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
        settings = 1;
        hasAutoShutoff = false;
        shutoffPremium = 0;
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
        if (s > 0 && s <= MAX_SETTINGS)
        {
            settings = s;
        }
        else
        {
            settings = 1;
        }
    }
    public void setHasAutoShutoff(boolean h)
    {
        // write your code here
        hasAutoShutoff = h;
        if (hasAutoShutoff)
        {
            shutoffPremium = S_PRICE;
        }
        else
        {
            shutoffPremium = 0;
        }
    }
    public String toString()
    {
        // write your code here
        return "Size: " + size + "" + "Color: " + color + "" + "Material: " + material + 
        "" + "Price: " + price + "" + "Settings: " + settings + "" + "Has Auto Shutoff: " + hasAutoShutoff;
    }
} 

