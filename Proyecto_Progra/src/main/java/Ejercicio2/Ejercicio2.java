/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0, mult=1, val, total=0, total1=0;//declaramos e inicializamos variables//
        
        //pide los datos//
        System.out.println("Escriba el numero de columnas");
        int columnas=sc.nextInt();
        //arreglo para meter los numeros//
        int arrayVal[]=new int[columnas];

        for(int i=0;i<arrayVal.length;i++){
        //pide los datos//
        System.out.println("Escriba el valor a introducir");
        val=sc.nextInt();
        arrayVal[i]=val;
        sum+=arrayVal[i];
        mult*=arrayVal[i];
        }
        
        //ciclo para imprimir los resultados//
        for(int i=0;i<1;i++){
         total+=sum;
         total1+=mult;
            System.out.println("El total de la suma es de "+total+" y el total de la multiplicacion es de "+total1);
        }
        
    }
}