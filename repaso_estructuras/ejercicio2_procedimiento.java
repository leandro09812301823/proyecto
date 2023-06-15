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
public class ejercicio2_procedimiento {
    
    static final double Pasaje=500;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ejercicio2_procedimiento fP=new ejercicio2_procedimiento();
        System.out.println("Escriba la cantidad de kilometros");
        int km=sc.nextInt();
        fP.viaje(km);
    }
    void viaje(int km){
        
        if (km<=150){
            System.out.println("El precio del pasaje es de "+Pasaje);  
        }else if((km>150)&&(km<=250)){   
            int pPas=(km-150);
            double pPas1=((pPas*5)+Pasaje);
            System.out.println("El precio del pasaje es de "+pPas1);     
        }else if(km>=250){
            double pDesc=(Pasaje-(Pasaje*0.15));
            System.out.println("El precio del pasaje es de "+pDesc);   
        }
    }
}
