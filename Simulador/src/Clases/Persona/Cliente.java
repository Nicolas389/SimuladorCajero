package Clases.Persona;

import Metodos.Metodos;

public class Cliente extends Persona {

    public Cliente() {

    }

    public String getClave() {
        return claveCliente;
    }

    /**
     * Metodo para cambiar clave. Con intercepcion de que no sea igual a la
     * contraseña anterior
     */
    public void setClave(String Nueva, String Repeticion) {

        Metodos met = new Metodos();
        if (Nueva.equals(Repeticion)) {
            this.claveCliente = Nueva;
            met.OperacionCompletada("La contraseña ha sido modificada con exito");
        } else {
            met.MensajeError("Las claves son diferentes.\n Ingrese dos contraseñas iguales.");
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public int getSaldoCajero() {
        return saldoCajero;
    }

    public String getUsuario() {
        return usuarioCliente;
    }

    public int getLimite() {
        return limite;
    }

    /**
     * Metodo que registra en el saldo cuando el cliente retira efectivo y en el
     * total disponible en el cajero
     */
    public void Retirar(int retiro) {
        Metodos met = new Metodos();

        saldo = saldo - retiro;
        disponible = disponible - retiro;
        saldoCajero = saldoCajero - retiro;
        met.OperacionCompletada("Operacion completada con exito.");

    }

    /**
     * Metodo que registra en el saldo cuando el cliente deposita efectivo y en
     * el total disponible en el cajero
     */

    public void Depositar(int deposito) {
        Metodos met = new Metodos();

        saldo = saldo + deposito;
        saldoCajero = saldoCajero + deposito;
        met.OperacionCompletada("Operacion completa.\n Su saldo actual es: $" + saldo);

    }

    /**
     * Metodo que registra en el saldo cuando el cliente realiza una transferencia  
     */
    public void Transferencia(int transf) {
        Metodos met = new Metodos();
        saldo = saldo - transf;

        met.OperacionCompletada("La operacion ha sido completada con exito");

    }

}
