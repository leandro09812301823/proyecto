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
public class Ejercicio1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader lectura=new BufferedReader(new FileReader("C:\\Users\\CTPG\\Documents\\Ejercicios\\ABC.txt"));
        
        String linea;
        char character=(char) 32;
        String caracter=Character.toString(character);
        
        while((linea=lectura.readLine())!=null){//bucle while//
            JOptionPane.showMessageDialog(null, linea.replaceAll(caracter,""));//lee el contenido del archivo//
        }
        lectura.close();
    }
}
