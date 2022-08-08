package DSA;

public class WaterTank2 {

    //ADTs - Abstract Data Type
   
    //4 operations
   
   
   
    //1. Creator - use to initialize an object (Constructor)
   
    //2. Transformer - changing the state of the object
   
    //3. Observer - display the current state of the object
   
    //4. Input/Output - data/values 
   
   
   
    //data members- attributes of the object
   
    private int capacity;
   
    private int currentWater;
   
   
   
    /**creator
   
   * @author martzel baste
   
   * <b> capacity</b> the capacity of the tank set to 500
   
   * <i> currentWater </i> set to 0
     * @return 
   
   */
   
    void WaterTank(){
   
    capacity=500;
   
    currentWater=0;
   
    System.out.println("object initializes...");
   
   }
   
   
   
    void WaterTank(int capacity){
   
    this.capacity=capacity;
   
    currentWater=0;
   
    System.out.println("object initializes...");
   
   }
   
   
   
    //behavior of your object
   
    //transformer - setter/mutator (OOP)
   
    public void setCapacity(int capacity) {
   
    if(capacity<=0) {
   
    System.err.println("Negative value is NOT allowed.");
   
    }else {
   
    this.capacity=capacity;
   
   }
   
    } //end of method
   
   
   
    /**
   
   * this method will add water to tank thru user's input
   
   * @param liter amount of water in liter to fill in
   
   */
   
    public void addWater(int liter) {
   
    currentWater+=liter;
   
   }
   
   
   
    public void removeWater(int liter) {
   
    currentWater-=liter;
   
   }
   
   
   
    //observer
   
    public int getCapacity() {
   
    return capacity;
   
   }
   
   
   
    public int getCurrentWater() {
   
    return currentWater;
   
   }
   
   
   
    public boolean isEmpty() {
   
    return (currentWater==0);
   
   }
   
    public boolean isFull() {
   
    return (currentWater==capacity);
   
   }
   
   
   
    public String displayInfo() {
   
    return "Empty\t: "+isEmpty()+"\tFull\t: "+isFull()
   
    +"\nCapcity\t: "+getCapacity()+"L\tCurrentWater\t: "+getCurrentWater()+"L";
   
   }
   
   }
   
   