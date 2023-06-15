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
public class punto_D {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        //pedimos los datos requeridos//
        System.out.println("Inserte la nota obtenida");
        int nota=sc.nextInt();
        
        //imprimimos el resultado dependiendo del dato introducido//
        if ((nota>=85) && (nota<=100)){
            System.out.println("El estudiante obtuvo una A");
        }else if ((nota>=69) && (nota<=84)) {
            System.out.println("El estudiante obtuvo una B");
        }else if (nota<68){
            System.out.println("El estudiante obtuvo una C");
        }   
    }
    
}
