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
public class punto_E {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        //Pedimos el numero de estudiantes requerido//
        System.out.println("Cuantos estudiantes van a asistir a la gira?");
        int nEst= sc.nextInt();
        double monto;
        
        //imprimimos el costo del viaje dependiendo de la cantidad de estudiantes que asisten a la gira//
        if (nEst>=121) {
            System.out.println("El costo por estudiante es de 2500 colones");
            monto=nEst*2500;
            System.out.println("El monto total es de "+monto);
        }else if ((nEst<=120) && (nEst>=60)){
            System.out.println("El costo por estudiante es de 2800 colones");
            monto=nEst*2800;
            System.out.println("El monto total es de "+monto);
        }else if ((nEst>=30) && (nEst<=59)){
            double nEst1= ((2500*0.20)+2500);
            System.out.println("El costo por estudiante es de " +nEst1+" Colones");
            monto=nEst*nEst1;
            System.out.println("El monto total es de "+monto);
        }else if (nEst<=29){
            System.out.println("El costo del viaje es de 550000 colones");
        }
    }
}
