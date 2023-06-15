/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Leandro
 */
public class Ejercicio4 {
    public static void main(String[] args) throws FileFoundException, IOException {
        int c;
        //declaracion de variables//
        FileInputStream leer;
        FileOutputStream copia;
        
        //lee el contenido y crea una copia del archivo//
        leer=new FileInputStream("C:\\Users\\CTPG\\Documents\\Ejercicios\\Personal.txt");
        copia=new FileOutputStream("C:\\Users\\CTPG\\Documents\\Ejercicios\\cop_Personal.txt");
        
        c=leer.read();
        
        //imprime el contenido//
        while(c!=-1){
            copia.write(c);
            System.out.print((char)c);
            c=leer.read();
        }
        System.out.println("\nSe realizo un nuevo archivo");
    }
}
