
package Clases.Persona;

import Metodos.Metodos;


public class NoCliente extends Persona {
    
    public String usuario;
    public NoCliente() {
        this.usuario = "NoCli";
        
    }

    public String getUsuario() {
        return usuario;
    }
    
    /**
     * Metodo que registra en el saldo del cajero cuando un no cliente realiza una operacion
     */
    public void Operacion(int deposito){
        Metodos met = new Metodos();
        
        saldoCajero = saldoCajero + deposito;
        met.OperacionCompletada("Operacion completada con exito.");
    }
    
    
    
       
}
