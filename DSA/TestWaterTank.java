package DSA;

import javax.swing.JOptionPane;

public class TestWaterTank {
    public static void main(String[] args) {
        WaterTank tank=new WaterTank();

        String menu[]= {"Add Water", "Remove Water", "Setting", "End"};
        String choice="";
            liter=0;

        do {
            choice=JOptionPane.showInputDialog(null, "Choose", "Menu", 1, null, menu, menu[2].toString();
            switch(choice) {
                case "Add Water":
                    liter=JOptionPane.showInputDialog(parentComponent, "Liter: ");
                    break;
                case "Remove Water":
                    break;
                case "Setting":
                    break;                    
            }
        }while(!choice.equals("End"));
        
        System.out.println();


        System.out.println("Capacity\t: "+tank.getCapacity());
        System.out.println("CurrentWater\t: "+tank.getCurrentWater());
    }
}
