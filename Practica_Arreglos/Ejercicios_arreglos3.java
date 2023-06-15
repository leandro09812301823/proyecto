/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leandro
 */
public class Ejercicios_arreglos3 {
    public static void main(String[] args) {
        int total=0;
        int prom;
        int arrayNum[]=new int[20];
        
        for(int i=0;i<arrayNum.length;i++){
            arrayNum[i]=i+1;
        }
        for(int i=0;i<arrayNum.length;i++){
            total=+arrayNum[i];
        }
        System.out.println("Estos son los valores almacenados");
        for(int i=0;i<arrayNum.length;i++){
            System.out.println(arrayNum[i]);
        }
        System.out.println("El total es de "+total);
        prom= total/20;
        System.out.println("El total del "+prom);
    }
}
