public class Blanket
{
    protected String size;
    protected String color;
    protected String material;
    protected double price;
    protected double sizePremium;
    protected double materialPremium;
    private final String SIZE1 = "Twin";
    private final String SIZE2 = "Double";
    private final String SIZE3 = "Queen";
    private final String SIZE4 = "King";
    protected final double BASE_PRICE = 30;
    private final double S_PRICE2 = 10;
    private final double S_PRICE3 = 25;
    private final double S_PRICE4 = 40;
    private final String MAT1 = "cotton";
    private final String MAT2 = "wool";
    private final String MAT3 = "cashmere";
    private final double M_PRICE2 = 20;
    private final double M_PRICE3 = 45;
    public Blanket()
    {
        setDefaults();
    }
    private void setDefaults()
    {
        // write your code here
        size = SIZE1;
        color = "white";
        material = MAT1;
        price = BASE_PRICE;
        sizePremium = 0;
        materialPremium = 0;
    }
    public String getSize()
    {
        // write your code here
        return size;
    }
    public String getColor()
    {
        // write your code here
        return color;
    }
    public String getMaterial()
    {
        // write your code here
        return material;
    }
    public void setSize(String s)
    {
        // write your code here
        size = s;
        if (size.equals(SIZE2))
        {
            sizePremium = S_PRICE2;
        }
        else if (size.equals(SIZE3))
        {
            sizePremium = S_PRICE3;
        }
        else if (size.equals(SIZE4))
        {
            sizePremium = S_PRICE4;
        }
        else
        {
            sizePremium = 0;
        }

    }
    public void setMaterial(String m)
    {
        // write your code here
        material = m;
        if (material.equals(MAT2))
        {
            materialPremium = M_PRICE2;
        }
        else if (material.equals(MAT3))
        {
            materialPremium = M_PRICE3;
        }
        else
        {
            materialPremium = 0;
        }
    }
    public String toString()
    {
        // write your code here
        return "Size: " + size + "" + "Color: " + color + "" + "Material: " + material + 
        "" + "Price: " + price + "" + "Size Premium: " + sizePremium + "" + "Material Premium: " + materialPremium;

    }
}
