/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Movimientos;

/**
 *
 * @author Nic
 */
public class MovNoCliente extends Movimientos {

    public MovNoCliente(String fecha,String Usuario, int Movimiento,String tipomov, int MontoCajero) {
        this.fecha = fecha;
        this.Usuario = Usuario;
        this.Movimiento = Movimiento;
        this.tipomov = tipomov;
        this.MontoCajero = MontoCajero;
        
    }

    public String getFecha() {
        return fecha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public int getMovimiento() {
        return Movimiento;
    }

    public int getMontoCajero() {
        return MontoCajero;
    }

    public String getTipomov() {
        return tipomov;
    }

    @Override
    public String toString() {
       return getFecha()+" "+getUsuario()+""+getTipomov()+""+getMovimiento()+" "+getMontoCajero();
    }
    
    
    
}
