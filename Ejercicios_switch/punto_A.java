/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_switch;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class punto_A {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        //pide los datos
        System.out.println("Escriba dos numeros");
        int n=sc.nextInt();
        int n1=sc.nextInt();
        
        //insertamos un menu con las opciones de las operaciones//
        System.out.println("Seleccione una operacion"
                + "\n 1. Suma"
                + "\n 2. Resta"
                + "\n 3. Multiplicacion"
                + "\n 4. Division"
                + "\n 5. Promedio");
        
        //imprimimos la operacion segun la opcion escogida//
        int op=sc.nextInt();
        switch (op){
            case 1:
                double sum=(n+n1);
                System.out.println("El resultado de la suma es de "+sum);
                break;
            case 2: 
                double rest=(n-n1);
                System.out.println("El resultado de la resta es de "+rest);
                break;
            case 3:
                double mult=(n*n1);
                System.out.println("El resultado de la multiplicacion es de "+mult);
                break;
            case 4: 
                double div=(n/n1);
                System.out.println("El resultado de la division es de "+div);
                break;
            case 5:
                double prom=((n+n1)/2);
                break;
        }
        
    }
    
}
