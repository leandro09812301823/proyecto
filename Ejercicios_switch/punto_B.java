/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_switch;

/**
 *
 * @author CTPG
 */
import java.util.Scanner;
public class punto_B {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        //pide el dato//
        System.out.println("Escriba un numero del 1 al 12");
        
        //imprime el mes dependiendo del numero escrito//
        int op=sc.nextInt();
        switch (op){
            case 1:
                System.out.println("El numero pertenece al mes de enero");
                break;
            case 2:
                System.out.println("El numero pertenece al mes de febrero");
                break;
            case 3:
                System.out.println("El numero pertenece al mes de marzo");
                break;
            case 4:
                System.out.println("El numero pertenece al mes de abril");
                break;
            case 5:
                System.out.println("El numero pertenece al mes de mayo");
                break;
            case 6:
                System.out.println("El numero pertenece al mes de junio");
                break;
            case 7:
                System.out.println("El numero pertenece al mes de julio");
                break;
            case 8:
                System.out.println("El numero pertenece al mes de agosto");
                break;
            case 9:
                System.out.println("El numero pertenece al mes de septiembre");
                break;
            case 10:
                System.out.println("El numero pertenece al mes de octubre");
                break;
            case 11:
                System.out.println("El numero pertenece al mes de noviembre");
                break;
            case 12:
                System.out.println("El numero pertenece al mes de diciembre");
                break;
        }
        
    }
}
