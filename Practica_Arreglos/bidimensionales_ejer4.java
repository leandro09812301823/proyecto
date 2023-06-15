
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
public class bidimensionales_ejer4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba el numero de columnas");
        int columnas=sc.nextInt();
        
        int [][]num=new int[5][columnas];
        
        for(int i=0;i<5;i++){
            System.out.println("  ");
            for(int j=0;j<columnas;j++){
                num[i][j]=((int)(Math.random()*10));
                System.out.print(num[i][j]+"  ");
            }
        }
    }
    
}
