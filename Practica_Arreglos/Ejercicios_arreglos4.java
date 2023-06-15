/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leandro
 */
public class Ejercicios_arreglos4 {
    public static void main(String[] args) {
        int total=0;
        int prom;
        int arrayVal[]=new int[40];
        for(int i=0;i<arrayVal.length;i++){
        arrayVal[i]=(int)(Math.random()*40);
        }
        
        for(int i=0;i<arrayVal.length;i++){
            total+=arrayVal[i];
            System.out.println(total);
        }
        
    }
}
