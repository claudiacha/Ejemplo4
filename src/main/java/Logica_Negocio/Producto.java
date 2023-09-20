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
    public int precio;
    //constructor no parametrizado
    public Producto(){
        
    }
    //contructor parametrizado

    public Producto(String Nombre, String Identificador, int cantidad, int precio) {
        this.Nombre = Nombre;
        this.Identificador = Identificador;
        this.cantidad = cantidad;
        this.precio = precio;
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

    public void setPrecio(int precio) {
        this.precio = precio;
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

    public int getPrecio() {
        return precio;
    }
    
}
