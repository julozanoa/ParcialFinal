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
public class StudentAdvanceTicket extends AdvanceTicket{

    protected int numCarnet;
    protected String instEdu;
    public StudentAdvanceTicket(int numCarnet,String instEdu, int diasAntesDeEvento, int cedula, String nombre, int número) {
        super(diasAntesDeEvento, cedula, nombre, número);
        this.numCarnet = numCarnet;
        this.instEdu = instEdu;
        if (this.diasAntesDeEvento >= 10) {
            this.precio = 15;
        }else{
            this.precio = 20;
        }
    }

    
    
    @Override
    public double getPrecio() {
        return this.precio;
    }

    public int getNumCarnet() {
        return numCarnet;
    }

    public String getInstEdu() {
        return instEdu;
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
