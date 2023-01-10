/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Movimientos;

/**
 *
 * @author admin
 */
public class MovAdmin extends Movimientos {
    
    
    
     public MovAdmin(String fecha,String usuario, String tipomov, int movimiento, int monto){
        this.fecha = fecha;
        this.Usuario = usuario;
        this.tipomov = tipomov;
        this.Movimiento = movimiento;
        this.MontoCajero = monto;
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

    public int getMontoCajero() {
        return MontoCajero;
    }

    public void setMontoCajero(int MontoCajero) {
        this.MontoCajero = MontoCajero;
    }

    public String getTipomov() {
        return tipomov;
    }

    @Override
    public String toString() {
        return getFecha()+" "+getUsuario()+""+getTipomov()+""+getMovimiento()+" "+getMontoCajero();
    }

    
}
