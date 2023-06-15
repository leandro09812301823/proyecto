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
public class punto_H {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        //se pide la edad//
        System.out.println("Introduzca la edad");
        int edad= sc.nextInt();
        
        //imprimimos la etapa de vida segun la edad escrita//
        if ((edad>=0) && (edad<=3)) {
            System.out.println("Es un bebe");
        }else if ((edad>=4) && (edad<=11)) {
            System.out.println("Es un nino");
        }else if ((edad>=12) && (edad<=17)){
            System.out.println("Es un adolescente");
        }else if ((edad>=18) && (edad<=29)){
            System.out.println("Es un adulto joven");
        }else if ((edad>=30) && (edad<=64)){
            System.out.println("Es un adulto");
        }else if (edad>65){
            System.out.println("Es un adulto mayor");
    
        }
         
    }
    
}
