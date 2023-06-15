/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Ejercicio3 {
            Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Ejercicio3 fP=new Ejercicio3();        
        
        //pide la ruta del archivo y el contenido para mostrarlo en pantalla//
        BufferedReader lectura=new BufferedReader(new StringReader(fP.contenido()));
        BufferedWriter escritura=new BufferedWriter(new FileWriter(fP.ruta()));

        //declaracion  de variables//
        String linea;
        
        while((linea=lectura.readLine())!=null){
            escritura.write(linea);
            
            System.out.println(linea.toUpperCase());
        }
        
        //cierra los flujos//
        lectura.close();
        escritura.close();
        
        //pide los datos//
    }
    String ruta(){
        System.out.println("Escriba la ruta del archivo");
        String ruta=sc.nextLine();
        return ruta;     
    }
    String contenido(){
        System.out.println("Escriba el contenido del archivo");
        String fichero=sc.nextLine();
        return fichero;
    }
          
}
