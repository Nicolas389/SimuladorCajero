package Clases.Persona;

import Clases.Movimientos.MovAdmin;
import Clases.Movimientos.MovCliente;
import java.util.ArrayList;


/**
 * Clase abstracta desde la que se hereda los diferentes usuarios
 */
public abstract class Persona {
    
    
    protected String usuarioCliente="cliente";
    protected String usuarioAdmin="admin";
    protected static String claveCliente = "cliente";
    protected String claveAdmin = "admin";
    protected static int saldo = 5000;
    protected static int disponible = 3000;
    protected int limite = 3000;
    protected static int saldoCajero = 50000;
    public static ArrayList<MovCliente> movimientosCliente = new ArrayList<MovCliente>();
    public static ArrayList<MovAdmin> movimientosCajero = new ArrayList<MovAdmin>();
    
    public Persona() {
    }

}
