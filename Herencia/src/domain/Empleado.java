/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author lepo9
 */
public class Empleado extends Persona {
    
    //Las clases hojas pueden acceder a las clases padres a traves de la palabra super
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    
    public Empleado(){
    
        super();//Llamada a la clase padre persona. Pero no es necesario escribirlo por que se hace el llamado implicito.
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    public Empleado(String nombre, double sueldo) {
        /*
        Con this se esta llamando al contructor vavio de la clase empleado.
        This() no puede estar al mismo tiempo con el llamado al constructor super().
        Para inicializar los atributos de la clase padre, se llama directamente los atributos
        a traves de this.
        */
        this();
        //super(nombre);//Reciviendo argumento desde la clase empleado
        this.nombre = nombre;
        this.sueldo = sueldo;
        
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
