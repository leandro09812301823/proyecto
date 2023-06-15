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
public class punto_C {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //pedimos los datos//
        System.out.println("Inserte el precio del kilo");
        int kilo=sc.nextInt();
        
        //colocamos un menu con las opciones de sandias//
        System.out.println("De cual tipo de sandia desea realizar su compra"
                + "\n 1. Ketsali de buena calidad"
                + "\n 2. Ketsali de excelente calidad"
                + "\n 3. Lavon de buena calidad"
                + "\n 4. Lavon de excelente calidad"
                + "\n    Indique un numero");
        
        //calculamos el precio del kilo dependiendo de la opcion escogida//
        int op=sc.nextInt();
        switch (op){
            case 1:
                double kilo1= ((kilo*0.20)+ kilo);
                System.out.println("El precio del kilo es de "+kilo1+" colones");
                break;
            case 2:
                double kilo2= ((kilo*0.40)+ kilo);
                System.out.println("El precio del kilo es de "+kilo2+" colones");
                break;
            case 3:
                double kilo3= ((kilo*0.15)+ kilo);
                System.out.println("El precio del kilo es de "+kilo3+" colones");
                break;
            case 4:
                double kilo4= ((kilo*0.45)+ kilo);
                System.out.println("el precio del kilo es de "+kilo4+" colones");
            
        }
    }
    
}
