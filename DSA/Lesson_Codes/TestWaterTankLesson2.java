package DSA.Lesson_Codes;

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.*;

public class TestWaterTankLesson2 {
    public static void main(String[] args) {
        String menu[] = { "Add Water", "Remove Water", "End" };
        String choose = "";
        double amount = 0;
        String hold = "";

        WaterTankLesson tank = new WaterTankLesson(5000);

        do {
            /**
             * hold = "Capacity\t: " + tank.getCapacity() + "\nCurrent Water\t " +
             * tank.getCurrentWater() + "\nAvailability\t: " + tank.availabilty() +
             * "\nis Full\t: " + tank.isFull() + "\nis Empty\t: " + tank.isEmpty() +
             * "\nSelect\t: ";
             */
            hold = tank.showInfo();

            choose = JOptionPane.showInputDialog(null, new JTextArea(hold),
                    "Menu", 1, null, menu, menu[0]).toString();

            switch (choose) {
                case "Add Water":
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Add water in Liter"));
                    JOptionPane.showMessageDialog(null,
                            amount + " L of water is added to tank.");
                    tank.addWater(amount);
                    break;
                case "Remove Water":
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Reduce water in Liter"));
                    JOptionPane.showMessageDialog(null,
                            amount + " L of water is reduced to tank.");
                    tank.removeWater(amount);
                    break;
            }

        } while (!choose.equals("End"));
    }

}
