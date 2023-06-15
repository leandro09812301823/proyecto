/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Registros;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class ejercicio3 {
    int edad;
    double peso, estatura;
    String nombre, inicial, genero;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //instancia//
        ejercicio3 datos=new ejercicio3();
        
        //pide los datos//
        System.out.println("Escriba su nombre");
        datos.nombre=sc.next();
        System.out.println("Escriba la inicial de su nombre");
        datos.inicial=sc.next();
        System.out.println("Escriba su edad");
        datos.edad=sc.nextInt();
        System.out.println("Escriba su genero");
        datos.genero=sc.next();
        System.out.println("Escriba su estatura");
        datos.estatura=sc.nextDouble();
        System.out.println("Escriba su peso");
        datos.peso=sc.nextDouble();
        
        //imprime los datos//
        System.out.print("Nombre: ");System.out.println(datos.nombre);
        System.out.print("Inicial: ");System.out.println(datos.inicial);
        System.out.print("Edad: ");System.out.println(datos.edad);
        System.out.print("Genero: ");System.out.println(datos.genero);
        System.out.print("Estatura: ");System.out.println(datos.estatura);
        System.out.print("Peso: ");System.out.println(datos.peso);
        
        ejercicio3 datos1=new ejercicio3();
        
        //pide los datos//
        System.out.println("Escriba su nombre");
        datos.nombre=sc.next();
        System.out.println("Escriba la inicial de su nombre");
        datos.inicial=sc.next();
        System.out.println("Escriba su edad");
        datos.edad=sc.nextInt();
        System.out.println("Escriba su genero");
        datos.genero=sc.next();
        System.out.println("Escriba su estatura");
        datos.estatura=sc.nextDouble();
        System.out.println("Escriba su peso");
        datos.peso=sc.nextDouble();
        
        //imprime los datos//
        System.out.print("Nombre: ");System.out.println(datos.nombre);
        System.out.print("Inicial: ");System.out.println(datos.inicial);
        System.out.print("Edad: ");System.out.println(datos.edad);
        System.out.print("Genero: ");System.out.println(datos.genero);
        System.out.print("Estatura: ");System.out.println(datos.estatura);
        System.out.print("Peso: ");System.out.println(datos.peso);
    }
    
}
