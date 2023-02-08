/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author my_mc
 */
public class Resistor {
    
      private int resistorID;
      private static int nextIdNum = 0;
      private double resistor;
      private Node [] nodelist;
      private Node previous;
      private Node next;

      
  public Resistor(double resistance, Node node1, Node node2) {
      if(node1 == node2){
          throw new IllegalArgumentException("Two nodes cannot have the same value");
      }
      if(resistance < 0){
          throw new IllegalArgumentException("Resistance value cannot be a negative");
      }
      
      this.resistor = resistance;
      
      resistorID = nextIdNum++;
      
      nodelist = new Node[2];
      previous = node1;
      next = node2;
  }
  
  public Node [] getNodes() {
      nodelist[1] = previous;
      nodelist[2] = next;
          return nodelist;
  }
  
  @Override
  public String toString() {
          return " R" + this.resistorID  + " " + this.previous + " " + this.next + " " + this.resistor;
  }
  
  public static void main (String[] args) {
     System.out.println("Creating node A....");
     Node node1 = new Node();
     System.out.println("Node 1's ID is: " + node1);
     System.out.println("Creating node B....");
     Node nodeB = new Node();
     System.out.println("Node B's ID is: " + nodeB);
    }
    
}
