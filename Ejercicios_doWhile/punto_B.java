/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_doWhile;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class punto_B {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        //declaramos las variables//
        int n;
        int n1;
        
        //repite el proceso siempre que los numeros sean distintos//
        do{
            System.out.println("Escriba un par de numeros");
            n=sc.nextInt();
            n1=sc.nextInt();
        }while(n!=n1);
        System.out.println("Los numeros son iguales");
            
        }
    
}
