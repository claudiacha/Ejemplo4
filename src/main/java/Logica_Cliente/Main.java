/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Producto;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
      String nombre="";
        String Identificador="";
        int cantidad=0;
        int precio=0;
        
        Producto objproducto = new Producto();
    
    Scanner scan=new Scanner (System.in);
     System.out.println("Digite el nombre del producto");
    nombre=scan.nextLine();
    objproducto.setNombre(nombre);
    
    System.out.println("Digite la referencia del producto");
    Identificador=scan.nextLine();
    objproducto.setIdentificador(Identificador);
    
    System.out.println("Digite la Cantidad del producto");
    cantidad=scan.nextInt();
    objproducto.setCantidad(cantidad);
    
       System.out.println("Digite el precio del producto");
    precio=scan.nextInt();
    objproducto.setPrecio(precio);
    
        System.out.println("El nombre del producto es :"+"\t"+ objproducto.getNombre());
        System.out.println("El identificador del producto :"+"\t"+ objproducto.getIdentificador());
        System.out.println("La Cantidad del producto es :"+"\t"+ objproducto.getCantidad());
        
    System.out.println("El precio del producto es :"+"\t"+ objproducto.getPrecio());
    }  
       
        
        
        
        
        
       
}

