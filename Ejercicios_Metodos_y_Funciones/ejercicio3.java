/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Metodos_y_Funciones;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class ejercicio3 {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args){

        ejercicio3 fP=new ejercicio3();
        
        fP.menu();
        
    }
    //procedimiento para abrir menu//
    void menu(){
        System.out.println("Escriba 2 cantidades");
                int n=sc.nextInt();
                int n1=sc.nextInt();
        System.out.println("Escoja el tipo de operacion a realizar"
                + "\n 1. Suma"
                + "\n 2. resta"
                + "\n 3. multiplicacion"
                + "\n 4. division");
        int op=sc.nextInt();
        switch (op){
            case 1:
                System.out.println("El resultado de la suma es de "+suma(n, n1));
                break;
            case 2:
                System.out.println("El resultado de la resta es de "+resta(n, n1));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es de "+multiplicacion(n, n1));
                break;
            case 4:
                System.out.println("El resultado de la division es de "+division(n, n1));
                break;
        }
    }
    
    //funciones con las operaciones//
    public static double suma(int num, int num1){
        double sum=num+num1;
        return sum;
    }
    
    public static double resta(int num, int num1){
        double rest=num-num1;
        return rest;
    }
    
    public static double multiplicacion(int num, int num1){
        double mult=num*num1;
        return mult;
    }
    
    public static double division(int num, int num1){
        double div=num/num1;
        return div;
    }
}
