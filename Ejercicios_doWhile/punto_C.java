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
public class punto_C {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n;
        int c=0;
        int p=1;
        do{
            //pide los datos//
            System.out.println("Escriba un numero");
            n=sc.nextInt();
            c++;
            p*=n;
        }while(c<5); //imprime el promedio de los numeros//
        System.out.println("El producto de los numeros es "+p);
    }
    
}
