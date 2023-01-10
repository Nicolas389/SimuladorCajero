/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Persona;

import Metodos.Metodos;

public class Admin extends Persona {

    public Admin() {

    }

    public String getUsuario() {
        return usuarioAdmin;
    }

       public String getClaveAdmin() {
        return claveAdmin;
    }

   
    public static int getSaldoCajero() {
        return saldoCajero;
    }

    public static void setSaldoCajero(int saldoCajero) {
        Persona.saldoCajero = saldoCajero;
    }

    /**
     * metodo para recargar el efectivo total del cajero
     */
    public void Recargar(int recarga) {
        
        Metodos met = new Metodos();
        saldoCajero = saldoCajero + recarga;
        met.OperacionCompletada("Operacion completada con exito");

    }

}
