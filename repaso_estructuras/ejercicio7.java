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
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int min;
        int max;
        int num;
        int val=0;
        int fIntervalo=0;
        
        System.out.println("Escriba un valor minimo");
        min=sc.nextInt();
        System.out.println("Escriba un valor maximo");
        max=sc.nextInt();
        
        if (min>max){
            do{
            System.out.println("Escriba de nuevo el valor minimo");
            min=sc.nextInt();
            System.out.println("Escriba de nuevo el valor maximo");
            max=sc.nextInt();
            
        }while(min>max);
        
      }
        do{
            System.out.println("Escriba un numero");
            num=sc.nextInt();
            
            if ((num>=min)&&(num<=max)){
                val+=num;
            }else{
                fIntervalo++;
                }
        }while(num!=0);
                
                System.out.println("La suma de los numeros digitados dentro del intervalo es "+val);
                System.out.println("La cantidad de numeros fuera del intervalo es de "+fIntervalo);
    }     
}
    

