/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_while;

/**--------
 *
 * @author Leandro
 */
import java.util.Scanner;
public class punto_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        //declaramos e inicializamos las variables//
        int suma=0;
        int total=0;
        double promedio;
        int n;
  
        System.out.println("Escriba un numero"); //pide un numero//
        n=sc.nextInt(); 
        suma+=n;
        total++;
        while(n!=0){
            
        System.out.println("Escriba un numero");
        n=sc.nextInt();
        suma+=n;
        total++;
        }
        //imprime los datos dependiendo de los numeros escritos//
        System.out.println("La suma de los numeros escritos es de "+suma);
        System.out.println("el total de numeros escritos es de "+total);
        promedio= suma/total;
        System.out.println("El promedio de los numeros escritos es "+promedio);
            
        }
        
        
        
    }
    
