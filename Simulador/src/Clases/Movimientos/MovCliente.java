/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Movimientos;

import java.util.Date;

/**
 *
 * @author Nic
 */
public class MovCliente extends Movimientos {

    public MovCliente(String fecha,String usuario,int movimiento, int monto){
        this.fecha = fecha;
        this.Usuario = usuario;
        this.Movimiento = movimiento;
        this.MontoCliente = monto;
    }

     public MovCliente() {
    }
     
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getMovimiento() {
        return Movimiento;
    }

    public void setMovimiento(int Movimiento) {
        this.Movimiento = Movimiento;
    }

    public int getMontoCliente() {
        return MontoCliente;
    }

    public void setMontoCliente(int MontoCliente) {
        this.MontoCliente = MontoCliente;
    }

    @Override
    public String toString() {
        return getFecha()+" "+getUsuario()+""+getMovimiento()+" "+getMontoCliente();
    }
    
    
}
