/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

/**
 *
 * @author Estudiante
 */
public abstract class Ticket {
    protected int número;
    protected double precio;

    public Ticket(int número) {
        this.número = número;
    }
    
    public abstract double getPrecio();

    public int getNúmero() {
        return número;
    }
    
    
}
