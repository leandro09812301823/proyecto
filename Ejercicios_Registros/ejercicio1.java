   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Registros;

/**
 *
 * @author Leandro
 */
public class ejercicio1 {
    String tipo, marca, modelo, cilindraje, capacidad;
    
    public static void main(String[] args) {
    //instancia//
    ejercicio1 carro=new ejercicio1();
    
    //llenado del objeto del registro//
    carro.tipo="Superdeportivo";
    carro.marca="Pagani";
    carro.modelo="Pagani Huayra";
    carro.cilindraje="5980 cm3";
    carro.capacidad="85 litros";
    
        System.out.print("Tipo: ");System.out.println(carro.tipo);
        System.out.print("Marca: ");System.out.println(carro.marca);
        System.out.print("Modelo: ");System.out.println(carro.modelo);
        System.out.print("Cilindraje: ");System.out.println(carro.cilindraje);
        System.out.print("Capacidad: ");System.out.println(carro.capacidad);
    }
}
