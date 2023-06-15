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
public class ejercicio3_procedimiento {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ejercicio3_procedimiento fP=new ejercicio3_procedimiento();
        
        fP.tablas();
    }
    void tablas(){
        for (int i=1;i<=6;i++)

            for (int i1=1;i1<=10;i1++)
                System.out.println(i+"x"+i1+"="+(i*i1));
        
    }
}
