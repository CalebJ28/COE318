/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author my_mc
 */
public class Resistor {
    
      private int resistorID;
      private static int nextIdNum = 1;
      private double resistor;
      //private Node [] nodelist;
      //private Node previous;
      //private Node next; OLD CODE
      Node node1, node2;
      Circuit circ = Circuit.getInstance();

      
  public Resistor(double resistance, Node node1, Node node2) {
      if(node1 == node2){
          throw new IllegalArgumentException("Two nodes cannot have the same value");//Case 1 to exit program
      }
      if(resistance < 0){
          throw new IllegalArgumentException("Resistance value cannot be a negative"); //Case 2 to exit program
      }
      
      this.resistor = resistance;
      this.node1 = node1;
      this.node2 = node2;
      resistorID = nextIdNum++;
      circ.add(this);
      //nodelist = new Node[2];
      //previous = node1;
      //next = node2;
  }
  
  public Node [] getNodes() {
      Node [] nodelist = new Node [2];
      nodelist[0] = node1;
      nodelist[1] = node2;
          return nodelist;
  }
  
  @Override
  public String toString() {
          return " R" + this.resistorID  + " " + node1.idNum + " " + node2.idNum + " " + this.resistor; //To string for any resistor
  }
  
 // public static void main (String[] args) {
    // System.out.println("Creating node A....");
    // Node node1 = new Node();
     //System.out.println("Node 1's ID is: " + node1);
     //System.out.println("Creating node B....");
    // Node nodeB = new Node();
     //System.out.println("Node B's ID is: " + nodeB);
    //} OLD TEST CODE
}
