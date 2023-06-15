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
public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        //declaramos e inicializamos las variables//
        int clave=349;
        int clave2;
        int intentos=0;
        
        //pedimos los datos//
        System.out.println("Escriba su clave para inciar sesion");
        clave2=sc.nextInt();
        //continua el bucle siempre que la variable no sea mayor a 2//
        while(intentos<2){ 
        if((clave2<=999)&&(clave2>=0)){
           if(clave2==clave){
            System.out.println("Acceso autorizado");
            //agrega un valor excedido a la variable para detener el bucle//
            intentos=4;
          }else if (clave2!=clave){
            System.out.println("Acceso denegado");
            //suma valor a la variable para que el bucle pare en un punto//
            intentos++;
            System.out.println("Escriba la clave de nuevo");
            clave2=sc.nextInt();
            }
 
        if (clave2!=clave){
                System.out.println("Ha excedido el numero de intentos");
            }          
            //indica si el dato excede el limite//   
            } else
            System.out.println("Error"); 
            intentos=4;
            } 
        }
    }