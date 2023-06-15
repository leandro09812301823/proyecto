/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Leandro
 */
public class byte_buffer {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int caracter;
        
        BufferedInputStream lectura=null;
        BufferedOutputStream escritura=null;
        
        //creando objetos de cada flujo de E/S
        lectura=new BufferedInputStream(new FileInputStream("ejemplo.txt"));
        escritura=new BufferedOutputStream(new FileOutputStream("ejemplo2.txt"));
        
        caracter=lectura.read();
        
        //hacer el corrido de ficheros byte por byte hastra llegar al final
        
        while(caracter!=-1){
            escritura.write(caracter);
            caracter=lectura.read();
        }
        System.out.println("El archivo fue copiado exitosamente");
        lectura.close();
        escritura.close();
        
    }
    
}