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
public class punto_G {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        //pedimos los 3 numeros//
        System.out.println("Escriba 3 numeros diferentes");
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        //imprimimos el mayor//
        if ((n>n1) && (n>n2)){
            System.out.println("el numero mayor es "+n);
        }else if ((n1>n) && (n1>n2)){
            System.out.println("el numero mayor es "+n1);
        }else if ((n2>n1) && (n2>n1)){
            System.out.println("el numero mayor es "+n2);
        }
    }
    
}
