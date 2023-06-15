/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author CTPG
 */
public class DATOS {
    public static void main(String[] args) {
        //Declaracion de variables 
        Scanner sc = new Scanner(System.in);
        String nom;
        int cantidad;
        
        //nombre y cantidad de articulos
        System.out.println("¿Cual es su nombre?");
        nom=sc.nextLine();
        System.out.println("¿Cual es el total de productos que compro?");
        cantidad=sc.nextInt();
        
        //Declaracion de los arreglos
        String arrayArticulo[]=new String[cantidad];
        double arrayValor[]=new double[cantidad];
        
            //pide el nombre y precio de los articulos
        System.out.println("Ingrese el nombre y precio de los "+cantidad+" productos que compro");
        for(int i=0;i<cantidad;i++){
            System.out.println("Producto "+(i+1));
            System.out.print("Nombre: ");
            arrayArticulo[i]=sc.next();
            System.out.print("Precio: ");
            arrayValor[i]=sc.nextDouble(); 
        }    
        
        //Obtener la fecha actual
        Date fechaActual = new Date();
        
        //cambia fecha
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada= formatoFecha.format(fechaActual);  
        
        //Imprimimos por consola la factura
        System.out.println("\n\nFactura del "+fechaFormateada);
        System.out.println("Cliente: "+nom);
        System.out.println("Productos            Precios");
        
        //for para imprimir el arreglo
        for(int i=0;i<arrayValor.length & i<arrayArticulo.length;i++){
            System.out.println(arrayArticulo[i]+"               "+arrayValor[i]);
        }    
        System.out.println("            --------------");
        System.out.println("SUBTOTAL:               "+Ejercicio4.sTotal(arrayValor));
        System.out.println("IVA:                    "+Ejercicio4.iva(arrayValor));
        System.out.println("            --------------");
        System.out.println("TOTAL:                  "+Ejercicio4.ValorT(arrayValor));
        
    }
}   

