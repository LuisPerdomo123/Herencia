/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author lepo9
 */
public class Persona extends Object{//Extiendoe de manera automatica de la clase Object

    protected String nombre;//Los atributos protectes pueden ser accedidos por las clases hijas aun si se encuenran en otro paquete
    protected char genero;
    protected int edad;
    protected String direccion;

    public Persona() {

    }

    public Persona(String nombre) {

        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        super(); //lllamada a la clase padre object
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    

    
}
