/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author CTPG
 */
public class ejemplo1 {
    public static void main(String[] args) throws FileNotFoundException {
        
        //creamos un archivo como flujo//
        System.setOut(new PrintStream(new FileOutputStream("prueba.txt")));
        System.out.println("Archivo de prueba");
        for (int i=0; i<=15; i+=2){
            System.out.println(i);
        }
        
    }
}
