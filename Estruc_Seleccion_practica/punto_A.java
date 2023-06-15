/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estruc_Seleccion_practica;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class punto_A {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        //Declaramos las variables//
        int n1;
        int n2;
        
        //imprimimos las ordenes en pantalla//
        System.out.println("Escriba un numero");
        n1=sc.nextInt();
        System.out.println("Escriba otro numero");
        n2=sc.nextInt();
       
        //sumamos los dos numeros//
        int suma=(n1+n2);
            System.out.println("La suma de los dos numeros es de "+suma);
            
        //Escribimos la estructura del if//
        //imprimimos cual numero es mayor o si son iguales//
        if (n1>n2){
        System.out.println("El primer numero es mayor");
        }else if (n1<n2){
        System.out.println("El segundo numero es mayor");
        }else if (n1==n2){
        System.out.println("Los numeros son iguales"); 
        
        }
    }
    
}
