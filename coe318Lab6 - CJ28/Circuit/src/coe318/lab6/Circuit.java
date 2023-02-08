/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author my_mc
 */
public class Circuit {
    
    private static ArrayList<Resistor> resistors;
    
    
    private Circuit() {
        resistors = new ArrayList();
      
        
    }
    
    public void add(Resistor r){
        resistors.add(r);
    }
    
    private static Circuit instance = null; 
    public static Circuit getInstance() {
        if (instance == null){ 
            instance = new Circuit();
        }
        return instance;
    }
    
    @Override
    public String toString() {
        String msg = "";
        for(int i = 0; i < resistors.size(); i++){
            msg += resistors.get(i).toString();
            
            
        }
          return msg;

  }
    
}
