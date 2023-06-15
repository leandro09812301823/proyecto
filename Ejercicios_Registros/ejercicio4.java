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
public class ejercicio4 {
    int duracion;
    String artista, nombre;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ejercicio4 array[]= new ejercicio4[15];
        //ciclo for//
        for(int i=0;i<array.length;i++){
            array[i]=new ejercicio4();
            System.out.println("\nCancion "+(i+1)+":");
            //pedimos los datos//
            System.out.println("Escriba el nombre de la cancion");
            array[i].nombre=sc.next();
            System.out.println("Escriba el nombre del artista");
            array[i].artista=sc.next();
            System.out.println("Escriba la duracion en segundos");
            array[i].duracion=sc.nextInt();
        }
        //ciclo for//
        for(ejercicio4 datos:array){
            //imprime los datos
            System.out.println("Cancion: "+datos.nombre);
            System.out.println("Artista: "+datos.artista);
            System.out.println("Duracion: "+datos.duracion);
            System.out.println(" ");
        }
        
    }
}
