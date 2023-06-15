/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_estructuras;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        //pide los datos//
        System.out.println("Escriba dos numeros");
        int n=sc.nextInt();
        int n1=sc.nextInt();
        //imprime si son amigos o no dependiendo del dato introducido
    if ((n<0)&&(n1<0)){
        System.out.println("No son amigos");
    }else if ((n>=0)&&(n1>=0)){
        //suma los numeros y los divide entre 3//
          int op=((n+n1)%3);
          if (op==0){
                System.out.println("Son amigos");
          }else{
              System.out.println("No son amigos");
          }
          
        }
    }
    
}
