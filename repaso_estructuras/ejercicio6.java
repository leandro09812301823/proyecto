/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_estructuras;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        //pide los datos
        System.out.println("Escriba dos numeros");
        int n=sc.nextInt();
        int n1=sc.nextInt();
        System.out.println("Los numeros pares son los siguientes");
        //aplica a i el valor de los numeros introducidos//
        for (int i=n;i<=n1;i++){
            //divide los numeros entre 2 para averiguar si son pares//
            if (i%2==0){
                //imprime los numeros pares//
                System.out.println(i);
            }
        }
        
        
    }
    
}
