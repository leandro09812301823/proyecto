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
public class punto_F {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        //pedimos el dato//
        System.out.println("Escriba el numero de un dia de la semana");
        int dSem=sc.nextInt();
        
        //Se imprime el resultado dependiendo del dia introducido//
        if (dSem==1){
            System.out.println("El dia es Lunes");
        }else if (dSem==2){
            System.out.println("El dia es Martes");
        }else if (dSem==3){
            System.out.println("El dia es Miercoles");
        }else if (dSem==4){
            System.out.println("El dia es Jueves");
        }else if (dSem==5){
            System.out.println("El dia es viernes");
        }else if (dSem==6){
            System.out.println("El dia es Sabado");
        }else if (dSem==7){
            System.out.println("El dia es Domingo");
        }else if (dSem>7){
            System.out.println("El numero introducido no pertenece a ningun dia de la semana");
        }
    }
}
