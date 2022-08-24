


public class WaterTankLesson {
    // Data Members
    private double capacity, currentWater;

    /*
     * 4 type of Operations
     * 1. Creators - create or initialize something
     * 2. Transformers - change the state of the object (setters/mutators)
     * 3. Observers - know the state of the object (getters/accessors)
     * 4. Input/Output -
     */

    // Types of constructor
    public WaterTankLesson() { // default constructor
        capacity = 1000;
        currentWater = 0.0;
    }

    public WaterTankLesson(int capacity) { // parameterized constructor
        this.capacity = capacity;
        currentWater = 0.0;
    }

    public WaterTankLesson(WaterTankLesson tank) { // copy constructor
        this.capacity = tank.capacity;
        currentWater = 0.0;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentWater() {
        return currentWater;
    }

    public boolean isEmpty() {
        return currentWater == 0;
    }

    public boolean isFull() {
        return currentWater == capacity;
    }

    public String isEmpty2() {
        if (currentWater == 0)
            return "Yes";
        else
            return "No";
    }

    public double availabilty() {
        return capacity - currentWater;
    }

    // transformers
    public void addWater(double amount) {
        if (isFull()) {
            System.out.println("Tank is already full");
        } else {
            currentWater += amount;
        }
    }
    public void removeWater(double amount) {
        if (isFull()) {
            System.out.println("Tank is already full");
        } else {
            currentWater -= amount;
        }
    }

    public String showInfo() {
        return "Capacity\t: " + getCapacity() + "\nCurrent Water\t " + 
            getCurrentWater() + "\nAvailability\t: " + availabilty() +
            "\nis Full\t: " + isFull() + "\nis Empty\t: " + isEmpty() + 
            "\nSelect\t: ";
    }

}
