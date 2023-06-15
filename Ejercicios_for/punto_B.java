/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_for;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class punto_B {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //declaramos e inicializamos las variables
        int n;
        int lim; 
        int i; 
        int sum=0;
        int p;
        //pide los datos
        System.out.println("Escriba un limite");
        lim=sc.nextInt();
        System.out.println("Escriba un numero");
        n=sc.nextInt();
        //almacena el valor del limite//
        sum+=n;
        for(i=2;i<=lim;i++){
            System.out.println("Escriba un numero");
            int n1=sc.nextInt();
            sum+=n1;
            
            if(n1<n){
                System.out.println("El numero "+n1+" es menor a "+n);//imprime cual es el numero mayor//
                }
            if(i>=lim){
                p=sum/lim;//calcula erl promedio//
                System.out.println("El promedio es de "+p);
            }
        }
    }
}
