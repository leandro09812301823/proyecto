/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Leandro
 */
public class caracteres {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //inicio de flujos(declaracion e inicializacion)creacion de objetos//
        BufferedReader lectura=new BufferedReader(new FileReader("ejemplo.txt"));
        BufferedWriter escritura=new BufferedWriter(new FileWriter("copia ej.txt"));
        PrintWriter escritura2=new PrintWriter(new FileWriter("copiaEje2.txt"));
        
        String linea;
        
        while((linea=lectura.readLine())!=null){
            //usando BufferedReader escribir//
            escritura.write(linea);
            
            //usando PrintWriter escribir
            escritura2.println(linea);
            
            //usando consola escribir
            System.out.println(linea.toUpperCase());
        }
        
        //cierre de cada flujo, se deben cerrar todos y cada uno//
        lectura.close();
        escritura.close();
        escritura2.close();
    }
}
