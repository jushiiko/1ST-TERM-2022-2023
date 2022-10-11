public class UsedCar {
    String vin;
    String make;
    int year;
    int mileage;
    int price;
    public final static String DEFAULT_VIN = "999";
    final int VIN_NUM_LENGTH = 4;
    final int LOW_YEAR = 1997;
    final int HIGH_YEAR = 2017;
    final String[] MAKES = {"Ford", "Honda", "Toyota", "Chrysler", "Other"};
    
    public UsedCar(String num, String carMake,
                   int carYear, int miles, int pr) throws UsedCarException {
        // Write your code here
        if (num.length() != VIN_NUM_LENGTH) {
            throw new UsedCarException("Invalid VIN number.");
        }
        if (carYear < LOW_YEAR || carYear > HIGH_YEAR) {
            throw new UsedCarException("Invalid year.");
        }
        if (miles < 0) {
            throw new UsedCarException("Invalid mileage.");
        }
        if (pr < 0) {
            throw new UsedCarException("Invalid price.");
        }
        vin = num;
        make = carMake;
        year = carYear;
        mileage = miles;
        price = pr;
    }
    
    public UsedCar() {
        // Write your code here
        vin = DEFAULT_VIN;
        make = MAKES[MAKES.length - 1];
        year = LOW_YEAR;
        mileage = 0;
        price = 0;
    }
    
    public String getVin() {
        // Write your code here
        return vin;
    }
    
    public String toString() {
        return "VIN " + vin + "  Make: " + make +
               "\n   Year: " + year + "  " + mileage + " miles   $" +
               price;
    }
}
