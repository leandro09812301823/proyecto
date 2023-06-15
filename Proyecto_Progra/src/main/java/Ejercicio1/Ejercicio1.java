/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Leandro
 */
import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main(String[] args) {
        String ced, nom, genero;
        int cant=0, salario=0, horas=0;
        
        for(int i=0;i<7;i++){
        cant++;
        nom=JOptionPane.showInputDialog("Escriba el nombre del trabajador "+cant+":");
        nom=JOptionPane.showInputDialog("Escriba el numero de cedula de la persona "+cant+":");
        nom=JOptionPane.showInputDialog("Escriba el genero del trabajador "+cant+":");
        salario=Integer.parseInt(JOptionPane.showInputDialog("Escriba el salario del trabajador "+cant+":"));
        if(salario==0){
            JOptionPane.showMessageDialog(null, "El valor esta en 0");
        }
        horas=Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de horas extras del trabajador "+cant+":"));
        if(horas==0){
            JOptionPane.showMessageDialog(null, "El valor esta en 0");
        
        }
        
      }
        
   }
}
