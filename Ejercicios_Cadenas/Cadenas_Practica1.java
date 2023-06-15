/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Cadenas;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Cadenas_Practica1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //punto 1//
        String cad= "Al mal paso darle prisa";
        System.out.println(cad);
        
        //punto 2//
        System.out.println("Escriba el contenido de la cadena");
        String cad1=sc.next();
        System.out.println(cad1);
        
        //punto 3//
        System.out.println("el largo de la cadena 1 es de "+cad.length()+" caracteres");
        System.out.println("el largo de la cadena 2 es de "+cad1.length()+" caracteres");
        
        //punto 4//
        System.out.println(cad.toUpperCase());
        
        //punto 5//
        System.out.println(cad1.toLowerCase());
        
        //punto 6//
        char cadena1=cad.charAt(3);
        System.out.println(cadena1);
        char cadena2=cad1.charAt(1);
        System.out.println(cadena2);
        
        //punto 7//
        String cad3=cad.concat(cad1);
        System.out.println(cad3);
        
        //punto 8//
        String cd1=cad.substring(4, 9);
        System.out.println(cd1);
        
        //punto 9//
        String Cd1=cad.substring(7);
        System.out.println(Cd1);
        
        //punto 10//
        if (cad1.endsWith("amor")){
            System.out.println("La cadena si finaliza con amor");
        }else{
            System.out.println("La cadena no finaliza con amor");
        }
        
        //punto 11//
            System.out.println(cad.replace("a", "u"));
        
        //punto 12//
            if (cad.equals(cad1)){
                System.out.println("Las cadenas son iguales");
            }else{
                System.out.println("Las cadenas son distintas");
            }
            
        //punto 13//
                char arreglo[]=cad1.toCharArray();
                for(int m=0;m<arreglo.length;m++){
                System.out.println(arreglo[m]);
       }
        //punto 14//
                System.out.println(cad.trim());
    }
}
