/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author my_mc
 */
public class Circuit {
    ArrayList components = new ArrayList();//our list of components which accepts voltage sources and resistors 
    ArrayList <Node> nodes = new ArrayList<Node>();//our list of nodes which only accepts type Node
    
    private static Circuit instance = null;
    
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new  Circuit();
        }
        return instance;
    }
    private Circuit() {} //PrIVATE constructor

    public void add (Resistor r) {
        components.add(r); //adding a component of type resistor
    }
    public void add (Voltage v) {
        components.add(v); //adding a component of type voltage
    }
    public void add (Node n) {
        nodes.add(n); //adding a node of type node
    }
    
    @Override
    public String toString() {
        String msg = ""; //Our output message
        
        for(int i = 0; i < components.size(); i++){
            msg += components.get(i).toString() + "\n";   //Prints our list of components line by line       
        }
          return msg;
  }
    
}
