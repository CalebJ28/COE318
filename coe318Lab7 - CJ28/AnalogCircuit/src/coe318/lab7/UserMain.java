/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab7;

import java.util.Scanner;

/**
 *
 * @author my_mc
 */
public class UserMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n;
        Scanner input = new Scanner(System.in);
        Circuit c1 = Circuit.getInstance();
        boolean run = true;
        int xint1, xint2, diff;
        Voltage vin;
        Resistor rin;

        Node node1 = null, node2 = null; //Creates two nodes
        double res, vol;

        while (run == true) { // Condition in while loop is always true here
            System.out.println("Add a component");
            n = input.next();

            if (n.isEmpty()) {
                System.out.println("Invalid Entry (" + n + ")!\n"
                        + "Describe either a resistor or a DC source!\n"
                        + "Try Again...\n");
                n = "";
            }
            if (n.equals("end")) {
                System.out.println("Program is done");
                break;
            } else if (n.equals("r")) { //If "r" is entered, the resistor is created.
                xint1 = input.nextInt();
                xint2 = input.nextInt();
                if (xint1 < Node.nextIdNum) { //If the first node entered does exists, it is located in the arraylist.
                    for (int i = 0; i < Node.nextIdNum; i++) {
                        if (c1.nodes.get(i).idNum == xint1) {
                            node1 = c1.nodes.get(i);
                        }
                    }
                } else { //If the first node entered is not a node, it will create nodes until the specified node will be created.
                    diff = xint1 - Node.nextIdNum;
                    for (int i = 0; i <= diff; i++) {
                        node1 = new Node();
                    }
                }
                if (xint2 < Node.nextIdNum) { //If the second node entered does exists, it is located in the arraylist.
                    for (int i = 0; i < Node.nextIdNum; i++) {
                        if (c1.nodes.get(i).idNum == xint2) {
                            node2 = c1.nodes.get(i);
                        }
                    }
                } else { //If the second node entered is not a node, it will create nodes until the specified node will be created.
                    diff = xint2 - Node.nextIdNum;
                    for (int i = 0; i <= diff; i++) {
                        node2 = new Node();
                    }
                }
                res = input.nextDouble();
                rin = new Resistor(res, node1, node2); //A new resistor with the entered specifications is created.
            } else if (n.equals("v")) { //If "v" is entered, the voltage source is created.
                xint1 = input.nextInt();
                xint2 = input.nextInt();
                if (xint1 < Node.nextIdNum) { //If the first node entered does exist, it is located in the arraylist.
                    for (int i = 0; i < Node.nextIdNum; i++) {
                        if (c1.nodes.get(i).idNum == xint1) {
                            node1 = c1.nodes.get(i);
                        }
                    }
                } else { //If the first node entered is not a node, it will create nodes until the specified node will be created.
                    diff = xint1 - Node.nextIdNum;
                    for (int i = 0; i <= diff; i++) {
                        node1 = new Node();
                    }
                }
                if (xint2 < Node.nextIdNum) { //If the second node entered is already a node, it is located in the arraylist.
                    for (int i = 0; i < Node.nextIdNum; i++) {
                        if (c1.nodes.get(i).idNum == xint2) {
                            node2 = c1.nodes.get(i);
                        }
                    }
                } else { //If the second node entered is not a node, it will create nodes until the specified node will be created.
                    diff = xint2 - Node.nextIdNum;
                    for (int i = 0; i <= diff; i++) {
                        node2 = new Node();
                    }
                }
                vol = input.nextDouble();
                vin = new Voltage(vol, node1, node2); //A new voltage source with the entered specifications is created.
            } else if (n.equalsIgnoreCase("spice")) { //If "spice" is entered, the spice description of the circuit is printed line by line from circuit class.
                System.out.println(c1.toString());
            }

        }
    }
}

/*OLD PROGRAM WORK char firstChar = n.charAt(0);
      //System.out.println(firstChar); During testing verifying code was reaeding first character of user input

    
      
   
      if(firstChar == 'r'){
          System.out.println("This is a resistor " + n);      
      } else if (firstChar == 'v'){
          System.out.println("This is a voltage source " + n);  
      }
      
      //if (n.equals)
      System.out.println("You entered " + n);
      
    }
    }  
}*/
