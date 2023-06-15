/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */

public class Ejercicio4 {
    //constante para el iva
    public static final double IVA=13;
    //calcula el subtotal
    public static double sTotal(double array[]){
        double sTotal = 0;
        for(int i=0;i<array.length;i++){
            sTotal= sTotal + array[i];
        }
        return sTotal;
    }
    //Funcion para calcular el valor del IVA
    public static double iva(double array[]){
        double pIVA;
        pIVA = sTotal(array)*(IVA/100);
        return pIVA;
    }
    
    //Funcion para calcular el total
    public static double ValorT(double array[]){
        double total;
        total= sTotal(array)+iva(array);
        return total;
    }
}
    
