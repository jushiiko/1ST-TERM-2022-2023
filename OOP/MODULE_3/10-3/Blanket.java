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
        this.size="Twin";
        this.color="white";
        this.material="cotton";
        this.price=30;
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
        this.size=s;
        if(size.compareTo("Double")==0){
            price += 10;
        }else if(size.compareTo("Queen")==0){
            price += 15;
        }else if(size.compareTo("King")==0){
            price += 15;
        }           
    }
    public void setMaterial(String m)
    {
        // write your code here
        this.material=m;
        if(material.compareTo("wool")==0){
            price += 20;
        }else if(material.compareTo("cashmere")==0){
            price += 25;
        }
    }
    public String toString()
    {
        // write your code here
        Blanket b = new Blanket();
         String b1 = b.toString();
         return b1;
    }
}