/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class Ejercicio2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //muestra contenido sobre los flujos//
        BufferedReader lectura=new BufferedReader(new FileReader("C:\\Users\\CTPG\\Documents\\Ejercicios\\Binario1.txt"));
        
        //declaracion de variables//
        String linea;
        
        while((linea=lectura.readLine())!=null){
            System.out.println(linea.toUpperCase());
        }
        //cierre de los flujos//
        lectura.close();
    }
    
}
