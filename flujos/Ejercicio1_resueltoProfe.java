/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujos;

import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author CTPG
 */
public class Ejercicio1_resueltoProfe {
    public static void main(String[] args) throws IOException{
        final String ruta="";
        String linea="";
        
        try (FileReader fr=new FileReader(ruta)){
            int dato=fr.read();
            while (dato!=-1){
                if (dato!=32){
                    linea=linea+(char)dato;
                }
                dato=fr.read();
            }
            JOptionPane.showMessageDialog(null, linea);
        }catch (IOException e){
            System.out.println("Error"+e);
        }
        
        
    }
}
