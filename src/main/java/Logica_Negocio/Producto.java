/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Carolina
 */
public class Producto {
    
    //atributos
    public String Nombre;
    public String Identificador;
    public int cantidad;
    //constructor no parametrizado
    public Producto(){
        
    }
    //contructor parametrizado
    public Producto(String Nombre, String Identificador, int cantidad) {
        this.Nombre = Nombre;
        this.Identificador = Identificador;
        this.cantidad = cantidad;
        
        
    }
     //setter
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
     //getter
    public String getNombre() {
        return Nombre;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
