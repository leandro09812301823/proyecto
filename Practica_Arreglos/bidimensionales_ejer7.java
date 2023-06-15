
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leandro
 */
public class bidimensionales_ejer7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [][]golosinas=new String[7][2];
        
        for(int i=0;i<7;i++){      
            System.out.println("Escriba el nombre de la golosina");
            golosinas[i][0]=sc.next();
             System.out.println("Escriba el precio de la golosina");
            golosinas[i][1]=sc.next();
            }
        
    for(int i=0;i<7;i++){
            System.out.println(golosinas[i][0]+"  "+golosinas[i][1]);
        
        }
    }
            
}

