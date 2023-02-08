/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author my_mc
 */
public class Node {
    Circuit circ = Circuit.getInstance();
    
      public int idNum;
      static int nextIdNum = 0;
      
  public Node() {
      idNum = nextIdNum++;
      circ.add(this);
  }
    @Override
  public String toString() {
          return "Node ID " + String.valueOf(idNum);

  }
  
  public static void main (String[] args) {
     System.out.println("Creating node A....");
     Node node1 = new Node();
     System.out.println("Node A's ID is: " + node1);        
     System.out.println("Creating node B....");
     Node nodeB = new Node();
     System.out.println("Node B's ID is: " + nodeB);
    }
    
}
