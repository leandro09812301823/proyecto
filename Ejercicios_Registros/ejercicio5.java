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
public class ejercicio5 {
    int edad;
    double peso, estatura;
    String nombre, inicial, genero;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ejercicio5 array[]=new ejercicio5[20];
        //ciclo for//
        for(int i=0;i<array.length;i++){
            array[i]=new ejercicio5();
            System.out.println("\nPersona "+(i+1)+":");
            //pedimos los datos//
            System.out.println("Escriba el nombre de la persona");
            array[i].nombre=sc.next();
            System.out.println("Escriba la inicial del nombre de la persona");
            array[i].inicial=sc.next();
            System.out.println("Escriba la edad de la persona");
            array[i].edad=sc.nextInt();
            System.out.println("Escriba el genero de la persona");
            array[i].genero=sc.next();
            System.out.println("Escriba la estatura de la persona");
            array[i].estatura=sc.nextDouble();
            System.out.println("Escriba el peso de la persona");
            array[i].peso=sc.nextDouble();
        }
        //ciclo for//
        for(ejercicio5 datos:array){
            System.out.print("Nombre: "+datos.nombre);
            System.out.print("Inicial: "+datos.inicial);
            System.out.print("Edad: "+datos.edad);
            System.out.print("Genero: "+datos.genero);
            System.out.print("Estatura: "+datos.estatura);
            System.out.print("Peso: "+datos.peso);
            
        }
    }
}
