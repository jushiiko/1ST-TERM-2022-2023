public class NonMetalElement extends Element
{
    public NonMetalElement(String s, int an, double aw)
    {
        // write your code here
        super(s, an, aw);
    }
    public void describeElement()
    {
        // write your code here
        System.out.println("Symbol: " + symbol);
        System.out.println("Atomic Number: " + atomicNumber);
        System.out.println("Atomic Weight: " + atomicWeight);
        System.out.println("This is a non-metal element.");
    }
}
