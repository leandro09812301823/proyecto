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
public class ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //se pide el dato//
        System.out.println("Escriba la distancia que va a viajar");
        int distancia=sc.nextInt();
        
        //averigua el precio del pasaje segun los kilometros a viajar//
        if (distancia<=150){
            System.out.println("El precio del pasaje es de 500 colones");
        }else if ((distancia>150)&&(distancia<=250)){
            int op=(distancia-150);
            double op1=((op*5)+500);
            System.out.println("El precio del pasaje es de "+op1+" colones");
        }else if (distancia>=250) {
            double desc=(500-(distancia*0.15));
            System.out.println("El precio del pasaje es de "+desc+" colones");
        }
        
    }
    
}
