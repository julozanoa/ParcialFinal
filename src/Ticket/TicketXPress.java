/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class TicketXPress {
    
    private ArrayList<Ticket> tickets;

    public TicketXPress() {
        this.tickets = new ArrayList<>();
    }

    
    public String leeTs(int num)throws TicketNumberException{
        for (int i = 0; i < tickets.size(); i++) {
            if (num == tickets.get(i).getNúmero()) {
                throw new TicketNumberException("error");
            }else{
                
            }
        }return "1";
    }
    
    public void calcularVentasPorTipo(String tipo){
        double v = 0;
        for (Ticket t : tickets) {
            if(tipo.equals("WalkUpTicket") && t.getClass() == WalkUpTicket.class){
                WalkUpTicket w = (WalkUpTicket)t;
                v+= w.getPrecio();
                
            }else if (tipo.equals("AdvanceTicket") && t.getClass() == AdvanceTicket.class) {
                AdvanceTicket a = (AdvanceTicket)t;
                v+= a.getPrecio();
                
            }else if (tipo.equals("StudentAdvanceTicket") && t.getClass() == StudentAdvanceTicket.class){
                StudentAdvanceTicket s = (StudentAdvanceTicket)t;
                v += s.getPrecio();
                
            }
        }System.out.println("ventas de: "+ tipo + ": "+v);
        
    }
    
    
    public static void main(String[] args) {
        TicketXPress txp = new TicketXPress();
        
        WalkUpTicket w1 = new WalkUpTicket(001);
        try{
            if ((txp.leeTs(w1.getNúmero())).equals("1")) {
                txp.tickets.add(w1);
            }
        }catch(TicketNumberException e){
            System.out.println("Este id ya existe no se pudo realizar la compra");
        }
        WalkUpTicket w2 = new WalkUpTicket(001);
        try{
            if ((txp.leeTs(w2.getNúmero())).equals("1")) {
                txp.tickets.add(w2);
            }
        }catch(TicketNumberException e){
            System.out.println("Este id ya existe no se pudo realizar la compra");
        }
        WalkUpTicket w3 = new WalkUpTicket(002);
        try{
            if ((txp.leeTs(w3.getNúmero())).equals("1")) {
                txp.tickets.add(w3);
            }
        }catch(TicketNumberException e){
            System.out.println("Este id ya existe no se pudo realizar la compra");
        }
        
        
        AdvanceTicket a1 = new AdvanceTicket(5,1016111456,"Jose",003);
        try{
            if ((txp.leeTs(a1.getNúmero())).equals("1")) {
                txp.tickets.add(a1);
            }
        }catch(TicketNumberException e){
            System.out.println("Este id ya existe no se pudo realizar la compra");
        }
        AdvanceTicket a2 = new AdvanceTicket(11,1016111457,"Maria",003);
        try{
            if ((txp.leeTs(a2.getNúmero())).equals("1")) {
                txp.tickets.add(a2);
            }
        }catch(TicketNumberException e){
            System.out.println("Este id ya existe no se pudo realizar la compra");
        }
        AdvanceTicket a3 = new AdvanceTicket(10,1016111458,"Lina",004);
        try{
            if ((txp.leeTs(a3.getNúmero())).equals("1")) {
                txp.tickets.add(a3);
            }
        }catch(TicketNumberException e){
            System.out.println("Este id ya existe no se pudo realizar la compra");
        }
        
        StudentAdvanceTicket s1 = new StudentAdvanceTicket(100,"UNAL",8, 79784756,"Julian", 005);
        try{
            if ((txp.leeTs(s1.getNúmero())).equals("1")) {
                txp.tickets.add(s1);
            }
        }catch(TicketNumberException e){
            System.out.println("Este id ya existe no se pudo realizar la compra");
        }
        StudentAdvanceTicket s2 = new StudentAdvanceTicket(101,"UNAL",8, 79784751,"Wilson", 005);
        try{
            if ((txp.leeTs(s2.getNúmero())).equals("1")) {
                txp.tickets.add(s2);
            }
        }catch(TicketNumberException e){
            System.out.println("Este id ya existe no se pudo realizar la compra");
        }
        StudentAdvanceTicket s3 = new StudentAdvanceTicket(102,"UNAL",8, 79784753,"Natalia", 006);
        try{
            if ((txp.leeTs(s3.getNúmero())).equals("1")) {
                txp.tickets.add(s3);
            }
        }catch(TicketNumberException e){
            System.out.println("Este id ya existe no se pudo realizar la compra");
        }
        
        txp.calcularVentasPorTipo("WalkUpTicket");
        txp.calcularVentasPorTipo("AdvanceTicket");
        txp.calcularVentasPorTipo("StudentAdvanceTicket");
    }
}
