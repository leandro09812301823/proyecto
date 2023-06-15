
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leandro
 */
public class Ejercicios_arreglos1 {
    public static void main(String[] args) {
        
        //arreglo para almacenar nombres de frutas//
        String [] frutas=new String[9]; //corchetes//
        
        //llenar arreglo//
        frutas[0]="Manzana";
        frutas[1]="Mango";
        frutas[2]="Pera";
        frutas[3]="Durazno";
        frutas[4]="Fresa";
        frutas[5]="Sandia";
        frutas[6]="Papaya";
        frutas[7]="Yuplon";
        frutas[8]="Naranja";
        
        for(int i=0;i<frutas.length;i++){
            System.out.println(frutas[i]);
        }
        //la dimension es unidimensional //
        //el indice es de 9//
        //almacena String//
        //es unidimensional//
        
    }
}
