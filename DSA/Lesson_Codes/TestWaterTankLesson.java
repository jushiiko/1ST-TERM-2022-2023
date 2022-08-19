package DSA.Lesson_Codes;

import java.security.DrbgParameters.Capability;
import java.util.Vector;

public class TestWaterTankLesson {
    public static void main(String[] args) {
        WaterTankLesson tank = new WaterTankLesson(10000);

        System.out.println("Capacity\t: " + tank.getCapacity());
        System.out.println("Current Water\t: " + tank.getCurrentWater());
        System.out.println("Availability\t: " + tank.availabilty());

        System.out.println("is Full\t\t: " + tank.isFull());
        System.out.println("is Empty\t: " + tank.isEmpty());
        System.out.println("is Empty\t: " + tank.isEmpty2());

        tank.addWater(2000);
        System.out.println("Current Water\t: " + tank.getCurrentWater() + " L");
        System.out.println("Availability\t: " + tank.availabilty());
        System.out.println("is Full\t\t: " + tank.isFull());
        System.out.println("is Empty\t: " + tank.isEmpty());
        System.out.println("is Empty\t: " + tank.isEmpty2());
        tank.addWater(8000);
        System.out.println("Current Water\t: " + tank.getCurrentWater() + " L");
        System.out.println("is Full\t\t: " + tank.isFull());
        System.out.println("is Empty\t: " + tank.isEmpty());
        System.out.println("is Empty\t: " + tank.isEmpty2());
        tank.addWater(3000);
        System.out.println("Current Water\t: " + tank.getCurrentWater() + " L");

    }

}
