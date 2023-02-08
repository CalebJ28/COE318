/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author my_mc
 */
public class Lab6Try {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circuit circuit = Circuit.getInstance(); //Creates a new instance of a circuit
        
        Node node1, node2, node3; // Setting up 3 nodes
        Resistor r1, r2; //Setting up 2 resistors between the nodes
        
        node1 = new Node(); //Initalizing each node
        node2 = new Node();
        node3 = new Node();
        
        r1 = new Resistor(19, node1, node2); //Initalizing each resistors 
        r2 = new Resistor(18, node2, node2);
        
        circuit.add(r1); //Adding each resistor to the circuits
        circuit.add(r2);
        
        System.out.println(circuit); 
    }
    
}
