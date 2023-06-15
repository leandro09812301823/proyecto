/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class bit {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       int caracter;//variable para recabar bit por bit cada dato//
       FileInputStream lectura;//variable de tipo fileInputStream//
       FileOutputStream escritura;//variable de tipo fileOutputStream//
       
       //crear objetos de cada flujo
       lectura=new FileInputStream("ejemplo.txt");
       escritura=new FileOutputStream("cop_ejemplo.txt");
       
       caracter=lectura.read();//lee bit por bit//
       
       while(caracter!=-1){
           escritura.write(caracter);//se escribe el valor en el archivo//
           System.out.println((char)caracter);//casteo para cambiar valor//
           caracter=lectura.read();
       }
        System.out.println("\n Ya se realizo la copia del archivo");
        JOptionPane.showMessageDialog(null, "Ya se realizo la copia del archivo" );
        lectura.close();
        escritura.close();
    }
}