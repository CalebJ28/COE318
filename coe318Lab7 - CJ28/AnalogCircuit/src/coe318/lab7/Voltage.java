/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author my_mc
 */
public class Voltage {
    
      private int voltageID;
      private static int nextIdNum = 1;
      private double voltage;
      //private Node [] nodelist;
      //private Node previous;
      //private Node next;
      Node node1, node2;
      Circuit circ = Circuit.getInstance();

      
  public Voltage(double voltageVal, Node node1, Node node2) {
      if(node1 == node2){
          throw new IllegalArgumentException("Two nodes cannot have the same value"); //Cant have equal nodes exit program
      }
      if(voltageVal < 0){
          System.out.println("Voltage cannot be negative, polarity is reversed"); //This swaps the polarity of the node and interchanges the node initalization
          Node swap = node1;
          node1 = node2;
          node2 = swap;
          voltageVal = voltageVal * (-1);
          
      }
      
      this.voltage = voltageVal;
      
      voltageID = nextIdNum++;
      
      //nodelist = new Node[2]; OLD CODE
      this.node1 = node1;
      this.node2 = node2;
      circ.add(this);
  }
  
  public Node [] getNodes() {
      Node [] nodelist = new Node [2];
      nodelist[0] = node1;
      nodelist[1] = node2;
          return nodelist;
  }
  
  public double getVoltage(){
      return voltage;
  }
  
  public int getID(){
      return voltageID;
  }
  
  @Override
  public String toString() {
          return " V" + this.voltageID  + " " + node1.idNum + " " + node2.idNum + " DC " + voltage; //To string for any Voltage
  }
  
 // public static void main (String[] args) {
    // System.out.println("Creating node A....");
    // Node node1 = new Node();
     //System.out.println("Node 1's ID is: " + node1);
     //System.out.println("Creating node B....");
    // Node nodeB = new Node();
     //System.out.println("Node B's ID is: " + nodeB);
    //} TEST OLD CODE
}
