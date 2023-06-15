/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_estructuras;

/**
 *
 * @author Leandro
 * 
 */
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        double notaExamen;
        double notaProyecto;
        double notaTareas;
        boolean radioAsistencia;
        
        System.out.println("Escriba su porcentaje de examen");
        notaExamen=sc.nextInt();
        if (notaExamen>60){
            System.out.println("El maximo de porcentaje es de 60");
        }
        
        System.out.println("Escriba su porcentaje de proyecto");
        notaProyecto=sc.nextInt();
        if (notaProyecto>30){
            System.out.println("El maximo porcentaje es de 30");
        }
        
        System.out.println("Escriba su porcentaje de tareas");
        notaTareas=sc.nextInt();
        if (notaTareas>10){
            System.out.println("El maximo de porcentaje es de 10");
        }
        System.out.println("Cumple con la asistencia minima?"
                + "\n true(si) false(no)");
        
        radioAsistencia=sc.nextBoolean();
        double sum=(notaExamen+notaProyecto+notaTareas);
        if ((sum<50)&&(radioAsistencia==false)){
            System.out.println("Usted no aprobo");
        }else{
            System.out.println("Usted aprobo");
        }
        
    }
    
}
