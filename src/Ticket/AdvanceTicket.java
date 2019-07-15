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
public class AdvanceTicket extends Ticket{

    protected int diasAntesDeEvento;
    protected String nombre;
    protected int cedula;
    public AdvanceTicket(int diasAntesDeEvento,int cedula, String nombre, int número) {
        super(número);
        this.diasAntesDeEvento = diasAntesDeEvento;
        this.cedula = cedula;
        this.nombre = nombre;
        if (this.diasAntesDeEvento >= 10) {
            this.precio = 20;
        }else{
            this.precio = 40;
        }
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    public int getDiasAntesDeEvento() {
        return diasAntesDeEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public int getNúmero() {
        return número;
    }
    
    
}
