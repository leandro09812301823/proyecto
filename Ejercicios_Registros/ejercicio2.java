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
public class ejercicio2 {
    int Seg;
    String Nom, Art;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //instancia//
        ejercicio2 cancion=new ejercicio2();
    
        //pide los datos//
        System.out.println("Escriba el nombre de la cancion");
        cancion.Nom=sc.next();
        System.out.println("Escriba el nombre del artista");
        cancion.Art=sc.next();
        System.out.println("Escriba los segundos que dura la cancion");
        cancion.Seg=sc.nextInt();
        
        //imprime los datos
        System.out.print("Cancion: ");System.out.println(cancion.Nom);
        System.out.print("Artista: ");System.out.println(cancion.Art);
        System.out.print("Duracion: ");System.out.println(cancion.Seg);
    }
    
}
