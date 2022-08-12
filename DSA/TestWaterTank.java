package DSA;
import javax.swing.JOptionPane;

import javax.swing.JTextArea;



public class TestWaterTank {

 public static void main(String[] args) {

 WaterTank tank=new WaterTank(10000);



 String menu[]= {"Add Water","Remove Water","Setting","End"};

 String choice="",hold="";

 int liter=0;

do {

 hold=tank.displayInfo();

 choice=JOptionPane.showInputDialog(null,

 new JTextArea(hold+"\n"+"Choose"),"Menu",1,null,menu,menu[2]).toString();



 switch(choice) {

 case "Add Water":

 liter=Integer.parseInt(JOptionPane.showInputDialog("Liter: "));

 JOptionPane.showMessageDialog(null, liter+" liter is added to tank.");

 tank.addWater(liter);

break;

 case "Remove Water":

 liter=Integer.parseInt(JOptionPane.showInputDialog("Liter: "));

 JOptionPane.showMessageDialog(null, liter+" liter is removed from tank.");

 tank.removeWater(liter);

break;

 case "Setting":

break;

 }//end of switch



 }while(!choice.equals("End"));

}

}

