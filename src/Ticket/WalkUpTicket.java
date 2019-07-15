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
public class WalkUpTicket extends Ticket{
    
    public WalkUpTicket(int número) {
        super(número);
        this.precio = 50;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    public int getNúmero() {
        return número;
    }

}
