package DSA;

public class WaterTank {
    // ADTs - Abstract Data Type
    // 4 operations
    // 1. Creator - used to initialize an object (Constructor)
    // 2. Transformer - change the state of an object
    // 3. Observer - display the current state of an object
    // 4. Input/Output - data/values from an object

    // data members - attributes of the object
    private int capacity;
    private int currentWater;

    /**
     * @author John Ablay
     * <b> capacity </b> the capacity of the tank
     * <i> currentWater </i> set to 0
     */
    WaterTank (int capacity) {
        this.capacity=capacity;
        capacity=500;
        currentWater=0;
        System.out.println("object initializes...");
    }

    // behavior of your object
    // transformer - setter/mutator (OOP)

    public void setCapacity(int capacity) {
        if (capacity <= 0) {
            System.err.println("Negative value is NOT allowed.");
        } else {
            this.capacity = capacity;
        }
    } // end of method

    public void addWater(int litter) {

    }

    /**
     * this method will add water to tank through user's input
     * 
     * @param liter
     */
    // observer
    public int getCapacity() {
        return capacity;
    }

    public int getCurrentWater() {
        return currentWater;
    }

    public boolean isEmpty() {
        if (currentWater == 0) {
            return true;
        } else {
            return false;
        }
    }

    

    // public boolean isEmpty() {
    // return (currentWater==0);
    // }

    public boolean isFull() {
        return (currentWater==capacity);
    }

    public String displayInfo() {
        return null;
    }

    public void removeWater(int liter) {
    }
}
