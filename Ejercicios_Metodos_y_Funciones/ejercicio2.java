/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Metodos_y_Funciones;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class ejercicio2 {
    static final String nom="Leandro"; //valores fijos//
    static final String clave="0101";
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ejercicio2 fP=new ejercicio2();//instancia de la clase
        
      fP.login();
    }
    void login(){ //concede el acceso si los datos introducidos son los correctos//
        System.out.println("Escriba su nombre");
        String nom=sc.next();
        System.out.println("Escriba su clave");
        String clave=sc.next();
        if ((nom.equals("Leandro"))&&(clave.equals("0101"))){
            System.out.println("Acceso correcto");
        }else{
            System.out.println("Acceso denegado");
            
            
        }
        
        
        
        
    }
    
    
}
