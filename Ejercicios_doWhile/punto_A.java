/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_doWhile;

/**
 *
 * @author Leandro
 */
public class punto_A {
    public static void main(String[] args) {
        //declaramos e inicializamos las variables//
        int i=1;
        int sum=0;
        
        //suma los numeros impares del 1 al 12//
        do{
            if(i%2==1){
                sum+=i;
                i=i+2;
            } 
        }while(i <=12);
        System.out.println(sum);
    }
    
}
