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
public class ejercicio5 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
    ejercicio5 fP=new ejercicio5();//instancia de la clase
    
    //pedimos los datos//
    System.out.println("Escriba el nombre del usuario");
    String nom=sc.next();
    System.out.println("Escriba 3 numeros");
    float n=sc.nextFloat();
    float n1=sc.nextFloat();
    float n2=sc.nextFloat();
    
    //imprime el resultado de la suma y un saludo para el usuario//
    fP.saludo(nom);
    System.out.println("El resultado de la suma es de "
                + ""+fP.sumatoria(n,n1,n2));
    }
    void saludo(String nombre){
       System.out.println("Hola "+nombre);
        
        
    }
            
    public static double sumatoria(float n, float n1 , float n2){
        double sum=(n+n1+n2);
        double sum1=(sum*sum);
        return sum1;
    }
}
