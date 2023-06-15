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
public class punto_B {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //declaramos las variables//
        int n1;
        
        System.out.println("Escriba un numero cualquiera");
        n1=sc.nextInt();
        
        if ((n1%2)==0){
        System.out.println("El numero es par");
        }else if ((n1%2)!=0) {
        System.out.println("El numero es impar");
    }
        double mult= (n1*2);
        System.out.println("El doble del numero es "+mult);
    }
}
