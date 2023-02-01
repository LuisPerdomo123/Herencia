/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;
import domain.Cliente;
import domain.Persona;
import java.util.Date;

/**
 *
 * @author lepo9
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        var fecha = new Date();
        
        Cliente cliente1 = new Cliente(fecha, true, "Karla", 'F', 28, "Saturno 15");
        System.out.println("cliente1 = " + cliente1);
        
        
        Persona persona1 = new Persona();
    }
}
