/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author syedaijahan
 */
public class Account {
    private String user;
    private int number;
    private double initialBalance;

    public Account(String name, int number, double initialBalance) {
        this.user = name;
        this.number = number;
        this.initialBalance = initialBalance;
    }

    public String getName() {
        return user;
    }

    public int getNumber() {
        return number;
    }

    public double getInitialBalance() {
        return this.initialBalance;
    }
    
    public boolean deposit (int amount){
        if (amount > 0){
            this.initialBalance = initialBalance + amount;
            return true;
        } else {
           return false;
        }
    }
    
    public boolean withdraw (int amount){
        if (amount <= this.initialBalance && amount > 0){
            this.initialBalance = initialBalance - amount;
            return true;
        }else{
            return false;
        }
           
    }
    @Override
    public String toString() {//DO NOT MODIFY
         return "(" + getName() + ", " + getNumber() + ", " +
         String.format("$%.2f", getInitialBalance()) + ")";
    }
    
}
