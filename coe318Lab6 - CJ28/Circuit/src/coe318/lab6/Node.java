/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author my_mc
 */
public class Node {
    
      public int idNum;
      private static int nextIdNum;
      
  public Node() {
      this.idNum = nextIdNum;
      this.nextIdNum++;
  }
    @Override
  public String toString() {
          return String.valueOf(idNum);

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
